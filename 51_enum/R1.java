enum GlassSize {
    SMALL(200), MEDIUM(300), LARGE(500);

        int ml;

        GlassSize(int ml)
        {
            this.ml = ml;
        }
}

class R1 
{
    public static void main(String args[])
    {
        GlassSize[] gs = GlassSize.values();

        for(GlassSize g : gs)
        {
            System.out.println(g + ":" + g.ml);
        }
    }
}


// D:\javaprac\51_enum>javac R1.java

// D:\javaprac\51_enum>java R1
// SMALL:200
// MEDIUM:300
// LARGE:500