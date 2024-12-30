class W 
{
    public static void main(String args[])
    {
        Student x = new Student("Gurmeet",21);
        Student y = new Student("Gurmeet",21);

        System.out.println(x.equals(y));  // ye ref.. code ko cheak karegi to false aayega.
        System.out.println(x == y);
    }
}

class Student 
{
    String name ;
    int age ;

    Student(String name,int age)
    {
        this.name = name ;
        this.age = age ;
    }

    public String toString()
    {
        return name + " - " + age ;
    }
}


// D:\javaprac\38_collections>javac W.java

// D:\javaprac\38_collections>java W
// false
// false
