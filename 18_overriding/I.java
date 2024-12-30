class A1 {

        final void pro(){

                System.out.println("hi");
        }
}
class B1 extends A1 {

}

class I {

        public static void main(String args[]){

                B1 x = new B1();

                x.pro();
        }
}