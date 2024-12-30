public class P2 {

    

    public static void main(String args[]){

        String x = "mohan,Raju, Vikram, Sudheer";

        String[] y = x.split(" ");

        for(String tem :y)
        {
           System.out.println(tem);
        }
        System.out.println(x);
}
}