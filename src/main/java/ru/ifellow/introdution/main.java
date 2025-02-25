package ru.ifellow.introdution;

public class main {
    public static void main(String[] args) {

        FirstStep firstStep = new FirstStep();
        int x = 20;
        int y = 10;
        System.out.println(firstStep.sum(x, y));
        System.out.println(firstStep.mul(x, y));
        System.out.println(firstStep.div(x, y));
        System.out.println(firstStep.mod(x, y));
        System.out.println(firstStep.isEqual(x, y));
        System.out.println(firstStep.isGreater(x, y));
        System.out.println("зад.7");
        int xLeft = 2;
        int yTop = 3;
        int xRight = 5;
        int yBottom = 6;

        if (firstStep.isInsideRect(xLeft, yTop, xRight, yBottom, x, y)) {
            System.out.println("Точка (" + x + ", " + y + ") находится внутри прямоугольника.");
        } else {
            System.out.println("Точка (" + x + ", " + y + ") не находится внутри прямоугольника.");
        }

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {};
        int[] array3 = {-1, -2, -3};
        System.out.println("зад.8");
        System.out.println("Сумма array 1: " + firstStep.sum(array1));
        System.out.println("Сумма array 2: " + firstStep.sum(array2));
        System.out.println("Сумма array 3: " + firstStep.sum(array3));

        System.out.println("зад.9");
        System.out.println("Произведение array 1:" + firstStep.mul(x, y));
        System.out.println("Произведение array 2:" + firstStep.mul(x, y));
        System.out.println("Произведение array 3:" + firstStep.mul(x, y));

        System.out.println("зад.10");
        System.out.println("Минимум array 1: " + firstStep.min(array1)); // Ожидается 1
        System.out.println("Минимум array 2: " + firstStep.min(array2)); // Ожидается Integer.MAX_VALUE


        System.out.println("зад.11");
        System.out.println("Максимум array 1: " + firstStep.max(array1)); // Ожидается 5
        System.out.println("Максимум array 2: " + firstStep.max(array2));

        System.out.println("зад.12");
        System.out.println("Среднее значение array 1: " + firstStep.average(array1)); //3.0
        System.out.println("Среднее значение array 2: " + firstStep.average(array2)); //0.0

        System.out.println("зад.13");
        int[] array4 = {5, 4, 3, 2, 1};
        int[] array5 = {7, 10, 4, 2, 3};
        int[] array6 = {};
        System.out.println("array 4 упорядочен по убыванию: " + firstStep.isSortedDescendant(array4));
        System.out.println("array 5 упордочен по убыванию: " + firstStep.isSortedDescendant(array5));
        System.out.println("array 6: " + firstStep.sum(array6));


        System.out.println("зад.14");
        FirstStep arrayCube = new FirstStep();
        int[] array = {5, 4, 3, 2, 1};

        System.out.println("Исходный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        arrayCube.cube(array);

        System.out.println("Массив после возведения в куб:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();


        System.out.println("зад.15");
        int[] array9 = new int[]{1, 2, 3, 4, 5};
        System.out.println("Находится ли 3 в array 9: " + firstStep.find(array9, 3)); // Ожидается true
        System.out.println("Находится ли 6 в array 9: " + firstStep.find(array9, 6)); // Ожидается false);

        System.out.println("зад.16");
        System.out.println("Исходный массив:");
        for (int num : array9) {
            System.out.print(num + " ");
        }
        System.out.println();
        firstStep.reverse(array9);
        System.out.println("Массив после переворота:");
        for (int num : array9) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("зад.17. Массив палиндром");
        int[] array10 = {1, 2, 3, 2, 1}; // Палиндром
        int[] array11 = {1, 2, 3, 4, 5}; // Не палиндром
        int[] array12 = {}; // Пустой массив (палиндром)
        int[] array13 = {1};//палиндром

        System.out.println("Массив array10 палиндром : " + firstStep.isPalindrome(array10));
        System.out.println("Массив array11 не палиндром: " + firstStep.isPalindrome(array11));
        System.out.println("Массив array12 палиндром: " + firstStep.isPalindrome(array12));
        System.out.println("Массив array13 палиндром: " + firstStep.isPalindrome(array13));

        System.out.println("зад.18. Двумерный массив.");
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrix2 = null;
        System.out.println("Сумма matrix1: " + firstStep.sum(matrix1));//45
        System.out.println("Сумма matrix2: " + firstStep.sum(matrix2));//0

        System.out.println("Зад.19");

        int[][] matrix3 = {
                {5, 6, 7},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Максимум массива matrix3: " + firstStep.max(matrix3));

        System.out.println("Зад.20");

        int[][] matrix4 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix5 = {};

        System.out.println("Максимум на диагонали массива matrix4: " + firstStep.diagonalMax(matrix4));
        System.out.println("Максимум на диагонали массива matrix5: " + firstStep.diagonalMax(matrix5));//Integer.MIN_VALUE

        System.out.println("Зад.21");

        int[][] matrix6 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2}
        };

        int[][] matrix7 = {
                {3, 2, 1},
                {1, 5, 6},
                {8, 7}
        }; // false - вторая строка не упорядочена

        int[][] matrix8 = {
                {10},
                {},
                {15, 5, 1}
        }; // true - пустая строка считается упорядоченной

        System.out.println("matrix6 отсортирован по убыванию: " + firstStep.isSortedDescendant(matrix6)); // Ожидается true
        System.out.println("matrix7 отсортирован по убыванию: " + firstStep.isSortedDescendant(matrix7)); // Ожидается false
        System.out.println("matrix8 отсортирован по убыванию: " + firstStep.isSortedDescendant(matrix8)); // Ожидается true
        System.out.println("matrix5 отсортирован по убыванию: " + firstStep.isSortedDescendant(matrix5)); // Ожидается true);
    }
}


