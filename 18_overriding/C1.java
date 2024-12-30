class X5 {
        // overriden method
        void pro(){

            System.out.println("pro in X5");

        }
}

class C1 extends X5{
        //legal method overriding
        //overriding method
        void pro(){

            System.out.println("pro in C1");
        }

        public static void main(String args[]){

                C1 x = new C1();

                x.pro();
                x.pro();
        }
}