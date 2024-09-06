class Main2 {
    public static void main(String[] args) {
        int numRows = 6;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }
    }
}