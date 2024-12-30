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

class E 
{
    public static void main(String args[])
    {
        Student x  = new Student("yamraj",1111);

        System.out.println(x);

        x.name = "chitragupat";
        x.age = 45;

        System.out.println(x);

    }
}

// D:\javaprac\58_immutable_class>javac E.java
// E.java:44: error: name has private access in Student
//         x.name = "chitragupat";
//          ^
// E.java:45: error: age has private access in Student
//         x.age = 45;
//          ^
// 2 errors