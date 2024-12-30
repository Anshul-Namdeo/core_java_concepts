@interface Company 
{
    String name();
    int rank();
}

@Company(name="TCS", rank=1)
class Employee
{
    String name ;
    int age;
}


// hapily compile...