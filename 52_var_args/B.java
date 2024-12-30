class B 
{
    void pro (int a, int b)
    {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String args[])
    {
        B a = new B();

        int[] x = {4,5};

        a.pro(x);
    }
}


// B.java:15: error: method pro in class B cannot be applied to given types;
//         a.pro(x);
//          ^
//   required: int,int
//   found:    int[]
//   reason: actual and formal argument lists differ in length
// 1 error