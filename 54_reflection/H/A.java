import java.lang.reflect.Field;

class A 
{
    public static void main(String args[]) throws IllegalAccessException
    {
        User user = new User("kaliya",23);

        Class k = user.getClass();

        Field[] fields = k.getDeclaredFields();

        fields[0].setAccessible(true);
        fields[1].setAccessible(true);

        String nm = (String)fields[0].get(user);
        int ag = (int)fields[1].get(user);

        System.out.println("name:" + nm);
        System.out.println("age:" + ag);

    }
}


// D:\javaprac\54_reflection\H>javac A.java

// D:\javaprac\54_reflection\H>java A
// name:kaliya
// age:23
