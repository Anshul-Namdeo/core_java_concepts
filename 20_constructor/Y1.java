class D1 {

        D1(int y){

                System.out.println(y);
        }
}

class Y1 extends D1 {

       static int t = 9;

        Y1(){
            super(t);
        }

        public static void main(String args[]){

                Y1 q = new Y1();

                System.out.println(q.t);
        }
}

