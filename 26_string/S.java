public class S 
{
       public static void main(String args[])
       {
            String x = "ab aab aaab aaaab aaaaab aaaaaab";

                int fromIndex = 0;
                while((fromIndex = x.indexOf('b',fromIndex)) != - 1)
                {
                    System.out.println(fromIndex++);
                }
            }
       }

       
// D:\javaprac\26_string>javac S.java

// D:\javaprac\26_string>java S
// 1
// 5
// 10
// 16
// 23
// 31

