public class D 
{
      public static void main(String args[])
      {
        String x = new String("MoHaN");
        String y = new String("mOhAn");

        boolean a = x.equals(y);
        boolean b = x.equalsIgnoreCase(y);

        System.out.println(a);
        System.out.println(b);
      } 
}

// D:\javaprac\27_string>javac D.java

// D:\javaprac\27_string>java D
// false
// true