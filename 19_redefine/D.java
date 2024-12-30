class X {

        static void pro(){

                System.out.println("hi")
        }
}
class X1 extends X {

        static void pro(){
            System.out.println("hello");
        }
}

class D {

        public static void main(String args[]){

                X x = new X1();
                x.pro();
        }
}