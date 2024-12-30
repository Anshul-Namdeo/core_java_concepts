class O {

        public static void main(String args[]){

            Shape s1 = new Shape(12);
            Shape s2 = new Shape(12,13);
            Shape s3 = new Shape(12,13,14);


        }
}

class Shape {

        int length ;
        int height ;
        int width;
    // constructor overloading.....
        Shape(int length){
            System.out.println("Shape(int)");
        }

        Shape(int length, int width){
            System.out.println("Shape(int, int)");
        }

        Shape(int length, int witdh, int height){
            System.out.println("Shape(int,int,int)");
        }
}