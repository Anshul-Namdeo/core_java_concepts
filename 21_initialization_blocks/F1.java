class F1 {

        {
            System.out.println("g");
        }
        {
            System.out.println("6");
        }
        F1(){
            // superI();
            // ints.. ini... block
            System.out.println("j");
        }

        public static void main(String args[]){

                System.out.println("y");
                F1 x = new F1();

                System.out.println("T");
        }

                {
                    System.out.println("k");
                }
        
}

// conclusion : instance initialization block wahi se run hota hai jaha per super() hota hai