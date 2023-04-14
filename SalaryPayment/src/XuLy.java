import java.util.*;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float OT = 1.5f, STANDARD_HOUR = 40;
		
//		đầu vào: số giờ làm của nhân viên
//
//		xử lý:	Tạo biến hours, rate, payment
//		In thông báo nhập số giờ làm
//		Cho người dùng nhập và gán vào hours
		
//		In thông báo nhập số tiền theo giờ làm
//		Cho người dùng nhập và gán vào rate
		
//		Xét hours > 40 đúng hay không
//		Nếu đúng thì thanh toán theo công thức
//			payment = 40* rate + 1.5f*rate*(hours-40)
//		Ngược lại payment = hours * rate
//
//		đầu ra: tiền lương nhân viên phải trả theo tuần

		Scanner scan = new Scanner(System.in);
		float hours, rate = 1.0f, payment;

		System.out.print("Nhập vào giờ làm: ");
		hours = Float.parseFloat(scan.nextLine());
		
		System.out.print("Nhập số tiền theo giờ làm: ");
		rate = Float.parseFloat(scan.nextLine());

		if (hours > STANDARD_HOUR) {
			System.out.println("Thời gian nhân viên làm thêm: " + (hours - STANDARD_HOUR) + " giờ");
			payment = (STANDARD_HOUR * rate) + (OT * rate * (hours - STANDARD_HOUR));
		} else {
			payment = hours * rate;
		}
		System.out.println("Tiền lương phải trả cho nhân viên là: " + payment);
	}

}
