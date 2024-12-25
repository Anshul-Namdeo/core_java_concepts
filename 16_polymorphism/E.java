class Y1 {
    void talk(){
        System.out.println("I can talk");
    }
}
class Y2 extends Y1{
    void walk(){
        System.out.println("I can walk");
    }
}
class Y3 extends Y2{
    void laugh(){
        System.out.println("I can laugh");
    }
}

class E {

        public static void main(String[] args){

            Y3 x = new Y3();

            x.laugh();
            x.walk();
            x.talk();
            System.out.println(x.toString());
        }
}