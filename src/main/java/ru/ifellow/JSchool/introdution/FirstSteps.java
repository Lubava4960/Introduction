package ru.ifellow.JSchool.introdution;

public class FirstSteps {

    public int sum(int x, int y) {
        return x + y;

    }

    public int mul(int x, int y) {
        return x * y;
    }

    public int div(int x, int y) {
        if (y != 0) {
            return x / y;
        }
        throw new ArithmeticException("Делить на 0 нельзя!");
    }

    public int mod(int x, int y) {
        if (y != 0) {
            return x % y;
        }
        throw new ArithmeticException(" y не может быть равен 0");
    }

    public boolean isEqual(int x, int y) {
        return x == y;

    }

    public boolean isGreater(int x, int y) {
        return x > y;

    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return (x >= xLeft && x <= xRight) && (y >= yTop && y <= yBottom);

    }

    public int sum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;

        }
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;

    }

    public int mul(int[] array) {
        if (array == null || array.length == 0) {
            return 0;

        }
        int total = 0;
        for (int num : array) {
            total *= num;
        }
        return total;
    }

    public int min(int[] array) {

        if (array == null || array.length == 0) {
            return Integer.MAX_VALUE;
        }
        int minValue = array[0];
        for (int num : array) {
            minValue = Math.min(minValue, num);
        }
        return minValue;
    }

    public int max(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }
        int maxValue = array[0];
        for (int num : array) {
            maxValue = Math.max(maxValue, num);
        }
        return maxValue;
    }

    public double average(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public boolean isSortedDescendant(int[] array) {
        if (array == null || array.length == 0) {
            return true;
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;

    }

    public void cube(int[] array) {
        if (array == null) {
            return;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }

    }


    public boolean find(int[] array, int value) {
        if (array == null) {
            return false;
        }
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;

    }

    public void reverse(int[] array) {
        if (array == null) {
            return;
        }
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }


    public boolean isPalindrome(int[] array) {
        if (array == null || array.length == 0) {
            return true;
        }
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            if (array[left] != array[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public int sum(int[][] matrix) {
        if (matrix == null) {
            return 0;
        }
        int totalSum = 0;
        int i = 0;
        while (i < matrix.length) {
            if (matrix[i] != null) {
                for (int j = 0; j < matrix[i].length; j++) {
                    totalSum += matrix[i][j];
                }
            }

            i++;
        }
        return totalSum;
    }

    public int max(int[][] matrix) {
        if (matrix == null) {
            return 0;
        }
        int maxValue = Integer.MIN_VALUE;
        int i = 0;
        while (i < matrix.length) {
            if (matrix[i] != null) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] > maxValue) {
                        maxValue = matrix[i][j];
                    }
                }
            }
            i++;
        }
        return maxValue;
    }

    public int diagonalMax(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix.length != matrix[0].length) {
            return Integer.MIN_VALUE;
        }
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            maxValue = Math.max(maxValue, matrix[i][i]);
        }

        return maxValue;
    }

    public boolean isSortedDescendant(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return true;
        }

        for (int[] row : matrix) {

            if (!isSortedDescendant(row)) {
                return false;
            }
        }

        return true;
    }

}
