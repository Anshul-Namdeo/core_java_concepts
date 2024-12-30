public class M 
{
      public static void main(String args[])
      {
            String x = "ram";

            System.out.println(x.charAt(3));
      } 
}

// D:\javaprac\26_string>javac M.java

// D:\javaprac\26_string>java M
// Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 3
//         at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
//         at java.base/java.lang.String.charAt(String.java:1519)
//         at M.main(M.java:7)
