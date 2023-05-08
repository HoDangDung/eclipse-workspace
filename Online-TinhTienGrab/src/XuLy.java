import java.util.*;

public class XuLy {
	static final int GRAB_CAR_1KM = 8000, GRAB_SUV_1KM = 9000, GRAB_BLACK_1KM = 10000;

	static final int GRAB_CAR_1_19 = 7500, GRAB_SUV_1_19 = 8500, GRAB_BLACK_1_19 = 9500;

	static final int GRAB_CAR_19 = 7000, GRAB_SUV_19 = 8000, GRAB_BLACK_19 = 9000;

	static final int GRAB_CAR_WAIT = 2000, GRAB_SUV_WAIT = 3000, GRAB_BLACK_WAIT = 3500;

	public static float grabCar(float km, int time) {
		float tongTien = 1.0f;
		if (km > 1 && km <= 19) {
			tongTien = time + GRAB_CAR_1KM + (GRAB_CAR_1_19 * (km - 1));
		} else if (km > 19) {
			tongTien = time + GRAB_CAR_1KM + (GRAB_CAR_1_19 * 18) + (GRAB_CAR_19 * (km - 19));
		} else {
			tongTien = time + GRAB_CAR_1KM;
		}
		return tongTien;
	}

	public static float grabSUV(float km, int time) {
		float tongTien = 1.0f;
		if (km > 1 && km <= 19) {
			tongTien = time + GRAB_SUV_1KM + (GRAB_SUV_1_19 * (km - 1));
		} else if (km > 19) {
			tongTien = time + GRAB_SUV_1KM + (GRAB_SUV_1_19 * 18) + (GRAB_SUV_19 * (km - 19));
		} else {
			tongTien = time + GRAB_SUV_1KM;
		}
		return tongTien;
	}

	public static float grabBlack(float km, int time) {
		float tongTien = 1.0f;
		if (km > 1 && km < 19) {
			tongTien = time + GRAB_BLACK_1KM + (GRAB_BLACK_1_19 * (km - 1));
		} else if (km > 19) {
			tongTien = time + GRAB_BLACK_1KM + (GRAB_BLACK_1_19 * 18) + (GRAB_BLACK_19 * (km - 19));
		} else {
			tongTien = time + GRAB_BLACK_1KM;
		}
		return tongTien;
	}

	public static int tinhTienCho(int loaiGrab, int thoiGianCho) {
		int tien = 0;
		if (thoiGianCho >= 3) {
			tien = loaiGrab * (Math.round((float) thoiGianCho / 3));
		}
		return tien;
	}

	public static float nhapSoKM(Scanner scan) {
		float km;
		System.out.print("Nhập số KM: ");
		km = Float.parseFloat(scan.nextLine());
		return km;
	}

	public static int nhapThoiGianCho(Scanner scan) {
		int time;
		System.out.print("Nhập thời gian chờ: ");
		time = Integer.parseInt(scan.nextLine());
		return time;
	}

	public static void chonGrab() {
		byte loai;
		int wait;
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Grab Car \n2. Grab SUV \n3. Grab Black");
		System.out.print("Vui lòng chọn loại Grab: ");
		loai = Byte.parseByte(scan.nextLine());
		float km = nhapSoKM(scan);
		int time = nhapThoiGianCho(scan);

		switch (loai) {
		case 1:
			wait = tinhTienCho(GRAB_CAR_WAIT, time);
			System.out.println("Tổng tiền Grab Car: " + grabCar(km, wait));
			break;
		case 2:
			wait = tinhTienCho(GRAB_SUV_WAIT, time);
			System.out.println("Tổng tiền Grab SUV: " + grabSUV(km, wait));
			break;
		case 3:
			wait = tinhTienCho(GRAB_BLACK_WAIT, time);
			System.out.println("Tổng tiền Grab SUV: " + grabBlack(km, wait));
			break;
		default:
			break;
		}
		inChiTiet(loai, km, time);
	}

	public static void inDongKm1(int loaiGrab, float soKm) {
		int donGia;
		if (loaiGrab == 1) {
			donGia = GRAB_CAR_1KM;
		} else if (loaiGrab == 2) {
			donGia = GRAB_SUV_1KM;
		} else {
			donGia = GRAB_BLACK_1KM;
		}

		if (soKm < 1) {
			System.out.println("KM ĐẦU TIÊN \t\t" + soKm + "\t\t" + donGia + "\t\t\t" + donGia);
		} else {
			System.out.println("KM ĐẦU TIÊN \t\t" + 1 + "\t\t" + donGia + "\t\t\t" + donGia);
		}
	}

	public static void inDongKm1Den19(int loaiGrab, float soKm) {
		int donGia;
		if (loaiGrab == 1) {
			donGia = GRAB_CAR_1_19;
		} else if (loaiGrab == 2) {
			donGia = GRAB_SUV_1_19;
		} else {
			donGia = GRAB_BLACK_1_19;
		}

		inDongKm1(loaiGrab, soKm);
		if (soKm < 19) {
			System.out.println("Từ 2 đến " + (soKm - 1) + "\t\t" + (soKm - 1) + "\t\t" + donGia + "\t\t\t"
					+ (donGia * (soKm - 1)));
		} else {
			System.out.println("Từ 2 đến " + 18 + "\t\t" + 18 + "\t\t" + donGia + "\t\t\t" + (donGia * 18));
		}
	}

	public static void inDongKm19(int loaiGrab, float soKm) {
		int donGia;
		if (loaiGrab == 1) {
			donGia = GRAB_CAR_19;
		} else if (loaiGrab == 2) {
			donGia = GRAB_SUV_19;
		} else {
			donGia = GRAB_BLACK_19;
		}

		inDongKm1(loaiGrab, soKm);
		inDongKm1Den19(loaiGrab, soKm);
		System.out.println(
				"Từ 19 đến " + soKm + "\t\t" + (soKm - 19) + "\t\t" + donGia + "\t\t\t" + (donGia * (soKm - 19)));
	}

	public static void inThoiGianCho(int loaiGrab, int ThoiGianCho) {
		int donGia;
		if (loaiGrab == 1) {
			donGia = GRAB_CAR_WAIT;
		} else if (loaiGrab == 2) {
			donGia = GRAB_SUV_WAIT;
		} else {
			donGia = GRAB_BLACK_WAIT;
		}
		float tienCho = tinhTienCho(loaiGrab, ThoiGianCho);
		System.out.println("Thời gian chờ \t\t" + ThoiGianCho + "\t\t" + donGia + "\t\t\t" + tienCho);
	}

	public static void inChiTiet(int loaiGrab, float soKm, int thoiGianCho) {
		System.out.println("*********** CHI TIẾT HÓA ĐƠN ************");
		System.out.println("CHI TIẾT \t\t SỬ DỤNG \t ĐƠN GIÁ (1000Đ) \t THÀNH TIỀN (1000Đ)");
		if(soKm < 1) {
			inDongKm1(loaiGrab, soKm);
		}else if(1 < soKm && soKm > 19) {
			inDongKm1Den19(loaiGrab, soKm);
		}else {
			inDongKm19(loaiGrab, soKm);
		}
		inThoiGianCho(loaiGrab, thoiGianCho);
		System.out.println("==========================================");
		System.out.println("\t\t\t\t\t\t\t");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chonGrab();
//		Đầu vào: Loại Grab, số KM đi đc và Thời gian chờ

//		Xử lý: switch_case loại Grab 
		// tạo hàm GRABCar với tham số đầu vào là kiểu float (time, km)
		// tạo hàm GRABSUV với tham số đầu vào là kiểu float (time, km)
		// tạo hàm GRABBlack với tham số đầu vào là kiểu float (time, km)
		// if_else thời gian chờ
		// Nếu time > 3: math.round(time / 3) * loaiGrab
		// if_else số KM
		// Nếu số KM > 1 && KM <= 19: Giá km đầu tiên + (Giá km 1_19 * (số Km - 1))
		// (20km) Nếu số KM > 19: Giá km đầu tiên + Giá km 1_19 * 18 + Giá km 19_n *
		// (sốKm - 19)
		// 8000 + 7500*18 + 7000*(KM_TT - 19)
		// KM * GiaCuoc
		// Tính tổng tiền: hai cái công lại

//		Đầu ra: Tính tổng tiền đi đc
	}

}
