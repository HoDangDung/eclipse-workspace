import java.util.*;

public class XuLy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Tạo hàm cho hiển thị lựa chọn
// Sử dụng kỹ thuật cờ hiệu
// Tạo biến "Chon" người dùng chon
// Tạo vòng lặp
// In menu
// Cho nhập lựa chọn
// switch...case các lựa chọn và xử lý tương ứng
// Bật biến thoát
		Scanner scan = new Scanner(System.in);
		nhapLuaChon(scan);
	}

	public static void inMenu() {
		System.out.println("1: Tính tổng");
		System.out.println("2: Tính hiệu");
		System.out.println("3: Tính nhân");
		System.out.println("4: Tính chia");
		System.out.println("0: Thoát");
	}

	public static List nhapGiaTri(Scanner scan) {
		List<Integer> arr = new ArrayList<Integer>();
		int num;
		boolean stop = false;
		do {
			System.out.print("Mời nhập giá trị: ");
			num = Integer.parseInt(scan.nextLine());
			arr.add(num);
			if (num == 0) {
				stop = true;
			} else {
				stop = false;
			}
		} while (!stop);
//		System.out.println(arr.subList(num, arr.size() - 1));
		return arr.subList(num, arr.size() - 1);
	}

	public static void nhapLuaChon(Scanner scan) {
		boolean thoat = false;
		do {
			inMenu();
			System.out.print("Mời nhập lựa chọn: ");
			byte chon = Byte.parseByte(scan.nextLine());
			nhapGiaTri(scan);
			switch (chon) {
			case 1:
				tinhTong();
				break;
			case 2:
				tinhHieu();
				break;
			case 3:
				tinhNhan();
				break;
			case 4:
				tinhChia();
				break;
			case 0:
				thoat = true;
				System.out.print("Thoát chương trình thành công !!!!");
				break;
			default:
				System.out.println("Vui lòng chọn đúng menu.");
			}
		} while (!thoat);
	}

	private static void tinhChia() {
		// TODO Auto-generated method stub

	}

	private static void tinhNhan() {
		// TODO Auto-generated method stub

	}

	private static void tinhHieu() {
		// TODO Auto-generated method stub

	}

	private static void tinhTong() {
		// TODO Auto-generated method stub
	}

}
