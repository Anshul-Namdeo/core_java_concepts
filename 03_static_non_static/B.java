class circle {

        int radius ;
        float pi = 3.14f ;

        public static void main(String[] args){

                circle c1 = new circle();
                c1.radius = 30;

                circle c2 = new circle();
                c2.radius = 60;


                System.out.println(c1.radius);
                System.out.println(c1.pi);
                System.out.println(c2.radius);
                System.out.println(c2.pi);
        }
}