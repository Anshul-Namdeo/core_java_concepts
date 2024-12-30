class PQR 
{
    class K 
    {
        private void pro()
        {
            System.out.println("hello");
        }
    }
}

class R 
{
    public static void main(String args[])
    {
        PQR x = new PQR();

        PQR.K y = x.new K();

        y.pro();
    }
}

// D:\javaprac\48_inner_classes>javac R.java
// R.java:20: error: pro() has private access in PQR.K
//         y.pro();
//          ^
// 1 error