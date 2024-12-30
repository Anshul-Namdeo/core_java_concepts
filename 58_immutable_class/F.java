import java.lang.reflect.Field;

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

class F 
{
    public static void main(String args[])
    {
        Student s = new Student("gopal",23);

        System.out.println(s);

        Class k = Student.class;

        Field[] arr = k.getDeclaredFields();

        arr[0].setAccessible(true);
        arr[1].setAccessible(true);

        try{
            if(arr[0].getName().equals("name"))
            {
                arr[0].set(s,"yamraj");
                arr[1].set(s,1000);
            }else
            {
                arr[0].set(s, 1000);
                arr[1].set(s, "yamraj");
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }

        System.out.println(s);
    }
}











// D:\javaprac\58_immutable_class>javac F.java

// D:\javaprac\58_immutable_class>java F
// gopal - 23
// yamraj - 1000