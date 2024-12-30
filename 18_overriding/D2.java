class Y1 {

    void pro(){

            System.out.println("pro in y1");
    }
}

class D2 extends Y1{

        void pro(){

            System.out.println("pro in D");
        }

        public static void main(String args[]){

                Y1 x = new D2(); // polymorphic assignment

                x.pro(); // polymorphic method call / invocation
        }
}