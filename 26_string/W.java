public class W 
{
      public static void main(String args[])
      {
        String x = "mohan is a good boy and he is my best friend he is a good singer he is kind person";

        int fromIndex = 0;

        while((fromIndex = x.indexOf("is",fromIndex)) != -1)
        {
                System.out.println(fromIndex++);
        }
      }
}


// D:\javaprac\26_string>javac W.java

// D:\javaprac\26_string>java W
// 6
// 27
// 48
// 68