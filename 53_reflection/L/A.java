import java.lang.reflect.Field;

class A 
{
    public static void main(String args[])
    {
        Class k = Student.class;

        Field[] fields = k.getDeclaredFields();

        System.out.println(k.getName() +": ");

        for(Field next : fields)
        {
            System.out.println(next.getName());
        }
    }
}


// Note : getDecalredFields() method jis class ke object ke context mai run ho raha hai bs usi class ki properties ko access karta hai uski parent class ki properties ko access nhi karta hai..