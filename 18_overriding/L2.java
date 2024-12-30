class AA {

        public void pro(){

        }
}

class BB extends AA {

        protected void pro(){

        }
}

// L2.java:10: error: pro() in BB cannot override pro() in AA
//         protected void pro(){
//                        ^
//   attempting to assign weaker access privileges; was public
// 1 error