import java.util.TreeMap ;

class Q1 
{
    public static void main(String args[])
    {
        TreeMap <Student,College> map = new TreeMap <Student,College> ();

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

class Student  implements Comparable 
{
    String name ;
    Integer age ;

    Student (String name , int age)
    {
        this.name = name ;
        this.age = age ;
    }

    public String toString ()
    {
        return name + " - " + age ;
    }

    public int compareTo(Object o)
    {
        Student s1 = this;
        Student s2 = (Student) o;

        String nm1 = s1.name;
        String nm2 = s2.name;

        return nm1.compareTo(nm2);
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