import java.util.*;
public class Main
{
    public static int rec(int n){
        if(n==0 || n==1)
         return 1;
        else
         return n*rec(n-1);
    }
    public static int ittretive(int n){
        int irr=1;
        for(int i=n; i>=1; i--){
            irr=i*irr; 
        }
        return irr;
    }
	public static void main(String[] args) {
	    int number;
	    Scanner sc= new Scanner(System.in);
	    number= sc.nextInt();
		System.out.println(rec(number));
		System.out.println(ittretive(number));
	}
}
