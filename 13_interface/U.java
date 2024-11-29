class A  { }

class B { }

class C { }

// interface D implements A { }
// interface D implements A, B { }
// interface D implements E { }
interface D implements E, F { }

interface E { }

interface F { }

// U.java:10: error: '{' expected
// interface D implements E, F { }
//            ^
// 1 error