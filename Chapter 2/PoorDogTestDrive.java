class PoorDog {

    private int size;
    private String name;

    public int getSize() {
        return size;        // returns 0; no assigned value
    }
    public String getName() {
        return name;        // returns null; no assigned value
    }

}

public class PoorDogTestDrive {
    public static void main (String[] args) {
        PoorDog one = new PoorDog();
        System.out.println("Dog size is " + one.getSize());
        System.out.println("Dog name is " + one.getName());
    }
}
