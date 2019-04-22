import java.util.Scanner;
public class ChuyenCoSo10SangB {
private static int n,b;
public static int nhapn() {
	boolean check=false;
	Scanner s= new Scanner(System.in);
	while(!check) {
		System.out.println(" ");
		try {
			n=s.nextInt();
			check=true;
		}catch(Exception e) {
			System.out.println("yeu cau nhap lai...");
			s.nextInt();
		}
}
	return n;
	}
public static int nhapb() {
	int b=0;
	boolean check=false;
	Scanner s= new Scanner(System.in);
	do {
		System.out.println(" ");
		try {
			b=s.nextInt();
			check=true;
		}catch(Exception e) {
			System.out.println("yeu cau nhap lai...");
			s.nextInt();
		}
	}while(b>0 || b<10);
	{
		System.out.println("yeu cau nhao lai...");
	}
	return b;
	}
public static int tinh(int n2, int b2) {
	int i=0;
	while(n!=0);
	{
	    i=n%b;
	    n=n/b;
		return i;
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("nhap vao n: ");
     int n2=nhapn();
     System.out.println("in put b: ");
     int b2=nhapb();
     System.out.println("gia trij tim duoc la: "+ tinh(n2,b2));
    
	}

}
