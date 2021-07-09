import java.util.Scanner;

public class BaiTap2 {
	public static int month = 0;
	public static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner = new Scanner(System.in);
		System.out.print("Vui long nhap vao mot thang, thang =");
		month = scanner.nextInt();
		if(month > 12) {
			System.out.println("Tháng của năm phải nhỏ hơn 13!");
			System.out.print("Vui long nhap vao mot thang, thang =");
			month = scanner.nextInt();
		}
		xuLyThang(month);
	}

	private static void xuLyThang(int month) {
		// TODO Auto-generated method stub
		switch (month) {
		case 1:
			System.out.println("Thang 1 co : 31 ngay");
			break ;
		case 2:
			System.out.println("Thang 2 co : 28 ngay");
			break ;
		case 3:
			System.out.println("Thang 3 co : 31 ngay");
			break ;
		case 4:
			System.out.println("Thang 4 co : 30 ngay");
			break ;
		case 5:
			System.out.println("Thang 5 co : 31 ngay");
			break ;
		case 6:
			System.out.println("Thang 6 co : 30 ngay");
			break ;
		case 7:
			System.out.println("Thang 7 co : 31 ngay");
			break ;
		case 8:
			System.out.println("Thang 8 co : 31 ngay");
			break ;
		case 9:
			System.out.println("Thang 9 co : 30 ngay");
			break ;
		case 10:
			System.out.println("Thang 10 co : 31 ngay");
			break ;
		case 11:
			System.out.println("Thang 11 co : 30 ngay");
			break ;
		case 12:
			System.out.println("Thang 12 co : 31 ngay");
			break ;	

		default:
			System.out.print("Vui long nhap vao mot thang, thang =");
			month = scanner.nextInt();
		}
	}

}
