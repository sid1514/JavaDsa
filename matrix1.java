public class matrix1 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 0, 0, 1},
            {1, 1, 1, 1, 0},
            {0, 0, 0, 1, 1},
            {1, 1, 1, 1, 1}
        };

        int maxOnesRow = findMaxOnesRow(matrix);
         for (int i = 0; i < matrix[maxOnesRow].length; i++) {
            System.out.print(matrix[maxOnesRow][i] + " ");
        }
        System.out.println("Row with the maximum number of 1's: " + maxOnesRow);
    }

    public static int findMaxOnesRow(int[][] matrix) {
        int maxOnesRow = 0;
        int maxOnesCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            int onesCount = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    onesCount++;
                }
            }

            if (onesCount > maxOnesCount) {
                maxOnesCount = onesCount;
                maxOnesRow = i;
            }
        }

        return maxOnesRow;

    }

    
}

