class W{
    public static void main(String args[]){

        String[][] y = { {"a","b"}, {"c","d","e","f","g"}, {"h","i","j"} };

        for(String[] t : y){
            for(String w : t){
                System.out.print(w + " ");
            }
            System.out.println();
        }
    }
}

// a b 
// c d e f g 
// h i j 