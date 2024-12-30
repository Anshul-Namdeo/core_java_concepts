// print min even record

class Y
{
    public static void main(String args[])
    {
        int[] x = {67,34,89,77,21,7,6,2,90,5,63,459};

        int min = x[0];
        for(int i=0; i<x.length; i++)
        {
            if(x[i]%2 == 0)
            {  
                if( x[i]<min)
                
                 min = x[i];
            }
        }
       System.out.print(min + " ");
    }
}