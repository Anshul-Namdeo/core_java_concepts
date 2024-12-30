class I {
    public static void main(String args[]){
        
        String[][] tuDArr = {new String[0], new String[3], new String[2]};

        for( String[] x : tuDArr){
            for(String t : x){
                System.out.print(t + " ");
            }
            System.out.println();
        } 
    }
}

// D:\javaprac\25_arrays>javac I.java

// D:\javaprac\25_arrays>java I

// null null null
// null null
