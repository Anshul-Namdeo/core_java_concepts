class K1 {

        static int count ;

        K1(){

                count ++ ;
        }

        public static void main (String args[]){

            K1 a1 = new K1();
            K1 a2 = new K1();
            K1 a3 = new K1();
            K1 a4 = new K1();
            K1 a5 = new K1();

            System.out.println(a1.count);
            System.out.println(a2.count);
            System.out.println(a3.count);
            System.out.println(a4.count);
            System.out.println(a5.count);
        }
}