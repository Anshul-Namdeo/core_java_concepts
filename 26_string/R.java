public class R 
{
   public static void main(String args[])
   {
        String x = "ab aab aaab aaaab";

        System.out.println(x.indexOf('b'));
        System.out.println(x.indexOf('b',2));
        System.out.println(x.indexOf('b',6));
        System.out.println(x.indexOf('b',11));
   } 
}

// D:\javaprac\26_string>javac  R.java

// D:\javaprac\26_string>java R
// 1
// 5
// 10
// 16
