enum GlassSize 
{
    SMALL(200,'S'), MEDIUM(300,'M'), LARGE(500,'L'){
        public void pro()
        {
            System.out.println("hello");
        }
    };

    void pro()
    {
        System.out.println("hi");
    }

    int ml;
    int lb;

    GlassSize(int ml, char lb){
        this.ml= ml;
        this.lb= lb;
    }

    public String toString()
    {
        return this.ml + " -->> " + this.lb;
    }
}

class Z 
{
    public static void main(String args[])
    {
        GlassSize.SMALL.pro();
        GlassSize.MEDIUM.pro();
        GlassSize.LARGE.pro();
    }
}


// D:\javaprac\51_enum>javac Z.java

// D:\javaprac\51_enum>java Z
// hi
// hi
// hello