class A {

        // Inatance (non-static) Initialization Block

        {

                System.out.println("A");
        }

        public static void main(String args[]){

                A x = new A();
                A y = new A();
                A z = new A();


        }
}


// Conclusion : Instance initialization block Construtor ke andar se run hota hai .