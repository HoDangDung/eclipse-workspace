import java.util.*;

public class XuLy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		doanSo(scan);
	}

	public static void doanSo(Scanner scan) {
		int soBiMat = (int) (Math.random() * 99 + 1), nhap;
		do {
			System.out.print("Vui lòng nhập vào một số tứ 1 - 99: ");
			nhap = Integer.parseInt(scan.nextLine());
			if (nhap < soBiMat) {
				System.out.println("\nVui lòng nhập số Lớn hơn");
			} else if (nhap > soBiMat) {
				System.out.println("\nVui lòng nhập số Bé hơn");
			} else {
				System.out.println("*********** Kết quả ************");
				System.out.println("\tBạn đã đoán đúng !!! \n\tSố bí mật: " + soBiMat);
			}
		} while (soBiMat != nhap);
	}

}
