enum Days 
{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

class J 
{
    public static void main(String args[])
    {
        Days day = MONDAY;
        System.out.println(day);
    }
}


// D:\javaprac\51_enum>javac J.java
// J.java:10: error: cannot find symbol
//         Days day = MONDAY;
//                    ^
//   symbol:   variable MONDAY
//   location: class J
// 1 error