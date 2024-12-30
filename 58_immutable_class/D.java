  /////// Immutable class (object) banane ke steps ///////////////

  // step 1.) such class must be declared final..

  final class Student 
  {
    String name ;
    int age ;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }
  }