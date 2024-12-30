// enum GlassSize {
//     SMALL, MEDIUM, LARGE
// }

class GlassSize 
{
    String value;

    public static final GlassSize SMALL = new GlassSize("SMALL");
    public static final GlassSize MEDIUM = new GlassSize("MEDIUM");
    public static final GlassSize LARGE = new GlassSize("LARGE");

    private GlassSize(String value) {
        this.value = value;
    }

    public String toString() 
    {
        return value;
    }
}

class Q 
{
    public static void main(String args[])
    {
        // GlassSize gs = GlassSize.MEDIUM;
        GlassSize gs = GlassSize.LARGE;
        // GlassSize gs = GlassSize.SMALL;
        System.out.println(gs.value);
    }
}

// D:\javaprac\51_enum>javac Q.java

// D:\javaprac\51_enum>java Q
// SMALL

// D:\javaprac\51_enum>javac Q.java

// D:\javaprac\51_enum>java Q
// MEDIUM

// D:\javaprac\51_enum>javac Q.java

// D:\javaprac\51_enum>java Q
// LARGE