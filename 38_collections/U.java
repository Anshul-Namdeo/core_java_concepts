import java.util.HashSet;

class U 
{
    public static void main(String args[])
    {
        HashSet set = new HashSet();

        set.add(new Employee("mohan",10));
        set.add(new Employee("sohan",11));
        set.add(new Employee("rohan",12));
        set.add(new Employee("tohan",13));
        set.add(new Employee("gohan",14));

        System.out.println(set);

        Employee x = new Employee("rohan",12);

        System.out.println(set.remove(x));

        System.out.println(set);
    }
}
class Employee
{
    String name ;
    int age ;

    Employee(String name, int age)
    {
        this.name = name ;
        this.age = age ;
    }

    public String toString()
    {
        return name + " - " + age ;
    }

    public boolean equals(Object obj)
    {
        boolean flag = false;

        System.out.println(flag + "^^^^^^^");

        if(obj instanceof Employee)
        {
            Employee a1 = this;
            Employee a2 = (Employee)obj;

            String nm1 = a1.name;
            String nm2 = a2.name;

            flag = nm1.equals(nm2) && a1.age == a2.age;
        }
        return flag;
    }
}


// D:\javaprac\38_collections>javac U.java
// Note: U.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\38_collections>java U
// [tohan - 13, gohan - 14, mohan - 10, sohan - 11, rohan - 12]
// false
// [tohan - 13, gohan - 14, mohan - 10, sohan - 11, rohan - 12]

// D:\javaprac\38_collections>