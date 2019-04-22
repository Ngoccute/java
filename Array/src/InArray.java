
public class InArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] A =new int[5] ;
    //int A[]= {-7,-6,7,3,0,-2,4}; 
    System.out.println("array length: "+A.length);
    for(int i=0;i<A.length;i++) {
    	A[i]=5*i+i;
    	System.out.println("A["+i+"]="+A[i]);
    }
}}
   