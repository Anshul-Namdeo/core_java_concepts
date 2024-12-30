import java.util.HashSet;

class T1 
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
}


// D:\javaprac\38_collections>java T1
// [tohan - 13, gohan - 14, mohan - 10, sohan - 11, rohan - 12]
// false
// [tohan - 13, gohan - 14, mohan - 10, sohan - 11, rohan - 12]
