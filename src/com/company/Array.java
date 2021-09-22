package com.company;
import java.util.Scanner;

public class Array {

    private int[] elements; // Поле элементов

    public void output(){
        for(int el: elements) //array as el
            System.out.println(el);
    }

    public void input() {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        if (size <= 0){
            System.out.println("ERROR!");
            return; // Защита!
        }
        int[] array = new int[size]; // Создаём массив int размером в size
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        elements = array;
    }

    public void sum(){ // Сумма всех элементов массива
        int sum = 0;
        for(int el: elements) //array as el
            sum += el;
        System.out.println("sum of all numbers " + sum);
    }
    public void Koll_even(){ // Количество четных элементов
        int koll = 0;
        for(int el: elements){
            if(el % 2 == 0){
                koll++;
            }
        }
        System.out.println("number of even numbers: " + koll);
    }
    public void koll_el_A_to_B(){ // Количество элементов в промежутке [A,B]
        Scanner input = new Scanner(System.in);
        int koll = 0;
        int limit_A = input.nextInt();
        int limit_B = input.nextInt();
        if (limit_A < 0){
            System.out.println("ERROR");
            return;
        }
        if (limit_B > elements.length){
            System.out.println("ERROR");
            return;
        }
            for(int i = limit_A; i <= limit_B; i++){
                koll++;
            }
        System.out.println("number of elements belonging to the segment A-B: " + koll);
    }
    public void positive_el(){ //Все ли элементы массива положительны
        int koll = 0;
        String zero = ".";
        for(int i = 0; i < elements.length; i++){ // Это лишь пример цикла для данной программы без использования цикла foreach!
            if (elements[i] >= 0){
                koll++;
            }
            if (elements[i] == 0){
                zero = " and array have 0";

            }
            }
        if (elements.length == koll){
            System.out.println("All array elements are positive" + zero);
        }
        else {
            System.out.println("Not all array elements are positive");
        }
        }
        public void turn_over(){ // Переставить все элементы массива в обратном порядке
            for(int j = elements.length - 1; j >= 0; j--){
                System.out.println(elements[j]);
            }
        }
    }
