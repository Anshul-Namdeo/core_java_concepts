class B {
    void pro(){
        System.out.println(x);
    }

    public static void main(String args[]){

            B x = new B();
            x.pro();
    }
}
// B.java:3: error: cannot find symbol
//         System.out.println(x);
//                            ^
//   symbol:   variable x
//   location: class B
// 1 error

