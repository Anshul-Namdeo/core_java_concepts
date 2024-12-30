import java.util.TreeMap;

class Q2 
{
    public static void main(String args[])
    {
        TreeMap<Student,College> map = new TreeMap <Student,College> ();

        
        map.put(new Student("om",12),new College("JEC"));
        map.put(new Student("hemant",19), new College("SRIT"));
        map.put(new Student("ratnesh",22), new College("Global"));
        map.put(new Student("ram",24), new College("HEC"));
        map.put(new Student("Prateek",18), new College("GGCT"));
        map.put(new Student("om",12), new College("JEC"));
        map.put(new Student("Kamal",23), new College("GGITS"));

        System.out.println(map);
    }
}

class Student implements Comparable <Student> 
{
    String name ;
    Integer age ;

    Student(String name, int age )
    {
        this.name = name ;
        this.age = age ;
    }

    public String toString()
    {
        return name + " - " + age ;
    }

    public int compareTo(Student o)
    {
        return this.age.compareTo(o.age);
    }
}

class College 
{
    String name ;

    College (String name) 
    {
        this.name = name ;
    }

    public String toString()
    {
        return name ;
    }
}

// D:\javaprac\40_collections>java Q2
// {om - 12=JEC, Prateek - 18=GGCT, hemant - 19=SRIT, ratnesh - 22=Global, Kamal - 23=GGITS, ram - 24=HEC}