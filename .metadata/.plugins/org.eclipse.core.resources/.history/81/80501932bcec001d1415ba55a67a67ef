import java.util.*;

public class XuLy {
	static final int GRAD_CAR_1KM = 8000, GRAD_SUV_1KM = 9000, GRAD_BLACK_1KM = 10000;

	static final int GRAD_CAR_1_19 = 7500, GRAD_SUV_1_19 = 8500, GRAD_BLACK_1_19 = 9500;

	static final int GRAD_CAR_19 = 7000, GRAD_SUV_19 = 8000, GRAD_BLACK_19 = 9000;

	static final int GRAD_CAR_WAIT = 2000, GRAD_SUV_WAIT = 3000, GRAD_BLACK_WAIT = 3500;

	public static float grabCar(float km, int time) {
		float tongTien = 1.0f;
		if (km > 1 && km <= 19) {
			tongTien = time + GRAD_CAR_1KM + (GRAD_CAR_1_19 * (km - 1));
		} else if (km > 19) {
			tongTien = time + GRAD_CAR_1KM + (GRAD_CAR_1_19 * 18) + (GRAD_CAR_19 * (km - 19));
		} else {
			tongTien = time + GRAD_CAR_1KM;
		}
		return tongTien;
	}

	public static float grabSUV(float km, int time) {
		float tongTien = 1.0f;
		if (km > 1 && km <= 19) {
			tongTien = time + GRAD_SUV_1KM + (GRAD_SUV_1_19 * (km - 1));
		} else if (km > 19) {
			tongTien = time + GRAD_SUV_1KM + (GRAD_SUV_1_19 * 18) + (GRAD_SUV_19 * (km - 19));
		} else {
			tongTien = time + GRAD_SUV_1KM;
		}
		return tongTien;
	}

	public static float grabBlack(float km, int time) {
		float tongTien = 1.0f;
		if (km > 1 && km <= 19) {
			tongTien = time + GRAD_BLACK_1KM + (GRAD_BLACK_1_19 * (km - 1));
		} else if (km > 19) {
			tongTien = time + GRAD_BLACK_1KM + (GRAD_BLACK_1_19 * 18) + (GRAD_BLACK_19 * (km - 19));
		} else {
			tongTien = time + GRAD_BLACK_1KM;
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
			wait = tinhTienCho(GRAD_CAR_WAIT, time);
			System.out.println("Tổng tiền Grab Car: " + grabCar(km, wait));
			break;
		case 2:
			wait = tinhTienCho(GRAD_SUV_WAIT, time);
			System.out.println("Tổng tiền Grab SUV: " + grabSUV(km, wait));
			break;
		case 3:
			wait = tinhTienCho(GRAD_BLACK_WAIT, time);
			System.out.println("Tổng tiền Grab SUV: " + grabBlack(km, wait));
			break;
		default:
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chonGrab();
//		Đầu vào: Loại Grab, số KM đi đc và Thời gian chờ

//		Xử lý: switch_case loại Grab 
		// tạo hàm gradCar với tham số đầu vào là kiểu float (time, km)
		// tạo hàm gradSUV với tham số đầu vào là kiểu float (time, km)
		// tạo hàm gradBlack với tham số đầu vào là kiểu float (time, km)
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
