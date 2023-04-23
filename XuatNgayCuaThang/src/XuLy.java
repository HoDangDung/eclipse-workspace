import java.util.*;

public class XuLy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month, day = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Vui lòng nhập vào tháng: ");
		month = Integer.parseInt(scan.nextLine());

		boolean flag = true; // giả sử tháng hợp lệ
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 2:
			day = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		default:
			flag = false; // Tháng sai
		}
		
		if (flag) {
			System.out.println("Tháng " + month + " có " + day + " ngày");
		}else {
			System.out.println("Tháng không hợp lệ");
		}
	}
}
