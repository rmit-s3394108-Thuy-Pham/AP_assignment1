import java.util.*;
import java.util.InputMismatchException;


public class Driver
{

  ArrayList<User> userList = new ArrayList<>();


  // constructor Driver()
  public Driver()
  {
    createTestingData();
    int choice = 0;
    do
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("          MiniNet Menu                ");
        System.out.println("======================================");
        System.out.println("1.  List everyone                     ");
        System.out.println("2.  Select a person                   ");
        System.out.println("3.  Are these two direct friends?     ");
        System.out.println("4.  Does user have child/parents?");
        System.out.println("5.  Add a person                      ");
        System.out.println("6.  Exit                              ");
        System.out.println("Enter an option:");
        try
        {
          choice = sc.nextInt();
        }
        catch(InputMismatchException error)
        {
          choice = 0;
          System.out.println("You must enter a number. Please try again.");
        }

        switch(choice)
        {
          case 1:
          System.out.println("List all users");
          listAllUsers();
          break;
          case 2:
          //
          break;
          case 3:
          //
          break;
          case 4:
          //
          break;
          case 5:
          //
          case 6:
          System.out.println("Bye Bye");
          break;
        }
      }while( choice != 6);
  }

  //fetching data for testing process

  public void createTestingData()
  {
    User u[] = new User[10];
    u[0] = new Adult("Alice", "alicePic.png", "working at KFC", 24);
    u[1] = new Adult("Bob", "bobPic.png", "student at RMIT", 26);
    u[2] = new Adult("Cathy", "cathyPic.png", "freelancer", 28);
    u[3] = new Adult("Don", "donPic.png", "lookingforjobs", 30);
    u[4] = new Dependent("Rick", "rickPic.png", "student in primary school", 8);
    u[5] = new Dependent("Morty", "mortyPic.png", "student in primary school", 9);
    u[6] = new Adult("Rick's Mom", "rickmom.png", "divorced mum", 30);
    u[7] = new Adult("Rick's Dad", "rickdad.png", "divorced dad", 31);
    u[8] = new Adult("Morty's Mom", "mortymom.png", "happy mum", 29);
    u[9] = new Adult("Morty's Mom2", "mortymom2.png", "another happy mum", 30);
    // add everyone to userList
    for (int i = 0; i<10; i++)
      {userList.add(u[i]);}

    //making some connections between two Dependents
    u[4].getListofFriends().add(u[5]);
    u[5].getListofFriends().add(u[4]);
    //making some connections between Adults
    u[0].getListofFriends().add(u[1]);
    u[1].getListofFriends().add(u[0]);
    u[0].getListofFriends().add(u[3]);
    u[3].getListofFriends().add(u[0]);


    //connect Dependents with their parents
    if (u[4] instanceof Dependent && u[6] instanceof Adult && u[7] instanceof Adult)
    {
      ((Dependent)u[4]).setParent1((Adult)u[6]);
      ((Dependent)u[4]).setParent2((Adult)u[7]);
      ((Adult)u[7]).setDepdendent((Dependent)u[4]);
      ((Adult)u[6]).setDepdendent((Dependent)u[4]);
    }

    if (u[5] instanceof Dependent && u[8] instanceof Adult && u[9] instanceof Adult)
    {
      ((Dependent)u[5]).setParent1((Adult)u[8]);
      ((Dependent)u[5]).setParent2((Adult)u[9]);
      ((Adult)u[9]).setDepdendent((Dependent)u[5]);
      ((Adult)u[8]).setDepdendent((Dependent)u[5]);
    }

  }


  public void listAllUsers()
  {
    for(User u: userList)
    {
      System.out.println("  UserName: " + u.getName());
      System.out.println("  Profile Picture: " + u.getImage());
      System.out.println("  Status: " + u.getStatus());
        if (u instanceof Dependent)
        {
          System.out.println("  Age: " + ((Dependent)u).getAge());
        }
        else
        {
          System.out.println("  Age: " + ((Adult)u).getAge());
        }
      System.out.println("===================================");

      }
    }
    // end of method listAllUsers()


    //method selectUserByName()


    //method isDirectFriend()
          //method checkConnection()

          //method doesUserExist()

    //method returnObjectUser(String nameofUser)

    //method addNewUser()

    //method listUserRelatives()




  }
