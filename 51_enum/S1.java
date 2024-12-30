enum GlassSize {
    SMALL(200,'S'), MEDIUM(300,'M'), LARGE(500,'L');

        int ml;
        int lb;

        GlassSize(int ml, char lb)
        {
            this.ml = ml;
            this.lb = lb;
        }

        public String toString() 
        {
            return this.ml +" ->> " + this.lb;
        }
}

class S1
{
    public static void main(String args[])
    {
        GlassSize[] gs = GlassSize.values();

        for(GlassSize g : gs)
        {
            System.out.println(g);
        }
    }
}



// D:\javaprac\51_enum>javac S1.java

// D:\javaprac\51_enum>java S1
// 200 ->> 83
// 300 ->> 77
// 500 ->> 76