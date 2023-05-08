import java.util.*;

public class QLSV {

	public static float khuVuc(char khuVuc) {
		float diem = 0.0f;
		switch (khuVuc) {
		case 'A':
		case 'a':
			diem = 2;
			break;
		case 'B':
		case 'b':
			diem = 1;
			break;
		case 'C':
		case 'c':
			diem = 0.5f;
			break;
		default:
			break;
		}
		return diem;
	}

	public static float doiTuong(byte doiTuong) {
		float diem = 0.0f;

		switch (doiTuong) {
		case 1:
			diem = 2.5f;
			break;
		case 2:
			diem = 1.5f;
			break;
		case 3:
			diem = 1f;
			break;
		default:
			break;
		}
		return diem;
	}

	public static void tinhDiem(Scanner scan) {
		float tongdiem = 1.0f, toan, ly, hoa;
		boolean flag = true;
		do {
			System.out.print("Nhập điểm Toán: ");
			toan = Float.parseFloat(scan.nextLine());
			System.out.print("Nhập điểm Lý: ");
			ly = Float.parseFloat(scan.nextLine());
			System.out.print("Nhập điểm Hóa: ");
			hoa = Float.parseFloat(scan.nextLine());
			if (toan > 10 || toan < 0 || ly > 10 || ly < 0 || hoa > 10 || hoa < 0) {
				flag = false;
			} else {
				flag = true;
			}
		} while (!flag);

		System.out.print("Chọn đối tượng (0 | 1 | 2 | 3): ");
		byte doiTuong = Byte.parseByte(scan.nextLine());

		System.out.print("Chọn khu vực (X | A | B | C): ");
		char khuVuc = scan.next().charAt(0);

		tongdiem = ((toan + ly + hoa) / 3) + khuVuc(khuVuc) + doiTuong(doiTuong);

		System.out.println("************* Kết quả ********************");
		System.out.println("Đối tượng " + doiTuong + " điểm: " + doiTuong(doiTuong));
		System.out.println("Khu vực " + khuVuc + " điểm: " + khuVuc(khuVuc));
		System.out.println("Tổng điểm: " + tongdiem);
		if (toan == 0 || ly == 0 || hoa == 0) {
			System.out.println("Rớt vì có môn thi điểm bằng 0");
		} else {
			if (tongdiem >= 5) {
				System.out.println("Đậu");
			} else {
				System.out.println("Rớt vì tổng điểm " + tongdiem + " < 5");
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Đầu vào: điểm của 3 môn thi, khu vực và đối tượng dự thi
//
//		Xử lý: Viết hàm chọn khu vực
//		 	Viết hàm chọn đối tượng
//		Viết hàm tính điểm 3 môn thi kiểu float
//		Cho người dùng nhập điểm 3 môn
//		Tổng điểm: điểm 3 môn + khu vực + đối tượng
//		Kiểm tra nếu có môn học = 0 -> rớt
//		Kiểm tra nếu tổng điểm 5 -> rớt
		
//		Đầu ra: Thông báo kết quả và tổng số điểm đạt đc

		Scanner scan = new Scanner(System.in);
		tinhDiem(scan);
	}

}
