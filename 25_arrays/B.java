class B {
    public static void main(String args[]){
    System.out.println(args.length);
        for(String x : args){
            System.out.print(x + " ");
        }
    }
}

// 1) i/p java B mohan saxena vijay kumar dahiya anshul namdeo

// D:\javaprac\25_arrays>javac B.java

// D:\javaprac\25_arrays>java B mohan saxena vijay kumar dahiya anshul namdeo
// 7
// mohan saxena vijay kumar dahiya anshul 

// 2) i/p java B "mohan saxena" "vijay kumar dahiya"  "anshul namdeo"

// D:\javaprac\25_arrays>javac B.java

// D:\javaprac\25_arrays>java B "mohan saxena" "vijay kumar dahiya"  "anshul namdeo"
// 3
// mohan saxena vijay kumar dahiya anshul namdeo

// 3) i/p java B "mohan saxena" "vijay kumar dahiya"  'anshul namdeo'

// D:\javaprac\25_arrays>javac B.java

// D:\javaprac\25_arrays>java B "mohan saxena" "vijay kumar dahiya"  'anshul namdeo'
// 4
// mohan saxena vijay kumar dahiya 'anshul namdeo'
