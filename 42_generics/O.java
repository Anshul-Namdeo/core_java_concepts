import java.util.ArrayList ;

class O 
{
    public static void main(String args[])
    {
        ArrayList <Integer> x = new ArrayList <> ();

        x.add(56);
        x.add(78);
        x.add(12);

        ArrayList <Double> y = new ArrayList <> ();

        y.add(5.6);
        y.add(3.6);
        y.add(11.6);

        ArrayList <Long> z = new ArrayList <> ();

        z.add(11L);
        z.add(4L);
        z.add(89L);

        pro(x);
        pro(y);
        pro(z);

    }

    static void pro(ArrayList <Integer> list)
    {
        for(Integer next : list)
        {
            System.out.println(next);
        }
    }

    static void pro(ArrayList <Double> list)
    {
        for(Double next : list)
        {
            System.out.println(next);
        }
    }

    static void pro(ArrayList <Long> list)
    {
        for(Long next : list)
        {
            System.out.println(next);
        }
    }
}


// D:\javaprac\42_generics>javac O.java
// O.java:39: error: name clash: pro(ArrayList<Double>) and pro(ArrayList<Integer>) have the same erasure
//     static void pro(ArrayList <Double> list)
//                 ^
// O.java:47: error: name clash: pro(ArrayList<Long>) and pro(ArrayList<Integer>) have the same erasure
//     static void pro(ArrayList <Long> list)
//                 ^
// 2 errors