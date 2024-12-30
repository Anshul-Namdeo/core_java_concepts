class Y1 {

    void pro(){

            System.out.println("pro in y1");
    }
}

class D extends Y1{

        void pro(){

            System.out.println("pro in D");
        }

        public static void main(String args[]){

                Y1 x = new Y1();

                x.pro();
        }
}