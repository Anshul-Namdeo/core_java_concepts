abstract class L {
    final abstract void pro();    
}


// L.java:2: error: illegal combination of modifiers: abstract and final
//     final abstract void pro();
//                         ^
// 1 error


// abstract aur final dono ko ek method ke saath use nahi kiya ja sakta.
// Agar tum method ko override karne ke liye chahte ho, toh tumhe abstract use karna chahiye.
// Agar tum method ko override nahi hone dena chahte, toh tumhe final use karna chahiye.