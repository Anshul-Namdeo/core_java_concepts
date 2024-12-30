class PQR 
{
    class K 
    {
       /* private */ void pro()
        {
            System.out.println("hello");
        }
    }
}

class R1 
{
    public static void main(String args[])
    {
        PQR x = new PQR();

        PQR.K y = x.new K();

        y.pro();
    }
}