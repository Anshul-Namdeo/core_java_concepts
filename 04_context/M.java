class M {

            static int w = 66;

            public static void main(String[] args){

                    M m1 = new M();

                    //<obj.ref.var>.<static member>
                    // m1.w => M.w

                    System.out.println(m1.w);
            }
}