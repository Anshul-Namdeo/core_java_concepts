class A1 {

        void Laugh(){
            System.out.println("I can Laugh");
        }
}

class A2 extends A1 {

        void Walk(){
            System.out.println("Ican Walk");
        }
}

class A3 extends A2 {

        void talk(){
            System.out.println("Ican talk");
        }
}

class F extends A3{

        public static void main(String[] args){

                F x = new F ();

                x.Laugh();
                x.Walk();
                x.talk();
        }
}