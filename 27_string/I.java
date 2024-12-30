public class I 
{
     public static void main(String args[])
     {
        String x = "mohan is a good boy and mohan is my best friend";

        String y = "chotabheem";

        String z = x.replace("mohan",y);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
     }  
}


// D:\javaprac\27_string>javac I.java

// D:\javaprac\27_string>java I
// mohan is a good boy and mohan is my best friend
// chotabheem
// chotabheem is a good boy and chotabheem is my best friend
