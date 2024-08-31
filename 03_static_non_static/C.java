class circle {

        int radius ; // instance level variable 
        static float pi = 3.14f;  // class level variable 

        public static void main(String[] args){

                    circle c1 = new circle();
                    c1.radius = 78;

                    circle c2 = new circle();
                    c2.radius = 21;

                    calcarea();

        }

         static void calcarea(){
            
                System.out.println(pi * radius * radius );
        }
}


// C.java:20: error: non-static variable radius cannot be referenced from a static context
//                 System.out.println(pi * radius * radius );
//                                         ^
// C.java:20: error: non-static variable radius cannot be referenced from a static context
//                 System.out.println(pi * radius * radius );
//                                                  ^
// 2 errors