class D1
{
    // member variable 
    int x = 89;

    // member method 
     void pro()
     {

     }

     //member class
     class Y 
     {

     }

     public static void main(String args[])
     {
            pro();
     }
}

// D:\javaprac\48_inner_classes>javac D1.java
// D1.java:20: error: non-static method pro() cannot be referenced from a static context
//             pro();
//             ^
// 1 error
