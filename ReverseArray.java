import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int i;
	    int[] num= new int[5];
	    for(i=0; i<num.length; i++)
	    {
	        num[i]=sc.nextInt();
	    }
	    System.out.println("Revsrse arrays is-");
	    for(i=num.length-1; i>=0; i--)
	    {
	        System.out.println(num[i]);
	        
	    }
		
	}
}
