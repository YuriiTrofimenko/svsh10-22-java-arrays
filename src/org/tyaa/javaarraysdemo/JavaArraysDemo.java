package org.tyaa.javaarraysdemo;

import java.util.ArrayList;

/**
 *
 * @author student
 */
//Главный класс приложения
public class JavaArraysDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Переменная примитивного типа
        // int myVar = 100;
        //String
        // System.out.println("myVar = " + myVar);
        //Переменная ссылочного типа
        // String s1 = "myVar = ";
        // System.out.println(s1 + myVar);
        // s1 = s1.toLowerCase();
        // System.out.println(s1 + myVar);
        // 0 1 2 3 ...
        //int[] intArray1 = {14, -1, 0, 500, 0, 7, 90, -10};
        // System.out.println(intArray1[1]);
        /* for (int i = 0; i < intArray1.length; i++) {
            System.out.println(intArray1[i]);
        } */
        /*for (int item : intArray1) {
            System.out.println(item);
        }*/
        
        int[][] table = new int[11][11];
        //Цикл создания строк
        for (int i = 0; i < table.length; i++) {
            // System.out.println(i);
            
            //v1
            // int[] row = new int[11];
            // table[i] = row;
            
            //v2
            table[i] = new int[11];
            
            //Цикл создания значений в текущей строке
            //v1
            // for (int j = 0; j < row.length; j++) {
            //v2
            for (int j = 0; j < table[i].length; j++) {
                //Когда номер строки i - 0 - сохраняем номер столбца
                if (i == 0) {
                    // System.out.printf("%4d", j);
                    //Обращаемся к строке i, столбцу j
                    //и сохраняем туда (в текущую ячейку) вычисленное значение
                    table[i][j] = j;
                //Когда номер столбца j - 0 - сохраняем номер строки
                } else if (j == 0) {
                    // System.out.printf("%4d", i);
                    table[i][j] = i;
                //Иначе сохраняем перемножение номера строки и столбца
                } else {
                    // System.out.printf("%4d", i * j);
                    table[i][j] = i * j;
                }
            }
            // System.out.println();
        }
        
        //Проверка вывода всех значений из двумерного массива
        //(массива ссылок на массивы целых значений)
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.printf("%4d", table[i][j]);
            }
            //Перенос на следующую строку
            System.out.println();
        }
    }
    
}
