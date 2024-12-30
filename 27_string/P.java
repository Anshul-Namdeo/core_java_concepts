public class P 
{
     public static void main(String args[]){

         String x = "mohan is a good boy";

         String[] y = x.split(" ");

         for(String tem :y)
         {
            System.out.println(tem);
         }
         System.out.println(x);
     }    
}

// D:\javaprac\27_string>javac P.java

// D:\javaprac\27_string>java P
// mohan
// is
// a
// good
// boy
// mohan is a good boy