  /////// Immutable class (object) banane ke steps ///////////////

  // step 1.) such class must be declared final..
  // step 2.) decalred all the instance variables private..
  // step 3.) initialize the instance variable through public consturctor...
  // step 4.) remove all the setter methods if available......


final class Student 
{
    private  String name ; 
   private  int age ;

   public Student(String name, int age)
   {
        this.name = name;
        this.age = age;
   }

   public String toString()
   {
        return name + " - " + age ;
   }

   public String getName()
   {
        return name;
   }

   public int getAge()
   {
    return age;
   }
}

class E1 
{
    public static void main(String args[])
    {
        Student x  = new Student("yamraj",1111);

        System.out.println(x);

        x.setName = "chitragupat";
        x.setAge = 45;

        System.out.println(x);

    }
}


// D:\javaprac\58_immutable_class>javac E1.java
// E1.java:44: error: cannot find symbol
//         x.setName = "chitragupat";
//          ^
//   symbol:   variable setName
//   location: variable x of type Student
// E1.java:45: error: cannot find symbol
//         x.setAge = 45;
//          ^
//   symbol:   variable setAge
//   location: variable x of type Student
// 2 errors
