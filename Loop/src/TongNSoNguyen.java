import java.util.Scanner;

public class TongNSoNguyen {
	public static int k=0;
	public static int n;
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("nhap vao N: ");
	n= s.nextInt();
	int i=0;
	do {
		
		k+=i;
		i++;
	}while(i<=n);
		
	
		System.out.println("tong la: "+k);
}
}
