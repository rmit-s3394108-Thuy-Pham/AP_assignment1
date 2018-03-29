import java.util.*;

public abstract class User
{
  private String name;
  private String image;
  private String status;
  private ArrayList<User> listOfFriends = new ArrayList<>();

  public User(String name, String image, String status)
  {
    this.setName(name);
    this.setImage(image);
    this.setStatus(status);
  }

  public String getName()
  {
    return name;
  }

  public String getImage()
  {
    return image;
  }

  public String getStatus()
  {
    return status;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setImage(String image)
  {
    this.image = image;
  }

  public void setStatus(String status)
  {
    this.status = status;
  }

  public ArrayList<User> getListofFriends()
  {
    return listOfFriends;
  }

  public void setListofFriends(ArrayList<User> listOfFriends)
  {
    this.listOfFriends = listOfFriends;
  }




}
