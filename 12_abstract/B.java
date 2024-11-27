class B {
    // method declaration 

   abstract void abc();
}

// B.java:1: error: B is not abstract and does not override abstract method abc() in B
// class B {
// ^
// 1 error


// Abstract Method:

// Abstract method ek aisi method hoti hai jisme sirf method signature hota hai, lekin body nahi hoti.
// Abstract method ko abstract keyword ke saath likhna hota hai.
// Abstract methods ka implementation subclass mein kiya jaata hai.
// Abstract Method Requires Abstract Class:

// Agar ek class ke andar ek bhi abstract method ho, to poori class ko abstract declare karna zaroori hai.
// Ek non-abstract class mein abstract methods nahi ho sakte.