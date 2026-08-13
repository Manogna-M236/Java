public class TrainCodes {
    public static void main(String[] args) {

        int[] trainCodes = {101, 202, 303, 404, 505};

        try {
            System.out.println("Train Code: " + trainCodes[2]);

            // Invalid index
            System.out.println("Train Code: " + trainCodes[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Invalid array index!");
        }

        System.out.println("Program continues normally.");
    }
}