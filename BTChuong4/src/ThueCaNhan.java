import java.util.*;

public class ThueCaNhan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Đầu vào: Họ tên, tổng thu nhập năm, số người phụ thuộc

		// Xử lý:
		// Tạo hàm nhập thông tin cá nhân
		// Tạo hàm kiểm tra dữ liệu nhập vào:
		// + Tổng thu nhập năm > 0
		// + Số người phụ thuộc > 0
		// + Not null Họ tên
		// Tạo hàm tính Thu nhập chịu thuế:
		// - Thu nhập chịu thuế = tổng thu nhập năm - 4tr - Số người phụ thuộc * 1.6tr

		// Đầu ra: Thuế thu thập cá nhân

//		Dummy data: 
//		+ Thu nhập chịu thuế: 133 (triệu) - 4 (triệu) - 6 * 1.6 (triệu) = 120 (triệu) 10%
//		+ Thu nhập chịu thuế: 120 (triệu) - 4 (triệu) - 6 * 1.6 (triệu) = 106.4 (triệu) 15%

		Scanner scan = new Scanner(System.in);
		thongTinCaNhan(scan);
	}

	public static void thongTinCaNhan(Scanner scan) {
		String name = "";
		float thuNhap = 1.0f;
		byte soNguoiPhuThuoc;
		boolean flag = true;

		do {
			System.out.print("Nhập họ tên: ");
			name = scan.nextLine();

			System.out.print("Nhập tổng thu nhập năm (triệu): ");
			thuNhap = Float.parseFloat(scan.nextLine());

			System.out.print("Nhập số người phụ thuộc: ");
			soNguoiPhuThuoc = Byte.parseByte(scan.nextLine());

			if (checkValue(name, thuNhap, soNguoiPhuThuoc)) {
				flag = true;
			} else {
				flag = false;
			}
		} while (!flag);

		System.out.println("\n*********** THUẾ THU NHẬP CÁ NHÂN *************");
		System.out.println("----------------------------------------");
		System.out.println("Họ tên \t\t Tổng thu nhập năm \t Số người phụ thuộc");
		System.out.println(name + "\t\t" + " " + thuNhap + " triệu" + "\t\t\t" + soNguoiPhuThuoc);
		System.out.println("----------------------------------------");
		thuNhap = thuNhapChiuThue(thuNhap, soNguoiPhuThuoc);
		System.out.println("Thu nhập chịu thuế: " + thuNhap + " triệu");
	}

	public static float thuNhapChiuThue(float thuNhap, byte soNguoiPhuThuoc) {
		float thuNhapChiuThue = 1.0f;
		thuNhapChiuThue = thuNhap - 4 - (float) (soNguoiPhuThuoc * 1.6);
		if (thuNhapChiuThue > 960) {
			System.out.println("Thuế suất 35%");
		} else if (thuNhapChiuThue > 624) {
			System.out.println("Thuế suất 30%");
		} else if (thuNhapChiuThue > 384) {
			System.out.println("Thuế suất 25%");
		} else if (thuNhapChiuThue > 210) {
			System.out.println("Thuế suất 20%");
		} else if (thuNhapChiuThue > 120) {
			System.out.println("Thuế suất 15%");
		} else if (thuNhapChiuThue > 60) {
			System.out.println("Thuế suất 10%");
		} else {
			System.out.println("Thuế suất 5%");
		}
		return thuNhapChiuThue;
	}

	public static boolean checkValue(String name, float thuNhap, byte soNguoiPhuThuoc) {
		boolean flag = true;
		if (soNguoiPhuThuoc < 0 || thuNhap < 10 || name == "") {
			if (thuNhap < 10) {
				System.out.println("Tổng thu nhập năm > 10 \n");
			}
			if (soNguoiPhuThuoc < 0) {
				System.out.println("Số người phụ thuộc > 0 \n");
			}
			if (name == "") {
				System.out.println("Tên không được để trống \n");
			}
			flag = false;
		} else {
			flag = true;
		}
		return flag;
	}
}
