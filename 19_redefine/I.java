class U {

        int x = 12;
}

class I extends U {

        int x = 17;

        void pro(){

                int x = 23;

                System.out.println(x);
                 System.out.println(this.x);
                  System.out.println(super.x);
        }

        public static void main(String args[]){

                I h  = new I();

                h.pro();
        }
}