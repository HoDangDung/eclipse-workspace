import java.util.*;

public class XuLy {

//	public static boolean kiemTraChanLe(int a) {
//		boolean flag;
//		if (a % 2 == 0) {
//			flag = true;
//		} else {
//			flag = false;
//		}
//		return flag;
//	}
	
	public static void kiemTraChanLe(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " là số chẵn");
		} else {
			System.out.println(a + " là số lẽ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Đầu vào: Nhập vào một số
//
//		Xử lý: Tạo hàm kiemTraChanLe với tham số đầu vào là kiểu int và trả về kiểu boolean
//		Xét số đã cho % 2
//		Vào hàm main, thông báo và cho nhập số nguyên
//		Gọi hàm kiemTraChanLe và in kết quả
//
//		Đầu ra: số chẵn hay số lẽ
		Scanner scan = new Scanner(System.in);
		System.out.println("Chương trình tìm số chẵn lẽ");
		System.out.print("Nhập vào một số: ");
		int a = Integer.parseInt(scan.nextLine());

		kiemTraChanLe(a);
	}

}
