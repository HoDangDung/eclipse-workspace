import java.time.DayOfWeek;
import java.util.*;

public class XuLy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		đầu vào: Nhập vào ngày, tháng, năm 
//
//		xử lý: Tạo biến date, month, year, dayOfWeek, top, flag
//		In thông báo nhập ngày
//		Cho người dùng nhập và gán vào date
//
//		In thông báo nhập tháng
//		Cho người dùng nhập và gán vào month
//
//		In thông báo nhập năm
//		Cho người dùng nhập và gán vào year 
//
//		Xét year. Nếu year < 1582 -> Không hợp lệ bật cờ flag = false
//
//		Xét month < 1 || month month >12 -> Tháng không hợp lệ. Bật cờ flag = false
//
//		Xét day -> kiểm tra là người dùng nhập vào tháng mấy và lấy ra số ngày tối đa tương ứng với tháng nhập vào. Chú ý năm nhuận để xác định số ngày tháng 2. Sau đó xét day có đúng hay không
//
//		Tính dayofweek = (d+y+y/4-y/100 +y/400+(31*m)/12)%7
//		a = (14- m)/12
//		y -= a
//		m += 12*a - 2
//
//		đầu ra: thứ trong tuần của ngày đó

		Scanner scan = new Scanner(System.in);
		int d, m, y, top, dayOfWeef; // số ngày tối đa trong tháng
		boolean flag = true;
		do {
			System.out.print("Vui lòng nhập ngày: ");
			d = Integer.parseInt(scan.nextLine());

			System.out.print("Vui lòng nhập tháng: ");
			m = Integer.parseInt(scan.nextLine());
			int month = m;
			System.out.print("Vui lòng nhập năm: ");
			y = Integer.parseInt(scan.nextLine());

			if (y < 1582) {
				flag = false; // Năm không hợp lệ
			}
			if (m < 1 || m > 12) {
				flag = false; // Tháng không hợp lệ
			}
			if (d < 1 || d > 31) {
				flag = false; // Ngày không hợp lệ
			}
			switch (m) {
			case 4:
			case 6:
			case 9:
			case 11:
				top = 30;
				break;
			case 2:
				if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) { // Là năm nhuận
					top = 29;
				} else {
					top = 28;
				}
				break;
			default:
				top = 31;
			}

			if (!flag) {
				System.out.println("\n"
						+ "Không hợp lệ!!!! \nNhập lại\n");
			} else {
				int a = (14 - m) / 12;
				y -= a;
				m += 12 * a - 2;
				dayOfWeef = (d + y + (y / 4) - (y / 100) + (y / 400) + (31 * m) / 12) % 7;
				if (dayOfWeef == 0) {
					System.out.println("Thứ " + dayOfWeef + " ngày " + d + " tháng " + month + " năm " + y);
				} else {
					System.out.println("Thứ " + (dayOfWeef + 1) + " ngày " + d + " tháng " + month + " năm " + y);
				}
			}
		} while (!flag);
	}
}
