class Y2 {

           void pro(){

            System.out.println("pro in y2");
        }
   
}

class E1 extends Y2{
        // void pro(){

        //     System.out.println("pro in E");
        // }

        public static void main(String args[]){

                Y2 x = new E1(); // polymorphic assignment

                x.pro(); // polymorphic method call / invocation
        }
}
