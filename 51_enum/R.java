enum GlassSize {
    SMALL(200), MEDIUM(300), LARGE(500) ;

    int ml;

    GlassSize(int ml) 
    {
        this.ml = ml;
    }
}

class R 
{
    public static void main(String args[])
    {
        GlassSize gs = GlassSize.SMALL;
        GlassSize gs1 = GlassSize.MEDIUM;
        GlassSize gs2 = GlassSize.LARGE;

        System.out.println(gs.ml);
        System.out.println(gs1.ml);
        System.out.println(gs2.ml);
    }
}


// D:\javaprac\51_enum>javac R.java

// D:\javaprac\51_enum>java R
// 200
// 300
// 500