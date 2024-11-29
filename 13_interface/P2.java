interface Smart{

}

interface Intelligent {

}

interface Beautiful {

}

class Human {

}

class American implements Smart,Intelligent, Beautiful extends Human{
    
}

// p2.java:17: error: '{' expected
// class American implements Smart,Intelligent, Beautiful extends Human{
//                                                       ^
// 1 error