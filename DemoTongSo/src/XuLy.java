import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, unit, ten, hundred, sum;
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập số nguyên dương có 3 ký số: ");
		n = Integer.parseInt(scan.nextLine());
		hundred = n / 100;
		ten = ((n % 100) / 10);
		unit = (n % 10);
		sum = hundred + unit + ten;
		System.out.println("Tổng của " + n + " -> " + hundred + " + " + ten + " + " + unit + " = " + sum);
	}
}