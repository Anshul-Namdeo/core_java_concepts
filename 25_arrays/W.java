//print even records


class W
{
    public static void main(String args[])
    {
        int[] x = {67,34,89,77,21,7,6,2,90,5,63};

        
        for(int i=0; i<x.length; i++)
        {
            if(x[i]%2 == 0 )
            {  
                 System.out.print(x[i] + " ");
            }
        }
       
    }
}
