class Student/*extends Object */ implements Cloneable 
{
     String name;
    int age;

    Student (String name, int age)
    {
        this.name = name;
        this.age = age ;
    }

    public Object clone() throws CloneNotSupportedException 
    {
        return super.clone();
    }
}

class K1 
{
    public static void main(String args[])
    {
        Student x = new Student("om",12);

        System.out.println("X.name  : " + x.name);
        System.out.println("X.age  : " + x.age);

        Student y = null;
        try{
            y = (Student)x.clone();
        }catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Y.name  : " + y.name);
        System.out.println("Y.age : " + y.age);

       
    }
}



// D:\javaprac\56_cloning>javac K1.java

// D:\javaprac\56_cloning>java K1
// X.name  : om
// X.age  : 12
// Y.name  : om
// Y.age : 12
