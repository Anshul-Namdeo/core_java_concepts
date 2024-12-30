class X 
{
    public static void main(String args[])
    {
        Student x = new Student("Gurmeet",21);
        Teacher y = new Teacher("Gurmeet",21);

        System.out.println(x.equals(y));
    }
}
class Teacher 
{
    String name ;
    int age ;

    Teacher(String name , int age)
    {
        this.name = name ;
        this.age = age ;
    }

    public String toString()
    {
        return name + "--" + age ;
    }
}

class Student 
{
    String name ;
    int age;

    Student(String name, int age)
    {
        this.name = name ;
        this.age = age ;
    }

    public String toString()
    {
        return name + " - " + age;
    }

    public boolean equals(Object obj)
    {
        Student a = this;
        Student b = (Student)obj;

        String nm1 = a.name;
        String nm2 = b.name;

        return nm1.equals(nm2);
    }
}


// D:\javaprac\38_collections>javac X.java

// D:\javaprac\38_collections>java X
// Exception in thread "main" java.lang.ClassCastException: class Teacher cannot be cast to class Student (Teacher and Student are in unnamed module of loader 'app')
//         at Student.equals(X.java:47)
//         at X.main(X.java:8)
