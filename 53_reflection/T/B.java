import java.lang.reflect.Method;
import java.lang.reflect.Type;

class B 
{
    public static void main(String args[])
    {
        Class k = Student.class;

        Method[] methods = k.getDeclaredMethods();

        System.out.print(methods[0].getName() + " ");

        Type[] types = methods[0].getGenericParameterTypes();

        System.out.print("(");
        for(Type type : types)
        {
            // System.out.println(type.getTypeName());

            String ty = type.getTypeName();
            if(ty.contains("."))
            {
                System.out.print(ty.substring(ty.lastIndexOf(".")+1)+ "----, ");
            }else{
                System.out.print(ty + "----, ");
            }
        }
        System.out.print(")");
        System.out.print(" ");
        System.out.print("{");
         System.out.println(" ");
        System.out.println(" ");
        System.out.print("}");


    }
}


// D:\javaprac\53_reflection\T>javac B.java

// D:\javaprac\53_reflection\T>java B
// register (String----, String----, Date----, int----, String----, ) {

// }