class Exercise1b {
    public static void main(String [] args) {
        int x = 1;
        while (x < 10) {
            x = x + 1; // added missing statement to print line
            if (x > 3) {
                System.out.println("big x");
            }          // This will compile and run (no output), but
        }              // without a line added to the program, it
    }                  // would run forever in a infinite 'while' loop!
}
