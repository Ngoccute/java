
public class SoThuanNghich {
	 public static boolean testSoThuanNghich(int n){ 
		 StringBuilder xau= new StringBuilder(); 
		                String str= ""+n;
		                xau.append(str);
		 String check= ""+xau.reverse(); 
		 if(str.equals(check)) return true; 
		                else return false;
		      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			    int n,count=0;
			              for(n=100000 ; n<= 999999 ; n++){
			 if(testSoThuanNghich(n)){ 
			                            System.out.println(n);count++;
			                    }
			              }
			              System.out.println("Co "+count+" so thuan nghich co 6 chu so");
			  }
	}


