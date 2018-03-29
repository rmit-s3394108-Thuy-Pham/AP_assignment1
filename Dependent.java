public class Dependent extends User
{
  private Adult parent1;
  private Adult parent2;
  private int age;

  public Dependent(String name, String image, String status, int age)
  {
    super(name, image, status);
    this.setAge(age);

  }

  public Dependent(String name, String image, String status, int age, Adult parent1, Adult parent2)
  {
    super(name, image, status);
    this.setAge(age);
    this.setParent1(parent1);
    this.setParent2(parent2);
  }

  public int getAge()
  {
    return age;

  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public Adult getParent1()
  {
    return parent1;
  }

  public void setParent1(Adult parent1)
  {
    this.parent1 = parent1;
  }

  public Adult getParent2()
  {
    return parent2;
  }

  public void setParent2(Adult parent2)
  {
    this.parent2 = parent2;
  }
}