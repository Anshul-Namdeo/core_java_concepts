class Student /*extends Object */ implements Cloneable 
{
    String name;
    int age ;

    Student(String name, int age)
    {
        this.name = name;
        this.age = age ;
    }

    Student createClone()
    {
        Student st = null; // Student ek reference variable hai isliye usa ko null se inislize kar skate hai
        try{
            st = (Student) this.clone();
        }catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return st;
    }

}

class G1 
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

// D:\javaprac\56_cloning>javac G1.java

// D:\javaprac\56_cloning>java G1
// X.name before : om
// X.age before : 12
// Y.name before : om
// Y.age before : 12
// X.name After : om
// X.age After : 12
// Y.name After : gopal
// Y.age After : 45
