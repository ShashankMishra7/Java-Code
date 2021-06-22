import java.util.Scanner ;
public class Main
{
	public static void main(String[] args) 
 {
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the subject marks");
  float math=sc.nextFloat();
  float phy=sc.nextFloat();
  float chem=sc.nextFloat();
  float eng=sc.nextFloat();
  float hindi=sc.nextFloat();   
  float total= math+phy+chem+eng+hindi;
  System.out.println("Total marks");
  System.out.println(total);
  float per=(total*100)/500;
  System.out.println("Total per:"+per); 
		
 }
}
