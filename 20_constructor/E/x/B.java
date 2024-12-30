package x;

public class B {

    // B(){

    // }
     int y = 20;

}

// a\A.java:7: error: B() is not public in B; cannot be accessed from outside package
//                 B w = new B();
//                       ^

// conclusion : agar hum khud ka construtor bana rahe hai or hum usa ko kissi dusri package mai access karna chahete hai to hame usa constructor ko public mark karn padhega . cons.. ko public mark kr dene se wo outside package main bhi accessble ho jayega.