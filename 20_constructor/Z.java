class D1 {

        D1(int y){

                System.out.println(y);
        }
}

class Z extends D1 {

        int t = 9;

        Z(){
            super(12);
        }

        public static void main(String args[]){

                Z q = new Z();

                System.out.println(q.t);
        }
}

