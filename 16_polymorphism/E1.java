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

class E1{

        public static void main(String[] args){

            Y2 x = new Y3();

           // x.laugh();
            x.walk();
            x.talk();
            System.out.println(x.toString());
        }
}

// E1.java:23: error: cannot find symbol
//             x.laugh();
//              ^
//   symbol:   method laugh()
//   location: variable x of type Y2
// 1 error