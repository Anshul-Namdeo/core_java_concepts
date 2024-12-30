class DDD {

        static void pro(){

                System.out.println("hi");
        }
}

class EEE extends DDD {

        static void pro(){

                System.out.println("hello");
        }
}

class Q {

        public static void main(String args[]){

          ///  DDD x = new DDD ();
              // EEE x = new EEE();

              DDD x = new EEE();
            x.pro();
        }
}