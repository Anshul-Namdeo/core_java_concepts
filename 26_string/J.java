public class J 
{
   public static void main(String[] args) {
          
      String x ="abc";

      Student y = new Student("raj", 32);

      System.out.println(x + y);    // y par automatically toString() call ho jayega..
      System.out.println(x + y.toString());

   } 
}

// D:\javaprac\26_string>javac J.java

// D:\javaprac\26_string>java J
// abcStudent@452b3a41
// abcStudent@452b3a41