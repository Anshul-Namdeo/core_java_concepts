class E2 {

        void pro(){


        }
}

class F1 extends E2 {

        int pro (){

          return 2;
        }
}

// K.java:11: error: pro() in F1 cannot override pro() in E2
//         int pro (){
//             ^
//   return type int is not compatible with void
// 1 error