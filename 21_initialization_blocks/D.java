class D {

        D(){
             System.out.println("Step - 1");
              System.out.println("Step - 2");
               System.out.println("Step - 3");
                System.out.println("Step - a");
                 System.out.println("Step - b");
                  System.out.println("Step - c");
        }

        D(int n){
             System.out.println("Step - 1");
              System.out.println("Step - 2");
               System.out.println("Step - 3");
                System.out.println("Step - x");
                 System.out.println("Step - y");
                  System.out.println("Step - z");
        }

        D(float m){

            System.out.println("Step - 1");
              System.out.println("Step - 2");
               System.out.println("Step - 3");
                System.out.println("Step - m");
                 System.out.println("Step - n");
                  System.out.println("Step - o");
        }

        public static void main(String args[]){

                    D a1 = new D();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                D a2 = new D(12);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                D a3 = new D(1.2f);
            }
        }
  

