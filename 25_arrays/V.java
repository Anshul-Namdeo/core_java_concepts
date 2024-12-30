// print even records count

class V
{
    public static void main(String args[])
    {
        int[] x = {67,34,89,77,21,7,6,2,90,5,63};

        int count = 0;
        
        for(int i=0; i<x.length; i++)
        {
            if(x[i]%2 == 0 )
            {  
                 count++;
            }
        }
        System.out.println(count);
    }
}

// D:\javaprac\25_arrays>javac V.java

// D:\javaprac\25_arrays>java V
// 4
