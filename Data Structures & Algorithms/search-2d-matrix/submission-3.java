class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int row = verticalSearch(matrix, target);
        if (row == -1) {
            return false;
        }

        int left = 0;
        int right = matrix[row].length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static int verticalSearch(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length - 1;
        int lastCol = matrix[0].length - 1;

        // First check if target is outside matrix bounds
        if (target < matrix[0][0] || target > matrix[bottom][lastCol]) {
            return -1;
        }

        while (top <= bottom) {
            int mid = top + (bottom - top) / 2;

            // Check if target is in current row
            if (target >= matrix[mid][0] && target <= matrix[mid][lastCol]) {
                return mid;
            }
            else if (target < matrix[mid][0]) {
                bottom = mid - 1;
            }
            else {
                top = mid + 1;
            }
        }

        return -1;
    }
}
