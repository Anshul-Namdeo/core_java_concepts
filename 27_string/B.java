public class B 
{
    public static void main(String args[])
    {
        String x =  new String("om");
        String y =  new String("om");

        boolean a = x == y;
        boolean b = x.equals(y);

        System.out.println(a);
        System.out.println(b);
    }
}

// D:\javaprac\27_string>javac B.java

// D:\javaprac\27_string>java B
// false
// true