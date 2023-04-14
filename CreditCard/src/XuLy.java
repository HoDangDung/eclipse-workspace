import java.util.*;

public class XuLy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float INTEREST = 1.5f;
//		Đầu vào: Số dư thẻ tín dụng
//
//		Xử lý: 
//		Tạo biến createCardBalance, payment, balance, penalty
//
//		In thông báo nhập số dư thẻ tín dụng
//		Cho người dùng nhập số dư thẻ tín dụng và gán vào biến "createCardBalance"
//
//		In thông báo nhập số tiền thanh toán trong tháng
//		Cho người dùng nhập số tiền thanh toán trong tháng và gán vào biến "payment"
//
//		Xét điều kiện balance > 0
//
//		Tính tiền phạt nếu balance > 0
//
//		createCardBalance = 15000
//		payment= 5000
//		balance = (money – pay)
//		penalty = balance * (laiSuat / 100)
//
//		Đầu ra: tiền phạt thẻ tín dụng chưa thanh toán

		float createCardBalance, payment, balance, penalty=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập số dư thẻ tín dụng: ");
		createCardBalance = Float.parseFloat(scan.nextLine());
		
		do {
			
			System.out.print("Nhập số tiền thanh toán trong tháng: ");
			payment = Float.parseFloat(scan.nextLine());
			
			if (payment > createCardBalance) {
				System.out.println("Số tiền tiền thánh toán nhiều hơn số dư kìa!!!\nNhập lại");
			}
			
		} while (payment > createCardBalance);
		
		balance = createCardBalance - payment;
		
		if (balance > 0) {
			penalty = balance * (INTEREST / 100);
			System.out.print("Tiền phạt phải trả là: " + penalty);
		}
		else {
			System.out.print("Bạn đã thanh toán đầy đủ");
		}
	}
}
