class B1{
    B1(){
        System.out.println(x);
    }

    public static void main(String args[]){

            B1 x = new B1();

            System.out.println(x);
    }
}
// B1.java:3: error: cannot find symbol
//         System.out.println(x);
//                            ^
//   symbol:   variable x
//   location: class B1
// 1 error