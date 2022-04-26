package com.dmitriy.hillel.streamtest.epam.module4;

import java.util.Arrays;


public class CycleSwap {


    public static void main(String[] args) {

        int[] array = new int[]{1, 3, 2, 7, 4};
        CycleSwap.cycleSwap(array);
    }



    static void cycleSwap(int[] array) {

        // создаем копию массива в 2 раза больше исходного
        int[] arrayCopy = Arrays.copyOf(array, array.length * 2);

        // копируем элементы 1го массива повторно заполняя весь массив
        System.arraycopy(arrayCopy, 0, arrayCopy, array.length, array.length);

        // делаем с нулевого индекса нужный вывод массива
        System.arraycopy(arrayCopy, array.length - 1, arrayCopy, 0, array.length);

        // копируем в новый массив и обрезаем до нужной длинны
        array = Arrays.copyOf(arrayCopy,array.length);
        System.out.println(Arrays.toString(array));


    }

    static void cycleSwap(int[] array, int shift) {

        int[] arrayCopy = Arrays.copyOf(array, array.length * 2);
        System.arraycopy(arrayCopy, 0, arrayCopy, array.length, array.length);
        System.arraycopy(arrayCopy, array.length - shift, arrayCopy, 0, array.length);

        array = Arrays.copyOf(arrayCopy,array.length);
        System.out.println(Arrays.toString(array));
    }
}


/*
Описание

Перейдите в класс CycleSwap и реализуйте его статические методы:

    void cycleSwap(int[] array)
    Сдвигает все элементы в данном массиве вправо на 1 позицию.
    В этом случае последний элемент массива становится первым.
    Например, 1 3 2 7 4 становится 4 1 3 2 7.
    void cycleSwap(int[] array, int shift)
    Сдвигает все элементы в заданном массиве вправо на shift позиций.
    Гарантируется, что значение сдвига неотрицательное и не больше длины массива.
    Например, 1 3 2 7 4 со сдвигом 3 становится 2 7 4 1 3.

Для большего интереса при выполнении задания попробуйте не использовать циклы в своем коде (это не обязательно).

Обратите внимание, что входной массив может быть пустым.

Примеры

Ввод:

...
int[] array = new int[]{ 1, 3, 2, 7, 4 };
CycleSwap.cycleSwap(array);
System.out.println(Arrays.toString(array));

Вывод в консоли:

[4, 1, 3, 2, 7]

Ввод:

...
int[] array = new int[]{ 1, 3, 2, 7, 4 };
CycleSwap.cycleSwap(array, 2);
System.out.println(Arrays.toString(array));

Вывод в консоли:

[7, 4, 1, 3, 2]

Ввод:

...
int[] array = new int[]{ 1, 3, 2, 7, 4 };
CycleSwap.cycleSwap(array, 5);
System.out.println(Arrays.toString(array));

Вывод в консоли:

[1, 3, 2, 7, 4]

 */

