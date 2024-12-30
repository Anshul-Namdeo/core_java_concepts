  /////// Immutable class (object) banane ke steps ///////////////

  // step 1.) such class must be declared final..
  // step 2.) decalred all the instance variables private..
  // step 3.) initialize the instance variable through public consturctor...
  // step 4.) remove all the setter methods if available......

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

        public String toString()
        {
            return name +" - "+ age;
        }

  // step 4.) remove all the setter methods if available......

    // public void setName(String name)
    // {
    //     this.name = name;
    // }

    public String getName()
    {
        return name;
    }

  // step 4.) remove all the setter methods if available......

    // public void setAge(int age)
    // {
    //     this.age = age;
    // }

    public int getAge()
    {
        return age;
    }
  }