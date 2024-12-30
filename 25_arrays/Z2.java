// print max odd record

class Z2
{
    public static void main(String args[])
    {
        int[] x = {67,34,89,77,21,7,6,2,90,5,63,459};

        int max = x[0];
        for(int i=0; i<x.length; i++)
        {
            if(x[i]%2 == 1)
            {  
                if( x[i]>max)
                
                 max = x[i];
            }
        }
       System.out.print(max + " ");
    }
}


// D:\javaprac\25_arrays>javac Z2.java

// D:\javaprac\25_arrays>java Z2
// 459