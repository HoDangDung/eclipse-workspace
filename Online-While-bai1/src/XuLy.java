import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count = demLanThiLai(scan);
		System.out.println("Số lần thi lại: " + count);
	}

	public static int demLanThiLai(Scanner scan) {
		int count = 1;
		float diem = 2;
		while (diem < 5) {
			System.out.print("Nhập điểm thi của bạn: ");
			diem = Float.parseFloat(scan.nextLine());
			if (diem < 5) {
				count++;
			} else {
				System.out.println("Chúc mừng bạn đã thi đậu");
			}
		}
		return count;
	}

}
