import java.util.ArrayList;

class M1 
{
    public static void main(String args[])
    {
        ArrayList list = new ArrayList();

        list.add(true);
        list.add(3.4);
        list.add("umesh");

        pro(list);
    }

    static void pro (ArrayList <String> x)
    {
        for (String y : x)
        {
            System.out.println(y);
        }
    }
}



// D:\javaprac\42_generics>javac M1.java
// Note: M1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\42_generics>java M1
// Exception in thread "main" java.lang.ClassCastException: class java.lang.Boolean cannot be cast to class java.lang.String (java.lang.Boolean and java.lang.String are in module java.base of loader 'bootstrap')
//         at M1.pro(M1.java:18)
//         at M1.main(M1.java:13)
