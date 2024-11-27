class A {
    // method definition
    void abc(){

    }
    // method declaration 
    void mno();
}

// A.java:7: error: missing method body, or declare abstract
//     void mno();
//          ^
// 1 error

// Abstract Method Declaration:

// Abstract methods wo hote hain jinmein sirf method ka naam aur signature hota hai, lekin body nahi hoti.
// Abstract methods ko abstract keyword ke saath define karna hota hai.
// Abstract method ko sirf abstract class ke andar rakha ja sakta hai.
// Non-Abstract Class Cannot Contain Abstract Methods:

// Agar ek class abstract method rakhti hai, to class ko bhi abstract hona chahiye, kyunki abstract methods ka implementation subclass mein hota hai.