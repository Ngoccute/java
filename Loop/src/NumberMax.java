import java.util.Scanner;

public class NumberMax {
public static int a,b;


public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("nhap vao a va b :");
	
	a =s.nextInt();
	b =s.nextInt();
	if(a<b) {
	 System.out.println("number max : "+b);
	}
	else {
		System.out.println("number max: "+a);
	}
}
}
