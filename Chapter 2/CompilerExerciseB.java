// Determine if this file will compile. If they won't, fix them.

class DVDPlayer {

    boolean canRecord = false;

    void playDVD() {    // added missing method
        System.out.println("DVD playing");
    }

    void recordDVD() {
        System.out.println("DVD recording");
    }
}

class DVDPlayerTestDrive {
    public static void main(String [] args) {

        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();

        if (d.canRecord == true) {
            d.recordDVD();
        }
    }
}
