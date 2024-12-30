class K3 {

        static int count ;

        K3(){

                count ++;
        }

        public static void main(String args[]){


              K3 a1 = new K3();
              System.out.println(a1.count);
              K3 a2 = new K3();
              System.out.println(a2.count);
              K3 a3 = new K3();
              System.out.println(a3.count);
              K3 a4 = new K3();
              System.out.println(a4.count);
              K3 a5 = new K3();
              System.out.println(a5.count);

        }
}