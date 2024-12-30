import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

class A 
{
    public static void main(String agrs[])
    {
        Class k = Student.class;

        Constructor[] constructors = k.getDeclaredConstructors();

        for(Constructor constructor : constructors)
        {
            System.out.print(Modifier.toString(constructor.getModifiers()) + " " + constructor.getName() + " (");

            Type[] paramsTypes = constructor.getGenericParameterTypes();
            for(Type type: paramsTypes)
            {
                System.out.print(type.getTypeName() + ", ");
            }
            System.out.println(")");
            System.out.print(" ");
            System.out.print("{");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("}");
        }
    }
}