abstract class X4 {

        abstract void abc();
}

abstract class G extends X4{

        public static void main(String[] args){

                System.out.println("hello ji kaise ho ");
        }
}


// Agar tum G class ko abstract mark kar dete ho, toh abc() method ko override karne ki zarurat nahi hai, kyunki G class khud abstract hai aur abstract classes ko direct instantiate nahi kiya ja sakta. Matlab, tum G class ko directly object create karke nahi use kar sakte.

// Jab G ko abstract mark karte ho, toh tum abc() method ko G mein implement karne ki obligation se bach jaate ho. Par abc() ko implement karne ki responsibility us class ko milegi jo G ko extend karegi.