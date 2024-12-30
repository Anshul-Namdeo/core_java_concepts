// Ques : jo values array variable x mai wahi values array variable y mai print krna hai but reverse order main..

class M
{
    public static void main(String args[])
    {
        int[] x = {23,56,78,12,9};

        int[] y = new int[x.length];

        for( int t : y)
        {
            System.out.print(t + " ");
        }

        System.out.println("................................");

        for(int i=y.length-1; i>=0; i--)
        {
            y[i] = x[x.length-1-i];
        }

        for( int t : y)
        {
            System.out.print(t + " ");
        }

    }
}

// D:\javaprac\25_arrays>javac M.java

// D:\javaprac\25_arrays>java  M
// 0 0 0 0 0 ................................
// 9 12 78 56 23