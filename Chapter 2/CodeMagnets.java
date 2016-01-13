// TODO: Add comments

class DrumKit {

    // declare a boolean variable named "snare" and set it as true
    boolean snare = true;

    // declare a boolean variable named "topHat" and set it as true
    boolean topHat = true;

    // create a method named "playSnare" and do this
    void playSnare() {
        System.out.println("bang bang ba-bang");
    }

    // create a method named "playTopHat" and do this
    void playTopHat () {
        System.out.println("ding ding da-ding");
    }
}

class DrumKitTestDrive {
    public static void main(String [] args) {

        // create a new object with the pre-defined variables
        DrumKit d = new DrumKit();
        
        // call the "playSnare" method
        d.playSnare();
        // set the boolean variable "snare" as false
        d.snare = false;
        // call the "playTopHat" method
        d.playTopHat();
        if (d.snare == true) {
            // call the method "playSnare" if the method is true
            d.playSnare();
        }
    }
}
