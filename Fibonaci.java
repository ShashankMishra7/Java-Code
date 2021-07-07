import java.util.*;
public class Main
{
    public static void fab(int num1,int num2,int n){
        System.out.printf("%d,%d",num1,num2);
        if(n>=0){
        for(int i=0; i<n-2; i++){
            int num3=num1+num2;
            System.out.print(","+num3);
            num1=num2;
            num2=num3;
            
        }
        }
    }
	public static void main(String[] args) {
	    int n1=0,n2=1;
	    int count;
	    Scanner sc= new Scanner(System.in);
	    count=sc.nextInt();
	    fab(n1,n2,count);
	}
}
