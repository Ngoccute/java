
public class BoiCua3 {
	public static int dem=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("cac phan tu: ");
   for(int i=0; i<100;i++) {
	   if((i%3==0)||i%7==0) {
		   dem+=1;
		   System.out.println(i);
	   }
	   
   }
   System.out.println("so chia het cho 3 hoac 7: "+dem);
   
	}

}
