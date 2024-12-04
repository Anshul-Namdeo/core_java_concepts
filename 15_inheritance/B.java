class B {

        void pro(){

                System.out.println("pro");
        }


        public static void main(String[] args){

                B x = new B();

                x.pro();

               System.out.println(x.toString());
        
               System.out.println(x.hashCode());
        }
}

//output 

// pro
// B@4617c264
// 1175962212