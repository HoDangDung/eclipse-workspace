import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Demo lệnh nhập");
		Scanner scan = new Scanner(System.in);
		System.out.print("Vui lòng nhập vào một số: ");
		String chuoi = scan.nextLine();
		System.out.println("Số bạn vừa nhập là \t" + Integer.parseInt(chuoi));
	}
}
