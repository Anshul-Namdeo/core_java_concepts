class T {
    int x = 2;
}

class H1 extends T {

        // int x = 7;

        void pro(){

                System.out.println(x);
        }

        public static void main(String args[]){

                H1 h = new H1();

                h.pro();
        }
}