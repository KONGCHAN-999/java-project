public class mathABS {
    static void diamond() {
        int size = 9, num = 1, halfSize = Math.abs(size / 2);

        for (int i = 1; i <= size; i++) {
            for (int j = halfSize; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < size / 2 + 1) {
                num += 2;
                halfSize -= 1; 
            } else {
                num -= 2; 
                halfSize += 1; 
            }
        }
    }

    public static void main(String[] args) {
        diamond();
    }
}