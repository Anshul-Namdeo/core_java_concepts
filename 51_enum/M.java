class M 
{
    enum Days 
    {
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
    }

    public static void main(String args[])
    {
        Days day = Days.TUESDAY;

        System.out.println(day);
    }
}

// D:\javaprac\51_enum>javac M.java

// D:\javaprac\51_enum>java M
// TUESDAY