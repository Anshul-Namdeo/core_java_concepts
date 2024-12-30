class User 
{
    private String name ;
    private int age ;

    User(String name , int age)
    {
        this.name = name ;
        this.age = age ;
    }

    private void showInfo() 
    {
        System.out.println(name + "-------" + age);
    }
}