public class nestingLoops {
    public static void main(String[] args) {
        // this is #1 - I'll call it "CN"
        for (char n = 'A'; n <= 'E'; n++) {
            for (int c = 1; c <= 3; c++) {
                System.out.println(c + " " + n);
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.println(a + "-" + b + " ");
            }
            System.out.println();
        }

        System.out.println("\n");

        // 1. inner loop
        // 2. the numbers and letters switch places
        // 3. each number pair is on a new line
        // 4. There is a line break after every 3rd number pair
    }
}