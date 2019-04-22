import java.util.Scanner;

public class IfElse {
	public static int nhap() {
		int n=0;
		boolean check=false;
		Scanner s =new Scanner(System.in);
		while(!check) {
			
			try {
				n=s.nextInt();
				check=true;
			}catch(Exception e) {
				System.out.println("yeu cau nhap lai...");
				s.nextLine();
			}
		}
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("nhap vap n: ");
		int n=nhap();
		if(n<20) {
			System.out.println("you are children!");
		}
		else if(n<30) {   
			System.out.println("bạn ế sml ");
		}
		else if(n<50) {
			System.out.println("    1111 ");
		}
		else {
			if(n==60) {
				System.out.println("you are 60 year old");
			}
			if(n==70 ||n==80) {
				System.out.println("ban song tho vai @@");
			}
		}
	}

}
