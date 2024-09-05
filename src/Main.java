import java.util.Scanner;
import java.lang.Math;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void Task1(){
        System.out.print("Введите целое число и программа определит чётное оно или нет:\t");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.print("Число чётное");
        }
        else{
            System.out.print("Число нечётное");
        }
        System.out.print("\n");
    }
    public static void Task2(){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 3; i++){
            System.out.print("Введите целое число №" + (i + 1) + ":\t");
            int num = sc.nextInt();
            if(num < min){
                min = num;
            }
        }
        System.out.print("Минимальное число:\t" + min);
        System.out.print("\n");
    }
    public static void Task3(){
        for(int i = 1; i < 11; i++){
            System.out.print("5 * " + i + " = " + (5 * i) + "\n");
        }
        System.out.print("\n");
    }
    public static void Task4(){
        System.out.print("Введите целое число N и программа выведет сумму всех целых чисел от 1 до N:\t");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < N + 1; i++){
            sum += i;
        }
        System.out.print("сумма целых чисел от 1 до введённого числа:\t" + sum);
        System.out.print("\n");
    }
    public static void Task5(){
        int num1 = 0;
        int num2 = 1;
        System.out.print("Введите целое число N и программа выведет N чисел Фибоначчи:\t");
        int N = sc.nextInt();
        for(int i = 0; i < N + 1; i++){
            System.out.print("№" + i + " " + num1 + "\n");
            int numA = num1;
            num1 = num2;
            num2 += numA;
        }
        System.out.print("\n");
    }
    public static void Task6(){
        boolean prime;
        System.out.print("Введите целое число и программа определит, является ли оно простым:\t");
        int num = sc.nextInt();
        prime = (num > 1) && (num % 2 != 0) && (num % 3 != 0);
        int i = 5;
        int d = 2;
        while(prime && (i * i <= num)) {
            prime = num % i != 0;
            i += d;
            d = 6 - d;
        }
        if(prime == false  && num != 1 && num != 2 && num != 3){
            System.out.print("Число составное");
        }
        else{
            System.out.print("Число простое");
        }
        System.out.print("\n");
    }
    public static void Task7(){
        System.out.print("Введите целое число чтобы запустить обратный отсчёт:\t");
        int N = sc.nextInt();
        for (int i = N; i > 0; i--){
            System.out.print(i + "\n");
        }
        System.out.print("\n");
    }
    public static void Task8(){
        System.out.print("Введите целое число A и целое число B чтобы программа посчитала сумму всех чётных чисел между A и B:\n");
        int sum = 0;
        int A = sc.nextInt();
        int I = A % 2 == 0 ? A : A + 1;
        int B = sc.nextInt();
        int N = B % 2 == 0 ? B + 1 : B;
        for(int i = I; i < N; i += 2){
            sum += i;
        }
        System.out.print("Сумма чётных чисел:\t" + sum);
        System.out.print("\n");
    }
    public static void Task9(){
        System.out.print("Введите строку:\t");
        sc.nextLine();
        String input = sc.nextLine();
        for(int i = input.length(); i > 0; i--){
            char c = input.charAt(i - 1);
            System.out.print(c);
        }
        System.out.print("\n");
    }
    public static void Task10(){
        int count = 0;
        System.out.print("Введите число:\t");
        int input = sc.nextInt();
        do{
            count++;
            input /= 10;
        }while (input != 0);
        System.out.print("Количество цифр в числе:\t" + count);
        System.out.print("\n");
    }
    public static void Task11(){
        int fact = 1;
        System.out.print("Введите число N и программа высчитает факториал N:\t");
        int N = sc.nextInt();
        for(int i = 1; i < N + 1; i++){
            fact *= i;
        }
        System.out.print("Факториал от " + N + " = " + fact);
        System.out.print("\n");
    }
    public static void Task12(){
        int sum = 0;
        System.out.print("Введите число:\t");
        int input = sc.nextInt();
        do{
            sum += input % 10;
            input /= 10;
        }while (input != 0);
        System.out.print("Сумма цифр в числе:\t" + sum);
        System.out.print("\n");
    }
    public static void Task13(){
        boolean pal;
        System.out.print("Введите строку и программа определит, является ли она палиндромом:\t");
        sc.nextLine();
        String input = sc.nextLine().replace(" ", "").toLowerCase();
        if(input.length() % 2 == 0){
            String altInput = "";
            for(int i = input.length(); i > input.length()/2 + 1; i--){
                char c = input.charAt(i - 1);
                altInput = altInput + c;
            }
            pal = input.substring(0, input.length()/2 - 1).equals(altInput);
        }
        else{
            String altInput = "";
            for(int i = input.length(); i > (input.length() + 1)/2; i--){
                char c = input.charAt(i - 1);
                altInput = altInput + c;
            }
            pal = input.substring(0, (input.length() + 1)/2 - 1).equals(altInput);
        }
        if(pal){
            System.out.print("Строка является палиндромом");
        }
        else{
            System.out.print("Строка не является палиндромом");
        }
        System.out.print("\n");
    }
    public static void Task14(){
        int max = Integer.MIN_VALUE;
        System.out.print("Введите количество элементов в массиве:\t");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            System.out.print("Введите элемент №" + (i + 1) + " в массиве:\t");
            arr[i] = sc.nextInt();
        }
        for(int i: arr){
            if(i > max){
                max = i;
            }
        }
        System.out.print("Максимальное число в массиве:\t" + max);
        System.out.print("\n");
    }
    public static void Task15(){
        int sum = 0;
        System.out.print("Введите количество элементов в массиве:\t");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            System.out.print("Введите элемент №" + (i + 1) + " в массиве:\t");
            arr[i] = sc.nextInt();
        }
        for(int i: arr){
            sum += i;
        }
        System.out.print("Сумма элементов в массиве:\t" + sum);
        System.out.print("\n");
    }
    public static void Task16(){
        int positiveCount = 0;
        int negativeCount = 0;
        System.out.print("Введите количество элементов в массиве:\t");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            System.out.print("Введите элемент №" + (i + 1) + " в массиве:\t");
            arr[i] = sc.nextInt();
        }
        for(int i: arr){
            if(i >= 0){
                positiveCount++;
            }
            else {
                negativeCount++;
            }
        }
        System.out.print("Положительных чисел в массиве:\t" + positiveCount);
        System.out.print("\n");
        System.out.print("Отрицательных чисел в массиве:\t" + negativeCount);
        System.out.print("\n");
    }
    public static void Task17(){
        System.out.print("Введите целое число A и целое число B чтобы программа вывела все простые числа между A и B:\n");
        int A = sc.nextInt();
        int B = sc.nextInt();
        for(int i = A; i < B; i++){
            boolean prime;
            prime = (i > 1) && (i % 2 != 0) && (i % 3 != 0);
            int j = 5;
            int d = 2;
            while(prime && (j * j <= i)) {
                prime = i % j != 0;
                j += d;
                d = 6 - d;
            }
            if(prime == true || i == 1 || i == 2 || i == 3){
                System.out.print(i + "\n");
            }
        }
        System.out.print("\n");
    }
    public static void Task18(){
        int vow_count = 0;
        int con_count = 0;
        char[] vowels = new char[]{'a', 'e', 'u', 'i', 'o', 'y', 'а', 'у', 'о', 'и', 'э', 'ы', 'я', 'ю', 'е', 'ё'};
        char[] consonants = new char[]{ 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'm', 'n', 'l', 'q', 'p', 's', 't', 'x',
                'z', 'w', 'v', 'y', 'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};
        System.out.print("Введите строку:\t");
        sc.nextLine();
        String input = sc.nextLine();
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            for(char j: vowels){
                if(c == j){
                    vow_count++;
                }
            }
            for(char j: consonants){
                if(c == j){
                    con_count++;
                }
            }
        }
        System.out.print("В строке " + vow_count + " гласных и " + con_count + " согласных");
        System.out.print("\n");
    }
    public static void Task19(){
        System.out.print("Введите строку:\t");
        sc.nextLine();
        String[] input = sc.nextLine().split(" ");
        for(int i = input.length; i > 0; i--){
            System.out.print(input[i - 1] + " ");
        }
        System.out.print("\n");
    }
    public static void Task20(){
        int count = 0;
        int sum = 0;
        System.out.print("Введите число:\t");
        int input = sc.nextInt();
        int number = input;
        do{
            count++;
            input /= 10;
        }while (input != 0);
        input = number;
        do{
            sum += (int) Math.pow((input % 10), count);
            input /= 10;
        }while (input != 0);
        if(sum == number){
            System.out.print(number + " - это число Армстронга");
        }
        else {
            System.out.print(number + " - это не число Армстронга");
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        System.out.print("Введите номер задачи, которую хотитие проверить:\t");
        int input = sc.nextInt();
        while (input > 0){
            switch (input){
                case 1:
                    Task1();
                    break;
                case 2:
                    Task2();
                    break;
                case 3:
                    Task3();
                    break;
                case 4:
                    Task4();
                    break;
                case 5:
                    Task5();
                    break;
                case 6:
                    Task6();
                    break;
                case 7:
                    Task7();
                    break;
                case 8:
                    Task8();
                    break;
                case 9:
                    Task9();
                    break;
                case 10:
                    Task10();
                    break;
                case 11:
                    Task11();
                    break;
                case 12:
                    Task12();
                    break;
                case 13:
                    Task13();
                    break;
                case 14:
                    Task14();
                    break;
                case 15:
                    Task15();
                    break;
                case 16:
                    Task16();
                    break;
                case 17:
                    Task17();
                    break;
                case 18:
                    Task18();
                    break;
                case 19:
                    Task19();
                    break;
                case 20:
                    Task20();
                    break;
            }
            System.out.print("Введите 0 чтобы остановить работу программы. ");
            System.out.print("Введите номер задачи, которую хотитие проверить:\t");
            input = sc.nextInt();
        }

    }
}