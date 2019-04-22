import java.util.Scanner;

public class TinhFibonacci {
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
			System.out.println("yeu cau nhap lai...! ");
			s.nextLine();
		}
	}
	return n;
}
public static int tinhtoan(int n) {
	int[] f= new int[n+1];
	f[0]=0;f[1]=1;;
	for(int i=2;i<=n;i++) {
		f[i]=f[i-1]+f[i-2];
	}
	return f[n];
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("input n: ");
     int n=nhap();
     System.out.println("so Fibocci cua "+n+"la: f["+n+"]=");
     System.out.println(tinhtoan(n));
     
	}

}
