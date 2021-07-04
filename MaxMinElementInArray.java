
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n;
	    
	    n=sc.nextInt();
	    int[] arr= new int[n];
	    for(int i=0; i<arr.length; i++)
	    {
	        arr[i]= sc.nextInt();
	    }
	    int max=arr[0];
	    int min=arr[0];
	   for(int i=0; i<arr.length; i++)
	   {
	       if(max<arr[i])
	       {
	           int temp=arr[i];
	           arr[i]=max;
	           max=temp;
	           
	       }
	       if(min>arr[i])
	       {
	           int temp=arr[i];
	           arr[i]=min;
	           min=temp;
	       }
	      
	   }
	    System.out.println(max);
	    System.out.println(min);
	}
}
