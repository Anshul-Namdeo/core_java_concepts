class Student 
{
    String name;
    int age;

    public Student() 
    {
        System.out.println("Hello ji");
    }

    private Student (String name)
    {
        System.out.println(name);
    }

    protected Student(int age)
    {
        System.out.println(age);
    }
}