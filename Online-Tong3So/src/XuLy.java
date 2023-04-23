import java.util.Scanner;

public class XuLy {

	public static float tong3So(float a, float b, float c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Đầu vào: Nhập vào 3 số
//
//		Xử lý: Tạo hàm tinhTong với tham số đầu vào là kiểu float và trả về kiểu float
//			Vào hàm main, thông báo và nhập kiểu số nguyên
//			Gọi hàm tinhTong và in kết quả
//
//		Đầu ra: In tổng 3 số
		Scanner scan = new Scanner(System.in);
		float a, b, c, result;
		System.out.println("Chương trình tính tổng 3 số");
		System.out.print("Nhập vào số đầu tiên: ");
		a = Float.parseFloat(scan.nextLine());

		System.out.print("Nhập vào số thứ hai: ");
		b = Float.parseFloat(scan.nextLine());

		System.out.print("Nhập vào số thứ ba: ");
		c = Float.parseFloat(scan.nextLine());
//		result = ;
		System.out.println("Tổng: " + a + " + " + b + " + " + c + " = " + (tong3So(a, b, c)));
	}
}
