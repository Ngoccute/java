import java.util.Scanner;

public class Tong {
      public static int a;
      public static double b;
      public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s= new Scanner(System.in);
	System.out.println("input a and b:  ");
	a=s.nextInt();
	b=s.nextDouble();
	do {
    System.out.println("khong hop le! nhap lai");
	}while(b%1!=0);
	
	System.out.println("tong la: "+(a+b));
    System.out.println("hieu la: "+(a-b));
    System.out.println("tich la: "+(a*b));
    System.out.println("thuong la: "+(a/b));
	
}
}