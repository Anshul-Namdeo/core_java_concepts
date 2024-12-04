public class E {

        public static void main(String[] args){

                D d = new D();

                System.out.println(d instanceof D);
                System.out.println(d instanceof B);
                System.out.println(d instanceof A);
                System.out.println(d instanceof C);
                System.out.println(d instanceof X);
                System.out.println(d instanceof Y);
        }

}

interface X {

}

interface Y extends X {

}

class C {

}
class A extends C implements X{


}

class B extends A implements Y {

}

class D extends B{

}