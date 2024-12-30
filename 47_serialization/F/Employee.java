import java.io.Serializable;

class Employee extends User implements Serializable 
{
    String designation ;
    int salary ;

    Employee()
    {

    }

    Employee(String name , int age, String designation , int salary )
    {
        super(name,age);
        this.designation = designation;
        this.salary = salary;
    }
}