abstract class X1 {

        abstract void pro();
}

class D {

        public static void main(String[] args){

            X1 a;

            System.out.println("hi");
        }
}


// Abstract class ko directly instantiate nahi kar sakte.
// Abstract methods ko subclass mein implement karna padta hai.
// Aap abstract class ka reference variable use kar sakte hain, lekin implementation ek concrete subclass se hi milega.