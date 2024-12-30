public class P1 
{
    public static void main(String args[]){

        String x = "mohan is a good boy and he is my best friend he lives on an island";

        String[] y = x.split("is");

        for(String tem :y)
        {
           System.out.println(tem);
        }
        System.out.println(x);
    }     
}


// D:\javaprac\27_string>javac P1.java

// D:\javaprac\27_string>java P1
// mohan
//  a good boy and he
//  my best friend he lives on an
// land
// mohan is a good boy and he is my best friend he lives on an island

