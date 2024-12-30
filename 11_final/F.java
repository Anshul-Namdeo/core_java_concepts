final class U {

}
class F extends U{

}

// F.java:4: error: cannot inherit from final U
// class F extends U{
//                 ^
// 1 error


// Nahi, hum kisi final class ko extend nahi kar sakte.

// Reason:
// Jab ek class ko final declare kiya jata hai, to usse inherit karne (extend karne) ki permission nahi hoti.
// final class ka purpose hota hai ki uski functionality ko change ya override na kiya ja sake.


// Key Points About final Classes:
// Purpose:
// final class banane ka main reason hai ki koi uski functionality ko inherit karke modify na kar sake.
// Example: Java ke String class ko final banaya gaya hai, taaki koi usse inherit karke change na kar sake.