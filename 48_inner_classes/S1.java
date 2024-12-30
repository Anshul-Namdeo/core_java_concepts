class S1 
{
    int x = 99;

    class F 
    {

    }

    public static void main(String args[])
    {
        S1 t = new S1();

        F f = t.new F();

        System.out.println(f.x);
    }
}


// D:\javaprac\48_inner_classes>javac S1.java
// S1.java:16: error: cannot find symbol
//         System.out.println(f.x);
//                             ^
//   symbol:   variable x
//   location: variable f of type S1.F
// 1 error