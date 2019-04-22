import java.util.Scanner;

public class SoNguyenTo {
public static int nhap() {
	int n=5;
	boolean check=false;
	Scanner c=new Scanner(System.in);
	do {
		System.out.println(" ");
		//int a= c.nextInt();
		if(n==c.nextInt()) {
			check=true;
		}
		else {
			System.out.println("yeu cau nhap lai...");
		}
	}while(!check);
	return n;
}
public static int tinh(int n) {
	int dem = 0;
	for(int i=0;i<n;i++) {
		dem= dem  +  i;
	}
	return dem;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("nhap vao n:");
    int n=nhap();
    System.out.println("tong:"+tinh(n));
    
	}

}
