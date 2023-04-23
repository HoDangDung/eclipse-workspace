import java.util.Scanner;

public class XuLy {
	public static int timSoLonNhat(int a, int b, int c) {
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Đầu vào: nhập vào 3 số a, b, c
//
//		Xử lý: Tạo hàm timSoLonNhat với tham số đầu vào và kết quả trả về
//				Sử dụng biến tạm lấy giá trị là số a, so sánh biến tạm với 2 số còn lại để tìm số lớn nhất
//				Vào hàm main, thông báo và cho nhập 3 số
//				Gọi hàm timLonNhat và in kết quả
//		Đầu ra: số lớn nhất

		Scanner scan = new Scanner(System.in);
		int a, b, c;
		System.out.println("Chương trình tìm số lớn nhất trong 3 số");
		System.out.print("Mời nhập số thứ nhất: ");
		a = Integer.parseInt(scan.nextLine());
		System.out.print("Mời nhập số thứ hai: ");
		b = Integer.parseInt(scan.nextLine());
		System.out.print("Mời nhập số thứ ba: ");
		c = Integer.parseInt(scan.nextLine());

		int max = timSoLonNhat(a, b, c);
		System.out.println("Số lớn nhất trong 3 số là: " + max);
	}

}
