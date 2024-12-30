class Z {

        void pro(){

        }
}

class H extends Z {

        static void pro(){

        }
}

// H.java:10: error: pro() in H cannot override pro() in Z
//         static void pro(){
//                     ^
//   overriding method is static
// 1 error