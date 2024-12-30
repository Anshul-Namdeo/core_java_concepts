import java.util.TreeMap ;
import java.util.Comparator;
import java.util.Scanner;

class R 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter \n1 for NAS \n2 for NDS \n3 for AAS \n4 for ADS : ");

        int input = sc.nextInt();

        Comparator<Student> com = null;

        switch(input) 
        {
            case 1 :
            com = new NAS();
            break ;

            case 2 :
            com = new NDS();
            break;

            case 3 :
            com = new AAS();
            break;

            case 4 :
            com = new ADS();
            break;

            default : 
            System.out.println("Invalid Input...!!!");
            System.exit(0);
        }

        TreeMap <Student,College> map = new TreeMap<Student,College> (com);

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

class NAS implements Comparator 
{
    public int compare(Object o1, Object o2)
    {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        String nm1 = s1.name ;
        String nm2 = s2.name ;

        return nm1.compareTo(nm2);
    }
}
class NDS implements Comparator 
{
    public int compare(Object o1, Object o2)
    {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        String nm1 = s1.name ;
        String nm2 = s2.name ;

        return nm2.compareTo(nm1);
    }
}
class AAS implements Comparator 
{
    public int compare(Object o1, Object o2)
    {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        Integer ag1 = s1.age;
        Integer ag2 = s2.age;

        return ag1.compareTo(ag2);
    }
}
class ADS implements Comparator 
{
    public int compare(Object o1, Object o2)
    {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;

        Integer ag1 = s1.age;
        Integer ag2 = s2.age;

        return ag2.compareTo(ag1);
    }
}
class Student 
{
    String name ;
    Integer age ;

    Student(String name , int age)
    {
        this.name = name ;
        this.age = age;
    }
    public String toString()
    {
        return name + " -" + age;
    }
}

class College 
{
    String name;

    College (String name)
    {
        this.name = name ;
    }

    public String toString()
    {
        return name;
    }
}


// D:\javaprac\40_collections>javac R.java
// Note: R.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\40_collections>java R
// Enter
// 1 for NAS
// 2 for NDS
// 3 for AAS
// 4 for ADS :
// 4
// {ram -24=HEC, Kamal -23=GGITS, ratnesh -22=Global, hemant -19=SRIT, Prateek -18=GGCT, om -12=JEC}

// D:\javaprac\40_collections>java R
// Enter
// 1 for NAS
// 2 for NDS
// 3 for AAS
// 4 for ADS :
// 3
// {om -12=JEC, Prateek -18=GGCT, hemant -19=SRIT, ratnesh -22=Global, Kamal -23=GGITS, ram -24=HEC}

// D:\javaprac\40_collections>java R
// Enter
// 1 for NAS
// 2 for NDS
// 3 for AAS
// 4 for ADS :
// 2
// {ratnesh -22=Global, ram -24=HEC, om -12=JEC, hemant -19=SRIT, Prateek -18=GGCT, Kamal -23=GGITS}

// D:\javaprac\40_collections>java R
// Enter
// 1 for NAS
// 2 for NDS
// 3 for AAS
// 4 for ADS :
// 1
// {Kamal -23=GGITS, Prateek -18=GGCT, hemant -19=SRIT, om -12=JEC, ram -24=HEC, ratnesh -22=Global}