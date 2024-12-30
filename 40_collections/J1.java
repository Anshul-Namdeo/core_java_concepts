import java.util.HashMap;

class J1
{
    public static void main(String args[])
    {
        HashMap <Student,Integer> map = new HashMap <Student,Integer> ();

        map.put(new Student("om",12),78);
        map.put(new Student("umesh",19),97);
        map.put(new Student("jay",13),64);
        map.put(new Student("ekta",9),83);
        map.put(new Student("deepak",5),99);
        map.put(new Student("jay",13),77);

        System.out.println(map);
    }
}

class Student 
{
    String name ;
    int age ;

    Student(String name , int age )
    {
        this.name = name ;
        this.age = age ;
    }

    public String toString()
    {
        return name +" - " + age ;
    }

    public boolean equals(Object obj)
    {
        Student x = this;
        Student y = (Student)obj;

        String nm1 = x.name;
        String nm2 = y.name;

        return nm1.equals(nm2) && x.age == y.age;
    }
}

// D:\javaprac\40_collections>javac J1.java

// D:\javaprac\40_collections>java J1
// {ekta - 9=83, jay - 13=77, deepak - 5=99, om - 12=78, umesh - 19=97, jay - 13=64}
