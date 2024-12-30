import java.lang.reflect.Field;

final class Student 
{
    private final  String name ; 
   private final  int age ;

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

class F1 
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
                arr[0].set(s,"bheem");
                arr[1].set(s,10);
            }else
            {
                arr[0].set(s, 10);
                arr[1].set(s, "bheem");
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }

        System.out.println(s);
    }
}

// D:\javaprac\58_immutable_class>javac F1.java

// D:\javaprac\58_immutable_class>java F1
// gopal - 23
// bheem - 10