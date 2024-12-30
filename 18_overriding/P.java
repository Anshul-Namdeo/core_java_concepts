class AAA {

       /* private */ void pro(){

        }
}

class BBB extends AAA {

        public int pro(){
            return 0;
        }
}

// P.java:10: error: pro() in BBB cannot override pro() in AAA
//         public int pro(){
//                    ^
//   return type int is not compatible with void
// 1 error