import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	     int i,j,n;
	     Scanner sc= new Scanner(System.in);
	     n=sc.nextInt();
    for(i=0; i<=n; i++ )
    {
        for(j=0; j<=n-i; j++)
        {
            System.out.printf("* ");
        }
        System.out.printf("\n");
    }
		
	}
}