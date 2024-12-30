class R 
{
    public static void main(String args[])
    {
        
        Z[] x = new Z[3];

        System.out.println(x.length);
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    }
}

interface Z
{

}

// D:\javaprac\25_arrays>javac R.java

// D:\javaprac\25_arrays>java R
// 3
// null
// null
// null