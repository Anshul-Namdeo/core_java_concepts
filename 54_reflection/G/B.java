import java.lang.reflect.Field;

class B
{
    public static void main(String agrs[]) throws IllegalAccessException
    {
        User user = new User("raju",16);

        Class k = user.getClass();

        Field[] fields = k.getDeclaredFields();

        // System.out.println(fields[0].getName());
        // System.out.println(fields[1].getName());

        String nm = (String)fields[0].get(user);
        int ag = (int)fields[0].get(user);

        System.out.println("Name:" + nm);
        System.out.println("Age:" + ag);
    }
}

// D:\javaprac\54_reflection\G>javac B.java

// D:\javaprac\54_reflection\G>java B
// Exception in thread "main" java.lang.IllegalAccessException: class B cannot access a member of class User with modifiers "private"
//         at java.base/jdk.internal.reflect.Reflection.newIllegalAccessException(Reflection.java:392)
//         at java.base/java.lang.reflect.AccessibleObject.checkAccess(AccessibleObject.java:674)
//         at java.base/java.lang.reflect.Field.checkAccess(Field.java:1102)
//         at java.base/java.lang.reflect.Field.get(Field.java:423)
//         at B.main(B.java:16)