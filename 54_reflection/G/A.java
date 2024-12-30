import java.lang.reflect.Field;

class A 
{
    public static void main(String agrs[]) throws IllegalAccessException
    {
        User user = new User("raju",16);

        Class k = user.getClass();

        Field[] fields = k.getDeclaredFields();

        System.out.println(fields[0].getName());
        System.out.println(fields[1].getName());

    
    }
}

// D:\javaprac\54_reflection\G>javac A.java

// D:\javaprac\54_reflection\G>java A
// name
// age