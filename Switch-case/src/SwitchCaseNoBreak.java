import java.util.Scanner;

public class SwitchCaseNoBreak {
	public static int nhap() {
		boolean check=false;
		int n = 0;
         Scanner s=new Scanner(System.in);
         while(!check) {
        	 try {
        		 System.out.println(" ");
        		 n=s.nextInt();
        		 check=true;
        	 }catch(Exception e) {
        		 System.out.println("yeu cau nhao lai...");
        		 s.nextLine();
        	 }
         }
         return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("input the age number: ");
		int n=nhap();
         switch(n){
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:System.out.println("hoc sinh tieu hoc");
                 break;
         case 12:
         case 13:
         case 14:
         case 15: System.out.println("hoc sinh cap 2");
                  break;
         case 16:
         case 17:
         case 18:System.out.println("hoc sinh cap 3");
                 break;
         default:
                System.out.println("già đầu rồi! học hành chi nữa");
                break;
         }}}
         
         
	


