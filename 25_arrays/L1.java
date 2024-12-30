// Ques : jo values array variable x mai wahi values array variable y mai print krna hai 

class L1
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

        for(int i=0; i<y.length; i++)
        {
            y[i] = x[i];
        }

        for( int t : y)
        {
            System.out.print(t + " ");
        }

    }
}

// D:\javaprac\25_arrays>javac L1.java

// D:\javaprac\25_arrays>java L1
// 0 0 0 0 0 ................................
// 23 56 78 12 9