import java.util.Scanner;
public class maintest {
	private static Scanner sc;

	public static void main(String[] args) {
	 sc = new Scanner(System.in);
	 int N;
	 do {
		 
		 System.out.println("nhap vao N:");
		 N=sc.nextInt();
		 if(N<0 || N>1000) {
			 System.out.println("khong hop le");
		 }
		
	 }
 while(N<=0 || N>1000);
	 int dem=0;
	 for( int i = 1;i<=N;i++)
 {
		 if(i%2 == 0) {
			 
			 dem++;
			 if (dem == 2) {
				 System.out.println("So can tim la: " + dem);
				 break;
			 }
			 }
			 
		 }
		 System.out.println("so so chan la: ");
		    System.out.println(dem);
		    }
	
	 }
	 
		// TODO Auto-generated method stub



