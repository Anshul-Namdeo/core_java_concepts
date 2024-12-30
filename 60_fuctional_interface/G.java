@FunctionalInterface
interface Y2 
{
    void info(int x);
}

// class U1 implements Y2 
// {
//     public void info(int e)
//     {
//         System.out.println("hello" + e);
//     }
// }
/*
 public void info(int e){
        System.out.println("hello" + e);    
 }

 e -> System.out.println("hello" + e);
 
 */

class G 
{
    public static void main(String args[])
    {
        // Y2 a = new U1();

        Y2 a =  e -> System.out.println("hello" + e);

        a.info(12);
    }
}

// D:\javaprac\60_fuctional_interface>javac G.java

// D:\javaprac\60_fuctional_interface>java G
// hello12