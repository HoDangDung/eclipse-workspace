import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập vào số thực thứ nhất: ");
		String value1 = scan.nextLine();
		System.out.print("Nhập vào số thực thứ hai: ");
		String value2 = scan.nextLine();
		
		double num1= Double.parseDouble(value1), 
					num2 = Double.parseDouble(value2);
		double tong = num1 + num2;
		System.out.println("Tổng là: " + tong);
	}
}