import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

class B 
{
    public static void main(String args[])
    {
        Class k = Student.class;

        Constructor[] constructors = k.getDeclaredConstructors();

        for(Constructor constructor :constructors)
        {
            System.out.print(Modifier.toString(constructor.getModifiers()) + " " + constructor.getName() + " (");

            Type[] paramsTypes = constructor.getGenericParameterTypes();
            for(int i=0; i<paramsTypes.length; i++)
            {
               String s = paramsTypes[i].getTypeName();
               if(s.contains("."))
               {
                int index = s.lastIndexOf(".");
                String s1 = s.substring(index+1);
                System.out.print(s1);
               }else
               {
                System.out.print(s);

               }
               if(i+1<paramsTypes.length)
               {
                System.out.print(" ---  ,");
               }else
               {
                System.out.print(" ---  ");

               }
            }
                System.out.println(")");
                System.out.println("{");
                System.out.println("");
                System.out.println("      System.out.println(hello);");
                System.out.println("");
                System.out.println("}");

        }
    }
}

// D:\javaprac\54_reflection\C>javac B.java

// D:\javaprac\54_reflection\C>java B
// private Student (String ---  ,int ---  ,Date ---  )
// {

//       System.out.println(hello);

// }
// protected Student (int ---  ,float ---  )
// {

//       System.out.println(hello);

// }
