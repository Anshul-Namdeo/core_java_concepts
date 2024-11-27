abstract class M {
    static abstract void pro();    
}


// M.java:2: error: illegal combination of modifiers: abstract and static
//     static abstract void pro();
//                          ^
// 1 error


// abstract method ko static nahi bana sakte, kyunki static methods ko class level par direct call kiya ja sakta hai, aur abstract methods ka use inheritance ke liye hota hai, jo object-oriented behavior ka part hai. Static methods ko subclass ke through override nahi kiya ja sakta, jo abstract method ke concept ke against hai.
// abstract method ko static nahi banaya ja sakta.
// abstract ka use inheritance aur object-oriented concepts ke liye hota hai, jabki static ka use class level pe method call karne ke liye hota hai.