class AAA {

        /*private */ void pro(){

        }
}

class BBB extends AAA {

        static public void pro(){

        }
}

// P1.java:10: error: pro() in BBB cannot override pro() in AAA
//         static public void pro(){
//                            ^
//   overriding method is static
// 1 error