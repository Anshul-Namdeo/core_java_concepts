// Ques : jo values array variable x mai wahi values array variable y mai print krna hai but reverse order main..

class N
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

        for(int i=0, j=x.length-1; j>=0; i++, j--);
        {
            y[j] = x[i];
        }

        for( int t : y)
        {
            System.out.print(t + " ");
        }

    }
}
