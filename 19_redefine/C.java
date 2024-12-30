class X {

        void pro(){

                System.out.println("hi");
        }
}
class X1 extends X {

        void pro(){

                System.out.println("hello");
        }
}

class C {

        public static void main(String aegs[]){

            X x = new X1();
            x.pro();
        }
}