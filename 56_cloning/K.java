class Student implements Cloneable 
{
     String name;
    int age;

    Student (String name, int age)
    {
        this.name = name;
        this.age = age ;
    }
}

class K 
{
    public static void main(String args[])
    {
        Student x = new Student("om",12);

        System.out.println("X.name before : " + x.name);
        System.out.println("X.age before : " + x.age);

        Student y = (Student)x.clone();

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


// D:\javaprac\56_cloning>javac K.java
// K.java:22: error: clone() has protected access in Object
//         Student y = (Student)x.clone();
//                               ^
// 1 error
