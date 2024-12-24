

import java.util.Scanner;

public class Formula {

    private double sum = 0.0; // Внутренняя переменная для накопления суммы

    // Метод для вычисления Формулы №1
    public double calculateFormula1(double x, double y, double z) {
        return (Math.sin(Math.PI * y * y) + Math.log(y * y)) /
                (Math.sin(Math.PI * z * z) + Math.sin(x) + Math.log(z * z) + x * x + Math.pow(Math.E, Math.cos(x)));
    }

    // Метод для вычисления Формулы №2
    public double calculateFormula2(double x, double y, double z) {
        return y * (x * x) / (Math.log(Math.pow(z, y)) + Math.pow(Math.cos(Math.cbrt(x)), 2));
    }

    // Метод для очистки суммы (MC)
    public void clearSum() {
        sum = 0.0;
    }

    // Метод для добавления к сумме (M+)
    public void addToSum(double value) {
        sum += value;
    }

    // Получение текущего значения суммы
    public double getSum() {
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Formula formula = new Formula();

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1: Вычислить Формулу №1");
            System.out.println("2: Вычислить Формулу №2");
            System.out.println("3: Очистить сумму (MC)");
            System.out.println("4: Добавить результат к сумме (M+)");
            System.out.println("5: Показать текущую сумму");
            System.out.println("6: Выйти");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите x, y, z:");
                    double x1 = scanner.nextDouble();
                    double y1 = scanner.nextDouble();
                    double z1 = scanner.nextDouble();
                    double result1 = formula.calculateFormula1(x1, y1, z1);
                    System.out.println("Результат Формулы №1: " + result1);
                    break;

                case 2:
                    System.out.println("Введите x, y, z:");
                    double x2 = scanner.nextDouble();
                    double y2 = scanner.nextDouble();
                    double z2 = scanner.nextDouble();
                    double result2 = formula.calculateFormula2(x2, y2, z2);
                    System.out.println("Результат Формулы №2: " + result2);
                    break;

                case 3:
                    formula.clearSum();
                    System.out.println("Сумма очищена.");
                    break;

                case 4:
                    System.out.println("Введите результат для добавления:");
                    double valueToAdd = scanner.nextDouble();
                    formula.addToSum(valueToAdd);
                    System.out.println("Добавлено. Текущая сумма: " + formula.getSum());
                    break;

                case 5:
                    System.out.println("Текущая сумма: " + formula.getSum());
                    break;

                case 6:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}