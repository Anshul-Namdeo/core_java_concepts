class Z2 
{
    public static void main(String args[])
    {
        Student x = new Student("Gurmeet",21);
        Student y = new Student("Gurmeet",21);
        Student z = new Student("meetGur",21);
        Student t = new Student("Gurmit",21);

        // test 1.

        // System.out.println(x.hashCode());
        // System.out.println(x.hashCode());
        // System.out.println(x.hashCode());

        //test 2..

        // System.out.println(x.equals(y));
        // System.out.println(x.hashCode() + " -- " + y.hashCode() );

        //test 3a..

        System.out.println(x.equals(z));
        System.out.println(x.hashCode() + " -- " + z.hashCode() );



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
        }
        return flag ;
    }

    public int hashCode()
    {
        int code = 0;

        String abc = " abcdefghijklmnopqrstuvwxyz";

        for(int i=0; i<name.length(); i++)
        {
            code = code + abc.indexOf(name.charAt(i));
        }
        return code ;
    }
}


// D:\javaprac\38_collections>javac Z2.java

// D:\javaprac\38_collections>java Z2
// false
// 81 -- 81