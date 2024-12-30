class K2 {

        static int count ;

        K2(){

                count ++;
        }

        public static void main(String args[]){


              K2 a1 = new K2();
              System.out.println(a1.count);
              K2 a2 = new K2();
              System.out.println(a1.count);
              K2 a3 = new K2();
              System.out.println(a1.count);
              K2 a4 = new K2();
              System.out.println(a1.count);
              K2 a5 = new K2();
              System.out.println(a1.count);

        }
}