
public class DoWhile {
	public static float tinhtong(int a) {
		int i=0;
		float s=0;
		do {
		
		i++;
		s+=i;
		}while(i<a);
			
		    return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
     System.out.println("tong la: "+tinhtong(10));
	}

}
