class X {

        int a = 9;
}
interface Y {
        int a = 11;
}
class F2 extends X implements Y{

        public static void main(String args[]){

                Y f = new  F2();

                System.out.println(f.a);
        }
}