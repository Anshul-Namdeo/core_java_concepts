class X {

        void Info(){

                System.out.println( "Info method ");
        }
}

class C extends X {

        void pro(){

                System.out.println("Pro method");
        }

        public static void main(String[] args){

                C x = new C ();

                x.Info();
                x.pro();

                System.out.println(x.toString());
                System.out.println(x.hashCode());
                System.out.println(x.getParameterCount());
                System.out.println(x.getName());
               
        }
}

// output 

// Info method
// Pro method
// C@36baf30c
// 918221580