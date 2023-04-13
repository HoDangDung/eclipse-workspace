import java.util.Scanner;

public class Cau1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int INDEX = 5;

		// Tính giá trị trung bình của 5 số được từ bàn phím

// ĐẦU VÀO: 5 số từ bàn phím người dùng

// XỬ LÝ: Tạo biến kiểu int num1, num2, num3, num4, num5, và float avg

//		In thông báo nhập giá trị num1
//		Cho người dùng nhập giá num1 và gán vào num1

//		In thông báo nhập giá trị num2
//		Cho người dùng nhập giá num1 và gán vào num2

//		In thông báo nhập giá trị num3
//		Cho người dùng nhập giá num1 và gán vào num3

//		In thông báo nhập giá trị num4
//		Cho người dùng nhập giá num1 và gán vào num4

//		In thông báo nhập giá trị num5
//		Cho người dùng nhập giá num1 và gán vào num5

//		num1 += num2 += num3 += num4 += num5;
//		avg = (float) num1 / 5;
		
// ĐẦU RA: Giá trị trung bình của 5 số

		Scanner scan = new Scanner(System.in);
		int num1, num2, num3, num4, num5;
		float avg;

		System.out.print("Nhập giá đầu tiên: ");
		num1 = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập giá thứ hai: ");
		num2 = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập giá thứ ba: ");
		num3 = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập giá thứ tư: ");
		num4 = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập giá thứ năm: ");
		num5 = Integer.parseInt(scan.nextLine());
		
		num1 += num2 += num3 += num4 += num5;
		avg = (float) num1 / INDEX;
		
		System.out.println(num1 + " / " + INDEX + " = " + avg);
	}
}
