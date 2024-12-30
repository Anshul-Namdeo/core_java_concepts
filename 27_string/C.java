public class C 
{
     public static void  main(String args[])
     {
        String x = new String("om");
        String y = new String("OM");

        boolean a = x.equals(y);

        System.out.println(a);
     } 
}

// D:\javaprac\27_string>javac C.java

// D:\javaprac\27_string>java C
// false
