//print odd records


class Z1
{
    public static void main(String args[])
    {
        int[] x = {67,34,89,77,21,7,6,2,90,5,63};

        
        for(int i=0; i<x.length; i++)
        {
            if(x[i]%2 == 1 )
            {  
                 System.out.print(x[i] + " ");
            }
        }
       
    }
}

// D:\javaprac\25_arrays>javac Z1.java

// D:\javaprac\25_arrays>java Z1
// 67 89 77 21 7 5 63
