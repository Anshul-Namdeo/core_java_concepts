class X12 
{
    void pro()
    {
        System.out.println("AAA");
    }
}

class R extends X12 
{
    void info() 
    {
        System.out.println("BBB");
    }

    public static void main(String args[])
    {
        X12 t = new R();
        t.info();
    }
}


// Note : compile tym par compiler ye cheak karta hai ki variable ka type kya hai to yaha per jo (t) variable hai usa ka type (X12) type ka hai or hum usa (t) variable ke throw info() ko call kr rahe hai to (t) variable (x12) type ka mtlb hai ki X12 class mai bhi wo method hona chahiye jis method ko t variable access kar raha hai. agr wo method X12(class) mai nhi hogu to error aa jayega..


// D:\javaprac\49_inner_classes>javac R.java
// R.java:19: error: cannot find symbol
//         t.info();
//          ^
//   symbol:   method info()
//   location: variable t of type X12
// 1 error
