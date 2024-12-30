class AA {

        public void pro(){

        }
}

class BB extends AA {

        private void pro(){

        }
}

// L.java:10: error: pro() in BB cannot override pro() in AA
//         private void pro(){
//                      ^
//   attempting to assign weaker access privileges; was public
// 1 error