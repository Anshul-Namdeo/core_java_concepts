public class K 
{
     public static void main(String args[])
     {

         String x = "###########";
         
         Employee y = new Employee("anshul", 18);

         System.out.println(x + y);  // y par toString() automatically call ho rha hai 
         System.out.println(x + y.toString());
     }  
}

// D:\javaprac\26_string>javac K.java

// D:\javaprac\26_string>java K
// ###########anshul 18
// ###########anshul 18
