import java.util.LinkedHashSet;
import java.util.HashSet;

class C 
{
    public static void main(String[] args) {
        
        Student x = new Student("gurmeet",21);
        Student y = new Student("gurdeep",20);
        Student z = new Student("prabhjeet",19);
        Student t = new Student("simar",22);
       
        // HashSet set = new HashSet();
        LinkedHashSet set = new LinkedHashSet();

        set.add(x);
        set.add(y);
        set.add(z);
        set.add(t);

        System.out.println(set);
    }
}

class Student 
{
    String name ;
    int age ;

    Student(String name, int age)
    {
        this.name = name ;
        this.age = age ;
    }

    public String toString()
    {
        return name + " -" + age ;
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
        }
        return flag;
    }

    public int hashCode()
    {
        int code = 0;

        String abc = " abcdefghijklmnopqrstuvwxyz";

        for(int i=0; i<name.length(); i++)
        {
            code = code + abc.indexOf(name.charAt(i));
        }
        return code;
    }
}


// D:\javaprac\39_collections>javac C.java
// Note: C.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\39_collections>java C
// [gurmeet -21, gurdeep -20, prabhjeet -19, simar -22]