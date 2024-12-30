enum GlassSize {
    SMALL(200,'S'), MEDIUM(300,'M'), LARGE(500,'L');

        int ml;
        int lb;

        GlassSize(int ml, char lb)
        {
            this.ml = ml;
            this.lb = lb;
        }
}

class S 
{
    public static void main(String args[])
    {
        GlassSize[] gs = GlassSize.values();

        for(GlassSize g : gs)
        {
            System.out.println(g + ":" + g.ml + " -> " + g.lb);
        }
    }
}



// D:\javaprac\51_enum>javac S.java

// D:\javaprac\51_enum>java S
// SMALL:200 -> 83
// MEDIUM:300 -> 77
// LARGE:500 -> 76

