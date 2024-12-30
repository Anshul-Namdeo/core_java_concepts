class Student /*extends Object */
{
    String name;
    int age ;

    Student(String name, int age)
    {
        this.name = name ;
        this.age = age ;
    }
}

class B 
{

 public static void main(String args[])
    {
        Student x  = new Student("gopal",67);

        Student y = x.clone();

        System.out.println(x.name);
        System.out.println(x.age);

        y.name = "anshul";
        y.age = 45;

        System.out.println(x.name);
        System.out.println(x.age);
    }
}

// D:\javaprac\56_cloning>javac B.java
// B.java:20: error: clone() has protected access in Object
//         Student y = x.clone();
//                      ^
// B.java:20: error: incompatible types: Object cannot be converted to Student
//         Student y = x.clone();
//                            ^
// 2 errors