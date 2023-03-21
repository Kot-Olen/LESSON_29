public class Main {
    public static void main(String[] args) {


        for (int x = 1; x <= 9; x++) {
            System.out.println(" 3 * " + x + " = " + 3 * x);
        }

        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result = result + i;
        }
        System.out.println(" среднее арифметическое = " + (result / 100));


    int number = 456;
    int count = 0;
    if (number <50)

    {
        System.out.println(" Вы ввели слишком маленькое число: ");
    }
    else {
        while (number >= 50) {
            number /= 2;
            count++;
        }
        {
            System.out.println(" Число: " + number);
        }
        {
            System.out.println(" Количество итераций : " + count);
        }
    }
        }
    }



