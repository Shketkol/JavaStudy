package Homework;

import java.util.Arrays;

/*
 ������� ������ �� 100 ���������.
 ��������� ������ ���������� �������.
 ������������� �������� ������� �� �����������.
 ������� �������� ��������� ������� � �������. 
 */

public class Ex1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (10 * Math.random());
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (10 * Math.random());
            System.out.print(array[i] + "; ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
            System.out.print(array[i] + "; ");
        }
		/*
		 * Arrays.sort(array); for(int i = 0; i < array.length; i++){
		 * System.out.print(array[i] + "; "); }
		 */
    }
}