class X1 {

        {
            System.out.println("H");
        }
        X1(){
            System.out.println("F");
        }
        {
            System.out.println("o");
        }
}

class G  extends X1 {
        {
            System.out.println("1");
        }
        {
            System.out.println("v");
        }
        G(){
            this(23);
            System.out.println("s");
        }
        G(int y){
            System.out.println("z");
        }

        public static void main(String args[]){

                System.out.println("D");
                G x = new G();
                System.out.println("X");
        }
        {
            System.out.println("u"); 
        }
}