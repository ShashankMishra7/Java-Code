public class Main
{
    public static int sum(int ...x){
        int add=0;
       for(int i: x){
            add=i+add;
           }
            return add;
     }
	public static void main(String[] args) {
	    System.out.println(sum(5,7));
	     System.out.println(sum(5,7,8));
	      System.out.println(sum(5,7,8,9));
	}
}
