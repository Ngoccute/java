import java.util.Scanner;
public class NhapXuat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		Scanner scan1= new Scanner(System.in);
		System.out.println("nhap vao gia tri a va b:");
        a=scan1.nextInt();
        b=scan1.nextInt();
				
      System.out.println("tong a+b= "+(a+b));
      System.out.println(" a-b= "+(a-b));
      System.out.println("a*b="+(a*b));
      System.out.println("a/b="+ (a/b));
      if(a>b) {
    	  System.out.println("a>b");
    	  
    	  
      }
      else {
    	  System.out.print("a<b");
    	  
      }
      }

}
