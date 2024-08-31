class circle {

            int radius ;
            static float pi = 3.14f;

            public static void main(String[] args){

                    circle c1 = new circle();
                    c1.radius = 10;

                    circle c2 = new circle ();
                    c2.radius =20;

                    c1.calcarea();
            }

            void calcarea(){

                    System.out.println(pi * radius * radius );
            }
}