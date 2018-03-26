import java.util.*;
public class MiniNet
{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      int choice=0;
      do
      {
        System.out.println("MiniNet Menu");
        System.out.println("==================");
        System.out.println("1. List everyone");
        System.out.println("2. Select a person");
        System.out.println("3. Are these two direct friends?");
        
        System.out.println("5. Exit");
        System.out.println("Enter an option:");
        choice = sc.nextInt();

        if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5) {
				      System.out.println("Invalid choice");}
      }
      while (choice !=5);
  }
}
