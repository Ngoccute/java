import java.util.Scanner;

public class LietKe {
	public static int nhap() {
		int n = 0;
		boolean check=false;
		Scanner s= new Scanner(System.in);
		while(!check) {
			try {
				n=s.nextInt();
				check= true;
			}catch( Exception e) {
				System.out.println("yeu cau nhap lai...");
				s.nextLine();
			}
		}
			return n;
		
	
		}
	public static int tinhtoan(int n) {
		for(int i=1;i<n;i++) {
			System.out.println(i);
		}
		return n;
	}
		
public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("nhap n: ");
    int n=nhap();
    System.out.println("so ban vua nhap la: "+ n);
    System.out.println("so phan tu nho hon "+n+" la: ");
    System.out.println(tinhtoan(n));
	}

}
