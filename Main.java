class Main {
    public static void main(String[] args) {
        int numRows = 6;
        for (int i = 0; i < numRows; i++) {
            char c = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(c++);
            }
            System.out.println();
        }
    }
}