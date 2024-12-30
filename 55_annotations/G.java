class G 
{
    @SuppressWarnings("deprecation")
    {
        Integer x = new Integer(12);
        System.out.println(x);
    }


    @SuppressWarnings("deprecation")
    static{
        Integer x = new Integer(6);
        System.out.println(x);
    }

    @SuppressWarnings("deprecation")
    void pro()
    {
        Integer x = new Integer(12);
        System.out.println(x);
    }

    @SuppressWarnings("deprecation")
    static void pro()
    {
        Integer x = new Integer(12);
        System.out.println(x);
    }

 
 @SuppressWarnings("deprecation")
    G()
    {
        Integer x = new Integer(12);
        System.out.println(x);
    }
}


// D:\javaprac\55_annotations>javac G.java
// G.java:4: error: illegal start of type
//     {
//     ^
// G.java:11: error: illegal start of type
//     static{
//           ^
// 2 errors