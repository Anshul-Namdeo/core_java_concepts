class AAA {

        protected void pro(){

        }
}
class BBB extends AAA {

        private void pro(){

        }
}

// M.java:9: error: pro() in BBB cannot override pro() in AAA
//         private void pro(){
//                      ^
//   attempting to assign weaker access privileges; was protected
// 1 error
