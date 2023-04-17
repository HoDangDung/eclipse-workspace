import java.util.*;

public class XuLy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float GIOI = 8.5f, KHA = 6.5f, TB = 5.0f;
//		Đầu vào: Họ tên, toán, lý, hóa
//
//		Xử lý: Tạo biến hoTen, toan, ly, hoa, diem
//			In thông báo nhập hoTen
//			Cho người dùng nhập và gán vào hoTen
//			In thông báo nhập toan
//			Cho người dùng nhập và gán vào toan
//		In thông báo nhập ly
//			Cho người dùng nhập và gán vào ly
//		In thông báo nhập hoa
//			Cho người dùng nhập và gán vào hoa
//
//			diem = (toan + ly +  hoa) / 3
//			Nếu diem >= 8,5 xếp loại giỏi
//			Nếu diem >= 6,5 xếp loại khá
//			Nếu diem >= 5 xếp loại TB
//			Ngược lại xếp lại Yếu
//
//
//		Đầu ra: Xếp loại theo bảng xếp loại
		Scanner scan = new Scanner(System.in);
		String ten, xepLoai;
		float toan, ly, hoa, diemTB;

		System.out.print("Nhập tên: ");
		ten = scan.nextLine();
		System.out.print("Nhập điểm Toán: ");
		toan = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập điểm Lý: ");
		ly = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập điểm Hóa: ");
		hoa = Float.parseFloat(scan.nextLine());

		diemTB = (toan + ly + hoa) / 3;

		if (diemTB >= GIOI) {
			xepLoai = "Giỏi";
		} else if ((diemTB < GIOI) && (diemTB >= KHA)) {
			xepLoai = "Khá";
		} else if ((diemTB < KHA) && (diemTB >= TB)) {
			xepLoai = "Trung Bình";
		} else {
			xepLoai = "Yếu";
		}
		System.out.print("Điểm TB: " + diemTB + "\t" + "Xếp loại " + xepLoai);
	}

}
