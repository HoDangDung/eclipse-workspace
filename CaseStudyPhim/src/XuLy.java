import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String space = "%-50s";

		// Đầu vào: tên phim giá vé người lớn giá vé trẻ em số vé người lớn đã bán số vé
		// trẻ em đã bán % tiền từ thiện.

		// Đầu ra: Tổng tiền trích từ thiện Tổng thu được sau khi trừ

		// Xử lý: Tạo biến tenPhim, giaVeLon, giaVeEm, soVeLon, soVeEm, phanTramTuThien,
		// tongThu, tuThien, conLai.

		// In thông báo nhập tên phim
		// Lấy dữ liệu nhập vào cho biến tên phim

		// In thông báo nhập giá vé người lớn
		// Lấy dữ liệu nhập vào cho biến giá vé người lớn

		// In thông báo nhập giá vé trẻ em
		// Lấy dữ liệu nhập vào cho biến giá vé trẻ em

		// In thông báo nhập số vé người lớn đã bán
		// Lấy dữ liệu nhập vào cho biến số vé người lớn đã bán

		// In thông báo nhập số vé trẻ em đã bán
		// Lấy dữ liệu nhập vào cho biến số vé trẻ em đã bán

		// In thông báo nhập % tổng số tiền từ thiện
		// Lấy dữ liệu nhập vào cho biến % tổng số tiền từ thiện

		// Tính tiền tổng thu: tongThu = giaVeLon * soVeLon + giaVeEm * soVeEm

		// Tính tiền trích từ thiện: tongThu * phanTramTuThien = tuThien

		// Tính tiền còn lại: tongThu - tuThien = conLai
		
		Scanner scan = new Scanner(System.in);
		String tenPhim;
		int giaVeLon, giaVeEm, soVeLon, soVeEm, phanTramTuThien;
		float conLai, doanhThu, tuThien;

		System.out.print("Nhập tên phim: ");
		tenPhim = scan.nextLine();

		System.out.print("Nhập giá vé người lớn: ");
		giaVeLon = Integer.parseInt(scan.nextLine());

		System.out.print("Nhập giá vé trẻ em: ");
		giaVeEm = Integer.parseInt(scan.nextLine());

		System.out.print("Nhập số vé người lớn đã bán: ");
		soVeLon = Integer.parseInt(scan.nextLine());

		System.out.print("Nhập số vé trẻ em đã bán: ");
		soVeEm = Integer.parseInt(scan.nextLine());

		System.out.print("Nhập số % tổng số tiền từ thiện: ");
		phanTramTuThien = Integer.parseInt(scan.nextLine());

		doanhThu = giaVeEm * soVeEm + giaVeLon * soVeLon;
		
		tuThien = (float) phanTramTuThien / 100 * doanhThu;
//		tuThien = doanhThu * phanTramTuThien / 100;
		
		conLai = doanhThu - tuThien;
		
		String text;
		System.out.println();
		text = String.format(space, " ").replace(" ", "-*");
		System.out.println(text+"-*");

		text = String.format(space, "Tên-phim:").replace(' ', '.').replace('-', ' ');
		System.out.println(text + tenPhim);
		
		text = String.format(space, "Số-vé-đã-bán:").replace(' ', '.').replace('-', ' ');
		System.out.println(text + (soVeEm + soVeLon));
		
		text = String.format(space, "Doanh-thu:").replace(' ', '.').replace('-', ' ');
		System.out.println(text + doanhThu + " VNĐ");
		
		text = String.format(space, "Trích-phần-%-từ-thiện:").replace(' ', '.').replace('-', ' ');
		System.out.println(text + phanTramTuThien + "%");
		
		text = String.format(space, "Tổng-tiền-trích-từ-thiện:").replace(' ', '.').replace('-', ' ');
		System.out.println(text + tuThien + " VNĐ");
		
		text = String.format(space, "Tổng-thu-được-sau-khi-trừ:").replace(' ', '.').replace('-', ' ');
		System.out.println(text + conLai + " VNĐ");
	}
}
