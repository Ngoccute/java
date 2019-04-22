import java.util.Arrays;

public class SapXepArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] a= {4,3,9,0,2,9,45,9,6};
    int key=9;
    int key1=40;
    Arrays.sort(a);
    for(int A:a) {
    System.out.print(A+" ");
    
    }
    int i=Arrays.binarySearch(a ,key);
    if(i>=0) {
    	System.out.println();
    	System.out.println(key+" found at index: "+i);}
    else {
        System.out.println(key +" not found");
    	}
    int j=Arrays.binarySearch(a, key1);
    if(j>=0) {
    	System.out.println();
    	System.out.println(key1+" found at index: "+j);}
    else {
        System.out.println(key1+" not found");
    	}
}}
