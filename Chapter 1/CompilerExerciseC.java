class Exercise1b {
    public static void main(String [] args) { // Added missing method
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("small x");
            }
        }           // The 'while' loop must be inside
    }               // a method. It can't just be
}                   // hanging out inside the class
