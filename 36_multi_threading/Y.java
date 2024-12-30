class Y 
{
    public static void main(String args[])
    {
        ThreadGroup tg = new ThreadGroup("QUAD");
        ThreadGroup parentTg = tg.getParent();

       System.out.println("New Thread Group(QUAD) , without Declaring parent Thread Group , is Child of Defaullt Thread Group (Main) : " + tg.getName());

       System.out.println("QUAD's parent Thread Group : " + parentTg.getName());
    }
}


// D:\javaprac\36_multi_threading>javac Y.java

// D:\javaprac\36_multi_threading>java Y
// New Thread Group(QUAD) , without Declaring parent Thread Group , is Child of Defaullt Thread Group (Main) : QUAD
// QUAD's parent Thread Group : main