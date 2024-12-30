class D {

        public static void main(String args[]){

                // D x = new D();

                D x = new D(12);

                System.out.println(x);

        }
}

// D.java:7: error: constructor D in class D cannot be applied to given types;
//                 D x = new D(12);
//                       ^
//   required: no arguments
//   found:    int
//   reason: actual and formal argument lists differ in length
// 1 error