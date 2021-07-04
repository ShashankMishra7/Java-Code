import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   // int n;
	   // n=sc.nextInt();
	    int[] marks;
	    marks= new int[5];
	//marks= new int[n];	
	    Scanner sc= new Scanner(System.in);
	   for(int i=0; i<marks.length; i++)
	   {
	      marks[i]= sc.nextInt(); 
	      	
	   }
	   System.out.println("Print Array");
	    for(int i=0; i<marks.length; i++)
	   {
	       	
	      	System.out.println(marks[i]);
	   }
	}
}
