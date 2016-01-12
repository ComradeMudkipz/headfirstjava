class PoolPuzzleOne {
    public static void main(String [] args) {
        // declare an integer variable named 'x' and give it the value 0
        int x = 0;

        // keep looping while the variable 'x' is less than 4
        while (x < 4) {
            
            // print "a" to the command-line
            System.out.print("a");
            // if 'x' is greater than 1, do this
            if (x < 1) {
                // print a blank space to the command-line
                System.out.print(" ");
            }
            // print "n" to the command-line
            System.out.print("n");
            // if the variable 'x' is greater than 1, do this
            if (x > 1) {
                // print " oyster" to the command-line
                System.out.print(" oyster");
                // add 2 to the value of the variable 'x'
                x = x + 2;
            }
            // if 'x' is equal to 1, do this
            if (x == 1) {
                // print "noys" to the command-line
                System.out.print("noys");
            }
            // if the variable 'x' is less than 1, do this
            if (x < 1) {
                // print "oise" to the command-line
                System.out.print("oise");
            }
            // print a new line to the command-line
            System.out.println("");
            // add 1 to the value of the variable 'x'
            x = x + 1;
        }
    }
}
