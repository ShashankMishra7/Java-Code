public class Smethod
{
	public static void main(String[] args) {
	    String name="harry";
	    System.out.println(name.length());       //length
	    int len = name.length();
	    String nam1= name.toUpperCase();          //toUpperCase/toLowerCase
	   	System.out.println(name.substring(3));    //substring
	   	System.out.println(name.charAt(1));      //charAt
	   	System.out.println(name.indexOf("r"));   //indexOf
	    String nm=name+"abc"+nam1;            //concat
	    System.out.println(nm);
	    System.out.println(name.concat(nam1));
	    String s1="     Raja    ";
	    System.out.println(s1.trim());      //trim
	   	
	   
	}
}
