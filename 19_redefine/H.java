class T {
    int x = 2;
}

class H extends T {

        int x = 7;

        void pro(){

                System.out.println(x);
        }

        public static void main(String args[]){

                H h = new H();

                h.pro();
        }
}