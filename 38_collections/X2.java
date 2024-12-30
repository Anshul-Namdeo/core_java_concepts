class X2
{
    public static void main(String args[])
    {
        Student x = new Student("Gurmeet",21);
        Student y = new Student("Gurmeet",21);

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
    int age ;

    Student(String name , int age)
    {
        this.name = name ;
        this.age = age ;
    }

    public String toString()
    {
        return name +" - " + age;
    }

    
    public boolean equals(Object obj)
    {
        boolean flag = false ;

        if(obj instanceof Student)
        {
            Student a = this;
            Student b = (Student)obj;

            String nm1 = a.name;
            String nm2 = b.name;

            flag = nm1.equals(nm2);
            System.out.println(flag + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        return flag ;
      
    }
}


// D:\javaprac\38_collections>javac X2.java

// D:\javaprac\38_collections>java X2
// true!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// true
