import java.util.Scanner;

public class UocChungLonNhat {
public static int n=0;
public static boolean check=false;
public static int nhap() {
	Scanner s=new Scanner(System.in);
	while(!check)
		System.out.println(" ");
		try {
			n=s.nextInt();
			check=true;
		}catch(Exception e) {
		  System.out.println("yeu cai nhap lai...");
		  s.nextInt();
		}
	return n;	
}
public static int tinh(int a, int b) {
	while(a!=b)
		if(a>b) {
			a=a-b;
		}
		else { 
			b=b-a;
		}
	return a;
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("nhap a: ");
      int a=nhap();
      System.out.println("nhap b: ");
      int b=nhap();
      System.out.println("UCLN cua "+a+"va "+b+"la: "+tinh(a,b));
      System.out.println("BCNN cua "+a+"va"+b+";la: "+(a*b)/tinh(a,b));
;
     
	}

}
