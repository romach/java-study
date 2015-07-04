package com.romach.task1;

import java.util.Random;

/**
 Создать массив на 100 элементов.
 Заполнить массив случайными числами.
 Отсортировать элементы массива по возрастанию.
 Вывести значения элементов массива в консоль.

 p.s.
 Массив берите типа int.
 Если кто то будет инициализировать массив в ручную, тогда число элементов массива не 100 а 1000.
 Сортировку рекомендую делать методом пузырька (Просто и наглядно).
 */
public class Task1 {

    private static final int ARRAY_LENGTH = 100;

    public Task1() {

    }

    public static void main(String[] args) {
        new Task1().start();
    }

    private void start() {
        int[] array = new int[ARRAY_LENGTH];
        fillArrayWithRandomValues(array);
        bubbleSort(array);
        printArray(array);
    }

    private void fillArrayWithRandomValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            Random randomGenerator = new Random();
            array[i] = randomGenerator.nextInt();
        }
    }

    private void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            shiftMinimumElementToStart(array, i);
        }
    }

    private void shiftMinimumElementToStart(int[] array, int startPosition) {
        for (int i = array.length - 2; i >= startPosition; i--) {
            if (array[i+1] < array[i]) {
                swapElements(array, i, i+1);
            }
        }
    }

    private void swapElements(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }
}
