// Chapter 1 - Code Magnets
// Rearrange code snippets to make a working Java program with correct output

class Shuffle1 {
    public static void main(String [] args) {

        // declare an integer variable named 'x' and give it a value of 3
        int x = 3;
        // loop as long as 'x' is greater than 0
        while (x > 0) {
            
            // if 'x' is greater than 2, do this
            if (x > 2) {
                // print "a" to the command-line
                System.out.print("a");
            }
            
            // subtract 1 from 3 (value of 'x')
            x = x - 1;
            // print "-" to the command line
            System.out.print("-");

            // if 'x' is equal to 2, do this
            if (x == 2) {
                // print "b c" to the command-line
                System.out.print("b c");
                // subtract 1 from 3 (value of 'x')
                x = x - 1;
            }

            // print "-" to the command line
            System.out.print("-");

            // if 'x' is equal to 1, do this
            if (x == 1) {
                // print "d" to the command-line
                System.out.print("d");
                // subtract 1 from 3 (value of 'x')
                x = x - 1;
            }
        }
    }
}
