import java.util.*;
public class Switchcase
{
	public static void main(String[] args) 
	{
		int choice ;
		System.out.println("pick one  1.Hi \t 2.Hey \t 3.Hello");
        Scanner s = new Scanner (System.in);
        choice= s.nextInt();
        switch (choice) 
        {
            case 1:
                System.out.println("Hi");
                break;
            case 2:
                System.out.println("Hey");
                break;
            case 3:
                System.out.println("Hello");
                break;
            default:
                System.out.println("Invalid choice");
        }
	}
}
