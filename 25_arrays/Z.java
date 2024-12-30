// print odd records count

class Z
{
    public static void main(String args[])
    {
        int[] x = {67,34,89,77,21,7,6,2,90,5,63};

        int count = 0;
        
        for(int i=0; i<x.length; i++)
        {
            if(x[i]%2 == 1 )
            {  
                 count++;
            }
        }
        System.out.println(count);
    }
}


// D:\javaprac\25_arrays>javac Z.java

// D:\javaprac\25_arrays>java Z
// 7