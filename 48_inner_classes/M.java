class M 
{
    int w = 122;

    {
        System.out.println(w);
    }

    void pro()
    {
        System.out.println(w);
    }

    M() 
    {
        System.out.println(w);
    }

    class N 
    {
        void info()
        {
            System.out.println(w);
        }
    }
}

.. // hapily compile and run...