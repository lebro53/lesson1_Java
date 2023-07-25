package ru.sssii.java.api.OOP7.calculator;

import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        boolean flag = true;
        while (flag) {
            int choiceCalc = promptInt("1. Калькулятор простых чисел.\n" +
                    "2. Калькулятор комплексных чисел.\n" +
                    "3. Выйти из программы.\n");
            switch (choiceCalc) {
                case 1: {
                    int primaryArg = promptInt("Введите первый аргумент: ");
                    Calculable calculator = calculableFactory.createPromt(primaryArg);
                    while (true) {
                        String cmd = prompt("Введите команду (*, +, =) : ");
                        if (cmd.equals("*")) {
                            int arg = promptInt("Введите второй аргумент: ");
                            calculator.multiPromt(arg);
                            continue;
                        }
                        if (cmd.equals("+")) {
                            int arg = promptInt("Введите второй аргумент: ");
                            calculator.sumPromt(arg);
                            continue;
                        }
                        if (cmd.equals("=")) {
                            int result = calculator.getResult();
                            System.out.printf("Результат %d\n", result);
                            break;
                        }
                    }
                    String cmd = prompt("Еще посчитать (Y/N)?");
                    if (cmd.equals("Y")) {
                        continue;
                    }
                    break;
                }

                case 2: {
                    int primaryArg1 = promptInt("Введите первый аргумент: ");
                    int primaryArg2 = promptInt("Введите второй аргумент: ");
                    CalculableComplex calculator1 = calculableFactory.createComplex(primaryArg1, primaryArg2);

                    String cmd1 = prompt("Введите команду (*, +, =) : ");
                    if (cmd1.equals("*")) {
                        int arg1 = promptInt("Введите первый аргумент: ");
                        int arg2 = promptInt("Введите второй аргумент: ");
                        calculator1.multiComplex(arg1, arg2);
                    }
                    if (cmd1.equals("+")) {
                        int arg1 = promptInt("Введите первый аргумент: ");
                        int arg2 = promptInt("Введите второй аргумент: ");
                        calculator1.sumComplex(arg1, arg2);
                    }


                    String cmd2 = prompt("Еще посчитать (Y/N)?");
                    if (cmd2.equals("Y")) {
                        continue;
                    }
                    break;
                }
                case 3: {
                    flag = false;
                }

            }

        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
