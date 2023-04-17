import java.util.*;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int LH_50 = 50, LH_100 = 100;
		final float DIS_12 = 0.88f, DIS_8 = 0.92f;
//		Đầu vào: Tên, số lượng đơn giá mặt hàng
//
//		Xử lý: Tạo biến name, index, price , payment
//			(gạo, 120, 12000)
//			(gạo, 100, 12000)
//			(gạo, 65, 12000)
//			(gạo, 50, 12000)
//			(gạo, 45, 12000)
//			In thông báo nhập tên mặt hàng
//			Cho người dùng nhập và gán vào biến “name”
//
//			In thông báo nhập số lượng mặt hàng
//			Cho người dùng nhập và gán vào biến “index”
//
//			In thông báo nhập giá mặt hàng
//			Cho người dùng nhập và gán vào biến “price”
//
//			Nếu số lượng >= 100 thì giảm 12%
//			payment = ((index*price) + (price*(index - 100))* 12%) ;
//
//			Nếu 100 > số lượng > 50 thì giảm 8% 
//			payment = ((index*price) + (price*(index - 50))* 8%);
//
//			Nếu số lượng <= 50
//			payment = index * price
//
//		Đầu ra: Tính và xuất tiền phải trả

		Scanner scan = new Scanner(System.in);
		String tenHang;
		int soLuong;
		float donGia, thanhTien;

		System.out.print("Nhập tên hàng hóa: ");
		tenHang = scan.nextLine();

		System.out.print("Nhập số lượng hàng hóa: ");
		soLuong = Integer.parseInt(scan.nextLine());

		System.out.print("Nhập giá mặt hàng: ");
		donGia = Float.parseFloat(scan.nextLine());

//		Xét số lượng
//		if (soLuong >= LH_100) {
//			thanhTien = DIS_12 * (LH_100 * donGia) + (donGia * (soLuong - LH_100));
//		} else {
//			if ((soLuong < LH_100) && (soLuong > LH_50)) {
//				thanhTien =DIS_8* (LH_50 * donGia) + (donGia * (soLuong - LH_50));
//			} else {
//				thanhTien = soLuong * donGia;
//			}
//		}

		if (soLuong >= LH_100) {
			thanhTien = DIS_12 * (LH_100 * donGia) + (donGia * (soLuong - LH_100));
		} else if ((soLuong < LH_100) && (soLuong > LH_50)) {
			thanhTien = DIS_8 * (LH_50 * donGia) + (donGia * (soLuong - LH_50));
		} else {
			thanhTien = soLuong * donGia;
		}
		System.out.println("Tên: " + tenHang + "\t" + "Đơn giá: " + donGia + "\t" + "Thành tiền: " + thanhTien);
	}
}
