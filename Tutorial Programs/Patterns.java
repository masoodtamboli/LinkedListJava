public class Patterns {
    public static void main(String[] args) {
        // pattern9(4);
        // System.out.println();
        // pattern2(4);
        // System.out.println();
        // pattern3(4);
        // System.out.println();
        // pattern4(4);
        // System.out.println();
        // pattern5(4);
        // System.out.println();
        // pattern6(4);
        // System.out.println();
        // pattern7(4);
        // System.out.println();
        // pattern8(4);
        // System.out.println();
        // pattern9(4);
        // System.out.println();
        // pattern10(4);
        // System.out.println();
        // pattern11(4);
        // System.out.println();
        // pattern13(4);
        // System.out.println("HEllo");
    }

    static void pattern13(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print(" ");
            }

            for (int k = 1; k < row * 2; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int row = 1; row <= n; row++) {
            for (int col = row*2-1; col > 1; col--) {
                System.out.print("*");
            }




            System.out.println();
        }

        // for (int row = n-1; row > 0; row--) {
        // for (int col = row * 2; col > 1; col--) {
        // System.out.print("*");
        // }

        // for (int k = 1; k < row; k++) {
        // System.out.print(" ");
        // }
        // System.out.println();
        // }
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = n - row; col >= 1; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int c = row > n ? 2 * n - row : row;
            for (int col = 0; col < c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = n; col > row; col--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= row; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = row; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = row; col < n - 1; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 0; k < row * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {
        for (int row = 0; row < n; row++) {
            for (int k = 0; k < row; k++) {
                System.out.print(" ");
            }
            for (int col = 1; col < n * 2 - row * 2; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = row; col < n - 1; col++) {
                System.out.print(" ");
            }
            System.out.print("* ");
            for (int k = 0; k < row; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - 1; j++) {
                System.out.print(" ");
            }
            for (int m = 0; m < 2; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n) {
        for (int row = 0; row < n; row++) {
            for (int k = 0; k < row; k++) {
                System.out.print(" ");
            }
            for (int col = row; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern12(int n) {

    }
}
