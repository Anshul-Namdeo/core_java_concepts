class G {


        // G(int a){

        // }
        public static void main(String args[]){


                
                G x = new G();

                System.out.println(x);
        }
}

// G.java:11: error: constructor G in class G cannot be applied to given types;
//                 G x = new G();
//                       ^
//   required: int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error


// conclusion : compiler provided constructor is no parameteried constructor mai ki usa mai ki parameter mai kissi bhi type ka variable nhi hota hai 