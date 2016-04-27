package com.javarush.test.level15.lesson04.task02;

/* ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.
*/

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, Integer n, Object value){}
    public static void printMatrix(Integer m, Integer n, Object value){}
    public static void printMatrix(int m, Long n, Object value){}
    public static void printMatrix(Long m, List<Long> n, Object value){}
    public static void printMatrix(List<String > m, Integer n, Object value){}
    public static void printMatrix(Object value, int m, Integer n){}
    public static void printMatrix(int m, Object value, Integer n){}
    public static void printMatrix(Integer n, Object value, int m){}

}
