class User /*extends Object */
{
    String name;
    int age;

    User(String name, int age)
    {
        this.name = name;
        this.age = age ;
    }
}

class Student extends User implements Cloneable 
{
    String degree;
    float marks;

    Student(String name, int age, String degree, float marks) 
    {
        super(name,age);
        this.degree = degree;
        this.marks = marks;
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

class H 
{
    public static void main(String args[])
    {
        Student x = new Student("om",12,"MTech",89.45f);
        
        System.out.println("X.name : " + x.name);
        System.out.println("X.age : " + x.age);
        System.out.println("X.degree : " + x.degree);
        System.out.println("X.marks : " + x.marks);


        Student y = x.createClone();

        System.out.println("Y.name --- : " + y.name);
        System.out.println("Y.age --- : " + y.age);
        System.out.println("Y.degree --- : " + y.degree);
        System.out.println("Y.marks --- : " + y.marks);
    }
}

// D:\javaprac\56_cloning>javac H.java

// D:\javaprac\56_cloning>java H
// X.name : om
// X.age : 12
// X.degree : MTech
// X.marks : 89.45
// Y.name --- : om
// Y.age --- : 12
// Y.degree --- : MTech
// Y.marks --- : 89.45


// Note : Is-a-relationship...