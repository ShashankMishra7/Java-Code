
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int[] num={1,2,3,4,5};
	    int n= num.length;
	    System.out.println(n);
	    int l=n/2;
	     for(int i=0; i<n; i++)
       {
           System.out.println(num[i]);
       }
       for(int i=0; i<l; i++)	
       {
           int temp= num[i];
           
           num[i]=num[n-1-i];
           num[n-1-i]=temp;
       }
       System.out.println("After reverse");
       for(int i=0; i<n; i++)
       {
           System.out.println(num[i]);
       }
		
	}
}
