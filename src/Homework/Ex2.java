package Homework;

/*
 ¬торое задание. 
 ѕеребрать все значение int, byte, char и вывести минимальные и максимальные значени€ в консоль.
 */

public class Ex2 {
    public static void main(String[] args) {
        // ћаксимальное и минимальное int
        int[] array_int = new int[10];
        for (int i = 0; i < array_int.length; i++) {
            array_int[i] = (int) (100 * Math.random());
            System.out.print(array_int[i] + "; ");
        }
        System.out.println();
        int max_int = array_int[0];
        int min_int = array_int[0];
        for (int i = 0; i < array_int.length; i++) {
            if (max_int < array_int[i]) {
                max_int = array_int[i];
            }
        }
        System.out.println(max_int);
        for (int i = 0; i < array_int.length; i++) {
            if (min_int > array_int[i]) {
                min_int = array_int[i];
            }
        }
        System.out.println(min_int);

        // ћаксимальное и минимальное byte
        byte[] array_byte = new byte[10];
        for (byte i = 0; i < array_byte.length; i++) {
            array_byte[i] = (byte) (10 * Math.random());
            System.out.print(array_byte[i] + "; ");
        }
        System.out.println();
        int max_byte = array_byte[0];
        int min_byte = array_byte[0];
        for (byte i = 0; i < array_byte.length; i++) {
            if (max_byte < array_byte[i]) {
                max_byte = array_byte[i];
            }
        }
        System.out.println(max_byte);
        for (byte i = 0; i < array_byte.length; i++) {
            if (min_byte > array_byte[i]) {
                min_byte = array_byte[i];
            }
        }
        System.out.println(min_byte);

        // ћаксимальное и минимальное char
        System.out.println((int)Character.MAX_VALUE);
        System.out.println((int)Character.MIN_VALUE);
    }
}