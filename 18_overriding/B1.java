class X4 {

        void pro(){

                System.out.println("pro in x4");
        }
}
class B1 extends X4{
// legal method overloading
        void pro(int a){

            System.out.println("pro in B1");
        }

        public static void main(String args[]){

                B1 x = new B1();
                x.pro();
                x.pro(12);
        }
}