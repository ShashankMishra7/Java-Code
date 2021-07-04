//using static 


import java.util.*;
public class Main
{
    public static int add(int x, int y)
    {
        int z= x+y;
        return z;
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int a,b;
	    a= sc.nextInt();
	    b= sc.nextInt();
	    System.out.println(add(a,b));
	}
}


//create object



import java.util.*;
public class am
{
    public  int add(int x, int y)
    {
        int z= x+y;
        return z;
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int a,b;
	    a= sc.nextInt();
	    b= sc.nextInt();
	    am obj= new am();
	    System.out.println(obj.add(a,b));
	}
}
