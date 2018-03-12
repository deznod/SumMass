package ru.dve.summass;


public class SumMass {
    public static void main(String[] args) {
        int[] mass = new int[12];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) Math.round((Math.random() * 30) - 15);
//            System.out.println("Нечетные элементы массива: "+mass[i]);
        }
        int sum = 0;
        int n = 0;

        for (int i=1; i<mass.length;i+=2) {

                ++n;
                sum += mass[i];
                System.out.println(" " + mass[i]);

        }
        System.out.println("Всего нечтных элементов: " + n);
        System.out.println("Сумма нечетных элементов: " + sum);
    }
}
