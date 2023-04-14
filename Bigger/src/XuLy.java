import java.util.*;

public class XuLy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Đầu vào: Nhập vào số d1
//			Nhập vào số d2

// Xử lý: Tạo biến d1, d2, bigger
//		In thông báo nhập d1
//		Cho người dùng nhập và gán vào d1
//		in thong báo nhập d2
//		Cho người dùng nhập và gán vào d2
//		Xét d1> d2 hay không
//		Nếu sai thì gán bigger = d2
//		Ngược lại bigger = d1
//		Xuất kết quả

// Đầu ra: Xuất số lớn nhất

		Scanner scan = new Scanner(System.in);
		float d1 = 0.0f, d2 = 0.0f, bigger = 0.0f;

		System.out.print("Nhập vào d1: ");
		d1 = Float.parseFloat(scan.nextLine());

		System.out.print("Nhập vào d2: ");
		d2 = Float.parseFloat(scan.nextLine());

		if (d1 > d2) {
			bigger = d1;
			System.out.println("Số lớn nhất là d1 = " + bigger);
		} else if (d1 < d2) {
			bigger = d2;
			System.out.println("Số lớn nhất là d2 = " + bigger);
		} else {
			System.out.println("Hai số bằng nhau");
		}
	}

}
