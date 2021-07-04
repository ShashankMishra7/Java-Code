public class Main
{
     public static void foo(){
        System.out.println("Hello, GoodMorning"); 
    }
     public static void foo(String s){
        System.out.println("Hello, GoodMorning "+ s); 
    }
     public static void foo(float s){
        System.out.println(s); 
    }
     public static void main(String[] args) {
        foo();
        foo(4.5f);
        String x="shashank";
        foo(x);
    }
}
