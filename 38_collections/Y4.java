class Y4
{
    public static void main(String args[])
    {
        Student x = new Student("Gurmeet",21);
        Student y = new Student("Gurmeet",21);
        Student z = new Student("Gurmeet",21);

        // Equlas() ke  5 rules ko examples ka dekhte hai 

        // 1) it is reflexive 

        // System.out.println(x.equals(x));
        // System.out.println(y.equals(y));
        // System.out.println(z.equals(z));

        //2) it is Symmetric 

        // System.out.println(x.equals(y) + " ---" +  y.equals(x));
        // System.out.println(x.equals(z) + " ---" +  z.equals(x));
        // System.out.println(y.equals(z) + " ---" +  z.equals(y));

        //3) it is Transitive 

        // System.out.println(x.equals(y) +"-"+ y.equals(z) +"-"+ z.equals(x));

        //4) it is consistent 

        // System.out.println(x.equals(y));
        // System.out.println(x.equals(y));
        // System.out.println(x.equals(y));

        //5) it is null test must produced false

        System.out.println(x.equals(null));
        System.out.println(x.equals(null));
        System.out.println(x.equals(null));
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
}


// D:\javaprac\38_collections>javac Y4.java

// D:\javaprac\38_collections>java Y4
// false
// false
// false