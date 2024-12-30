class Y1 {

    void pro(){

            System.out.println("pro in y1");
    }
}

class D1 extends Y1{

        void pro(){

            System.out.println("pro in D1");
        }

        public static void main(String args[]){

                D1 x = new D1();

                x.pro();
        }
}