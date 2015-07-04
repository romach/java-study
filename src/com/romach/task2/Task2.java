package com.romach.task2;

/**
 Перебрать все значение типов данных int, byte, char и вывести минимальные и
 максимальные значения в консоль.

 p.s.

 int, byte, char - это примитивные типы данных
 Перебор осуществлять в цикле.
 */
public class Task2 {

    public Task2() {

    }

    public static void main(String[] args) {
        new Task2().start();
    }

    private void start() {
        showInfoAboutInt();
        showInfoAboutByte();
        showInfoAboutChar();
    }

    private void showInfoAboutInt() {
        int maximumValue = 0;
        int minimumValue = 0;
        int typeValue = Integer.MIN_VALUE;
        while (true) {
            maximumValue = maximumValue > typeValue ? maximumValue : typeValue;
            minimumValue = minimumValue < typeValue ? minimumValue : typeValue;
            if (typeValue == Integer.MAX_VALUE) {
                break;
            }
            typeValue++;
        }
        System.out.println("Integer:");
        System.out.println("Max value: " + maximumValue);
        System.out.println("Min value: " + minimumValue);
    }

    private void showInfoAboutByte() {
        byte maximumValue = 0;
        byte minimumValue = 0;
        byte typeValue = Byte.MIN_VALUE;
        while (true) {
            maximumValue = maximumValue > typeValue ? maximumValue : typeValue;
            minimumValue = minimumValue < typeValue ? minimumValue : typeValue;
            if (typeValue == Byte.MAX_VALUE) {
                break;
            }
            typeValue++;
        }
        System.out.println("Byte:");
        System.out.println("Max value: " + maximumValue);
        System.out.println("Min value: " + minimumValue);
    }

    private void showInfoAboutChar() {
        char maximumValue = 0;
        char minimumValue = 0;
        char typeValue = Character.MIN_VALUE;
        while (true) {
            maximumValue = maximumValue > typeValue ? maximumValue : typeValue;
            minimumValue = minimumValue < typeValue ? minimumValue : typeValue;
            if (typeValue == Character.MAX_VALUE) {
                break;
            }
            typeValue++;
        }
        System.out.println("Char:");
        System.out.println("Max value: " + (int)maximumValue);
        System.out.println("Min value: " + (int)minimumValue);
    }
}
