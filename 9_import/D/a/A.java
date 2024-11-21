package a;

// import b.B;
// import c.d.B;

class A{

        public static void main(String[] args){

                b.B  x = new b.B();

                System.out.println(x.y);

                c.d.B  z = new c.d.B();

                System.out.println(z.y);
        }

}

// D:\javaprac\9_import\D> javac a/A.java

// D:\javaprac\9_import\D> java a/A
// 99
// 100