import java.util.Scanner;

public class LietKeNSoNguyenToDauTien {
	public static int tinhtoan(int n) {
		int count=0;
		for(int i=1;i<=n;i++)
		{if((i%2!=0) && (i%3!=0) && (i%5!=0) && (i%7!=0)) {
			System.out.println(i);
		}}
		return count;
	}
	public static int nhap() {
		int n=0;
		boolean check=false;
		Scanner s=new Scanner(System.in);
		while(!check) {
			System.out.println(" ");
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
       System.out.println("input n: ");
       int n=nhap();
       System.out.println("so so nguyen to nho hon n:");
       System.out.println(tinhtoan(n));
	}

}
