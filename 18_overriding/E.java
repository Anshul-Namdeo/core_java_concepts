class Y2 {

        //    void pro(){

        //     System.out.println("pro in y2");
        // }
   
}

class E extends Y2{
        void pro(){

            System.out.println("pro in E");
        }

        public static void main(String args[]){

                Y2 x = new E(); // polymorphic assignment

                x.pro(); // polymorphic method call / invocation
        }
}

// E.java:20: error: cannot find symbol
//                 x.pro(); // polymorphic method call / invocation
//                  ^
//   symbol:   method pro()
//   location: variable x of type Y2
// 1 error