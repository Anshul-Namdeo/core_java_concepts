class W1 
{
    public static void main(String args[])
    {
        Student x = new Student("Gurmeet",21);
        Student y = new Student("Gurmmet",21);

        System.out.println(x.equals(y));
        System.out.println(x == y);
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

// D:\javaprac\38_collections>javac W1.java

// D:\javaprac\38_collections>java W1
// false
// false
