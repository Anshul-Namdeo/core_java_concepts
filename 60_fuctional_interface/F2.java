@FunctionalInterface
interface X6 
{
    void pro();
}

// class Y2 implements X6 
// {
//     public void pro()
//     {
//         System.out.println("helllo");
//     }
// }
/*
    public void pro()
    {
    System.out.println("helllo");
    }

() -> System.out.println("helllo");
*/

class F2 
{
    public static void main(String args[])
    {
        // X6  x = new Y2();

        X6 y = () -> System.out.println("hello");

        // X6 y = new X6(){
        
        //     public void pro()
        //     {
        //         System.out.println("hello");
        //     }
        // }


        y.pro();
    }
}


// D:\javaprac\60_fuctional_interface>javac F2.java

// D:\javaprac\60_fuctional_interface>java F2
// hello