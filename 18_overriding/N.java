class AAA {
    void pro(){

    }
}

class BBB extends AAA {

        private void pro(){

        }
}

// N.java:9: error: pro() in BBB cannot override pro() in AAA
//         private void pro(){
//                      ^
//   attempting to assign weaker access privileges; was package
// 1 error