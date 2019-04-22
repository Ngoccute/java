import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("input number: ");
        int number=s.nextInt();
        switch(number) {
        case 1:
        	System.out.println("ngoc cute @@");
        	Scanner s3=new Scanner(System.in);
        	number = s3.nextInt();
        	break;
        case 2:
        	System.out.println("ngoc very cute^^");
        	Scanner s1=new Scanner(System.in);
        	number = s1.nextInt();
        	break;
        default:
        	System.out.println("ngoc is a betifull girl ^.^");
        	Scanner s2=new Scanner(System.in);
        	number = s2.nextInt();
        }
	}

}
