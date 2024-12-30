class D1 {

            { System.out.println("Step - 1");
              System.out.println("Step - 2");
               System.out.println("Step - 3");
            }
                
           D1(){
            //  System.out.println("Step - 1");
            //   System.out.println("Step - 2");
            //    System.out.println("Step - 3");
                System.out.println("Step - a");
                 System.out.println("Step - b");
                  System.out.println("Step - c");
        }

        D1(int n){
            //  System.out.println("Step - 1");
            //   System.out.println("Step - 2");
            //    System.out.println("Step - 3");
                System.out.println("Step - x");
                 System.out.println("Step - y");
                  System.out.println("Step - z");
        }

        D1(float m){

            // System.out.println("Step - 1");
            //   System.out.println("Step - 2");
            //    System.out.println("Step - 3");
                System.out.println("Step - m");
                 System.out.println("Step - n");
                  System.out.println("Step - o");
        }

        public static void main(String args[]){

                    D1 a1 = new D1();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                D1 a2 = new D1(12);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                D1 a3 = new D1(1.2f);
            }
        }
  

//   conclusion : static instance block ka use waha par hota jb koi kam reptatively ho raha ho raha to hum waha instance block ka use kar sakte hai 

