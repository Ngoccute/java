import java.util.Scanner;

public class TongCacChuSoTrong1SoNguyen2 {
	
	public static int nhap() {
		int n=0;
		boolean check=false;
		Scanner s= new Scanner(System.in);
		while(!check)
		{System.out.println(" ");
		try {
			n=s.nextInt();
			check=true;
		}catch(Exception e) {
			System.out.println("yeu cau nhao lai...");
			s.nextLine();
		}
			
		}
		return n;
		
	}
	public static int tinhtong(int n) {
		int i ;
		int s=0;
		while(n!=0) {
		i=n%10;
		s+=i;
		n=n/10;
		
	}
		return s;}
	public static void main(String[] args) {
	System.out.println("input n: ");
	 int n=nhap();
	System.out.println("tong ca chu so la: " +tinhtong(n));
	}
}
