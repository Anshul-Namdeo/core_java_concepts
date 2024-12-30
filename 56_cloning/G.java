class Student /*extends Object */
{
    String name;
    int age ;

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    Student createClone()
    {
        Student st = null;

        try{
            st = (Student)this.clone();
        }catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return st;
    }

}

class G 
{
    public static void main(String args[])
    {
        Student x = new Student("om",12);

        System.out.println("X.name before : " + x.name);
        System.out.println("X.age before : " + x.age);

        // Student y = x.clone();
        Student y = x.createClone();

         System.out.println("Y.name before : " + y.name);
        System.out.println("Y.age before : " + y.age);

        y.name = "gopal";
        y.age = 45;

        System.out.println("X.name After : " + x.name);
        System.out.println("X.age After : " + x.age);

        System.out.println("Y.name After : " + y.name);
        System.out.println("Y.age After : " + y.age);
    }
}

// D:\javaprac\56_cloning>javac G.java

// D:\javaprac\56_cloning>java G
// X.name before : om
// X.age before : 12
// java.lang.CloneNotSupportedException: Student
//         at java.base/java.lang.Object.clone(Native Method)
//         at Student.createClone(G.java:17)
//         at G.main(G.java:37)
// Exception in thread "main" java.lang.NullPointerException: Cannot read field "name" because "<local2>" is null
//         at G.main(G.java:39)


// Note : Student class ko (cloneable) banana padhega cloneable ek interface hai. jo ki ek marker interface hai