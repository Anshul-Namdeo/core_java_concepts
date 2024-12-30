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

class A 
{
    public static void main(String args[])
    {
        Student x = new Student("gopal", 67);

        Student y = x;  // Student variable(y) bhi usi object ko point kare jis ko x variable kr raha hai

        System.out.println(x);
        System.out.println(y);
    }
}


// D:\javaprac\56_cloning>javac A.java

// D:\javaprac\56_cloning>java A
// Student@36baf30c
// Student@36baf30c