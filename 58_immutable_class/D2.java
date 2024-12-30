  /////// Immutable class (object) banane ke steps ///////////////

  // step 1.) such class must be declared final..
  // step 2.) decalred all the instance variables private..
  // step 3.) initialize the instance variable through public consturctor...

  final class Student 
  {
     private String name ;
     private int age ;

  // step 3.) initialize the instance variable through public consturctor...
        public Student(String name, int age )
        {
            this.name = name ;
            this.age = age;
        }

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