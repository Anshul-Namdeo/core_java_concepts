class B{

        // Static initialization Block
        static{

                System.out.println("A");
        }

        public static void main(String args[]){

                B x = new B();
                B y = new B();
                B z = new B();
        }
}

// concluion : static block object class ke load hote hi execute ho jaata hai .