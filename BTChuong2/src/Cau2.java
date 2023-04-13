import java.util.Scanner;

public class Cau2 {
	public static void main(String[] args) {
//		Nhập vào số USD và tính ra tiền VNĐ
		
//	ĐẦU VÀO: Nhập vào giá trị USD 
		
//	XỬ LÝ: Tạo biến hằng số int VND = 23500
//		Tạo biến int money, result
//		In thông báo nhập giá trị tiền $
//		Cho người dùng nhập vào tiền $ và gán vào biến money
//		result = money * VND
		
//	ĐẦU RA: Giá tiền VNĐ
		
		Scanner scan = new Scanner(System.in);
		final int VND = 23500;
		int money, result;
		
		System.out.print("Nhập vào giá tiền $: ");
		money = Integer.parseInt(scan.nextLine());
		
		result = money * VND;
		System.out.print(money+"$ - VND: " + result +"đ");
	}
}
