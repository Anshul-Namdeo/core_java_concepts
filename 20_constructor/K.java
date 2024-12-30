class K {

        int count ;

        K(){

                count ++;
        }

            public static void main(String args[]){

                    K a1 = new K();
                    K a2 = new K();
                    K a3 = new K();
                    K a4 = new K();
                    K a5 = new K();

                    System.out.println(a1.count);
                    System.out.println(a2.count);
                    System.out.println(a3.count);
                    System.out.println(a4.count);
                    System.out.println(a5.count);
            }
}