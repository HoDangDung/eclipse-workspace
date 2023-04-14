import java.util.Scanner;
import java.lang.Math;

public class Cau3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Xác định điểm M nằm trong, trên hay ngoài đường tròn
		
// ĐẦU VÀO: Tọa độ (xC, yC) tâm, bán kín đường tròn R, tọa độ điểm (xM, yM)
		
// XỬ LÝ: Tạo biến xC, yC, xM, yM kiểu float, biến M kiểu double, biến R kiểu int
//		In thông báo nhập xC
//		Cho người dùng nhập vào giá trị xC và gán vào xC
//		In thông báo nhập yC
//		Cho người dùng nhập vào giá trị yC và gán vào yC
//		In thông báo nhập R
//		Cho người dùng nhập vào giá trị R và gán vào R
//		In thông báo nhập xM
//		Cho người dùng nhập vào giá trị xM và gán vào xM
//		In thông báo nhập yM
//		Cho người dùng nhập vào giá trị yM và gán vào yM
		
//		Tính M = R - sqrt((xM-xC)*(xM-xC) + (yM-yC)*(yM-yC)) 
		
// ĐẦU RA: Điểm M nằm trên , trong hay ngoài đường tròn
		
		Scanner scan = new Scanner(System.in);
		float xC, yC, xM, yM;
		double M;
		int R;
		
		System.out.print("Nhập tọa độ xC: ");
		xC = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập tọa độ yC: ");
		yC = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập tọa độ R: ");
		R = Integer.parseInt(scan.nextLine());
		System.out.print("Nhập tọa độ xM: ");
		xM = Float.parseFloat(scan.nextLine());
		System.out.print("Nhập tọa độ yM: ");
		yM = Float.parseFloat(scan.nextLine());
		
		M = R - (Math.sqrt((xM-xC)*(xM-xC) + (yM-yC)*(yM-yC)));
		if (M > 0) {
			System.out.print("M nằm trong đường tròn");
		} else if(M < 0){
			System.out.print("M nằm ngoài đường tròn");
		}else {
			System.out.print("M nằm trên đường tròn");
		}
	}
}
