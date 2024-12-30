class Student /*extends Object */
{
    String name ;
    int age ;

    Student(String name, int age)
    {
        this.name = name ;
        this.age = age ;
    }
}

class A1 
{
    public static void main(String args[])
    {
        Student x  = new Student("gopal",67);

        Student y = x;

        System.out.println(x.name);
        System.out.println(x.age);

        y.name = "anshul";
        y.age = 45;

        System.out.println(x.name);
        System.out.println(x.age);
    }
}

// D:\javaprac\56_cloning>javac A1.java

// D:\javaprac\56_cloning>java A1
// gopal
// 67
// anshul
// 45