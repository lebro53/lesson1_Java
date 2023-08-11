package ru.sssii.java.api.Exceptions.HomeWork3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Введите \"Фамилию Имя Отчество\", \"дату рождения\", \"номер телефона\", \"пол\".\nДанные вводятся без запятых, разделенные пробелом в произвольном порядке:");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();

        String[] dataArr = data.split(" ");


        decoding(checkLength(dataArr));

        String maleOrFamale = "";
        String dateBirt = "";
        String numberPhone = "";
        String fullName = "";

        for (int i = 0; i < dataArr.length; i++) {

            String[] dataI = dataArr[i].split("");
            for (int j = 0; j < dataI.length; j++) {
                if (dataI.length == 1) {
                    maleOrFamale = dataArr[i];
                }
            }

            if (dataArr[i].matches("[0-9+]+")) {
                numberPhone = dataArr[i];
            }

            if (dataArr[i].matches("^([0-9]+)\\.([0-9]+)\\.([0-9]+)")) {
                dateBirt = dataArr[i];
            }

            if (dataArr[i].matches("[А-Яа-яA-Za-z]+")) {
                if (dataI.length > 1) {
                    fullName += dataArr[i] + " ";
                }
            }
        }

        checForEmpty(fullName, dateBirt, numberPhone, maleOrFamale);


        char gender = 0;
        if (!maleOrFamale.equals("m") && !maleOrFamale.equals("f")) {
            throw new MyGenderException(maleOrFamale);
        } else {
            gender = maleOrFamale.charAt(0);
        }

        int numberPhoneInt = 0;
        if (!numberPhone.matches("[0-9]+")) {
            throw new MyNumberException(numberPhone);
        } else {
            try {
                numberPhoneInt = Integer.parseInt(numberPhone);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Вы ввели слишком длинный номер телефона.");
                System.exit(0);
            }
        }

        if (!dateBirt.matches("\\d{2}.\\d{2}.\\d{4}")) {
            throw new MyBirthDateException(dateBirt);
        }

        try {
            writeData(fullName, dateBirt, numberPhoneInt, gender);
        } catch (Exception e){
            String[] tSN = fullName.split(" ");
            String surname = tSN[0];
            System.out.println("Ошибка! Запись данных в файл " + surname +  " не удалась.");
            e.printStackTrace();
        }
    }

    private static void writeData(String fullName, String dateBirt, Integer numberPhoneInt, Character gender) throws Exception {
        String[] tSN = fullName.split(" ");
        String surname = tSN[0];

        String path = new File("").getAbsolutePath() + "\\Exceptions\\HomeWork3\\";
        File f = new File(path + surname + ".txt");

        if (f.createNewFile()) {
            FileWriter writer = new FileWriter(f);
            writer.write(fullName.toString());
            writer.write(dateBirt.toString() + " ");
            writer.write(numberPhoneInt.toString() + " ");
            writer.write(gender.toString());
            writer.write("\n");
            writer.flush();
            writer.close();
            System.out.println("Файл с именем: '" + surname + "' создан.'\nЗапись добавлена.");
        } else {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(f, true)));
            out.printf(fullName.toString());
            out.printf(dateBirt.toString() + " ");
            out.printf(numberPhoneInt.toString() + " ");
            out.printf(gender.toString());
            out.printf("\n");
            out.close();
            System.out.println("Файл с именем: '" + surname + "'" + " уже существует.\nЗапись добавлена в существующий файл.");
        }
    }

    private static void checForEmpty(String fullName, String dataBirt, String numberPhone, String maleOrFamale) {
        List dataList = new ArrayList();
        dataList.add(fullName);
        dataList.add(dataBirt);
        dataList.add(numberPhone);
        dataList.add(maleOrFamale);

        Set dataEmpty = new HashSet();
        for (int i = 0; i < dataList.size(); i++) {
            if (dataList.get(i).equals("")) {
                if (i == 0) dataEmpty.add("Фамилия Имя Отчество");
                if (i == 1) dataEmpty.add("Дата рождения");
                if (i == 2) dataEmpty.add("Номер телефона");
                if (i == 3) dataEmpty.add("Пол ");
            }
            if (i == 0) {
                String[] fullNameSplit = fullName.split(" ");
                if (fullNameSplit.length < 3) dataEmpty.add("Фамилия Имя Отчество");
            }
        }
        if (!dataEmpty.isEmpty()) {
            throw new MyIsEmptyException(dataEmpty);
        }
    }

    private static int checkLength(String[] arr) {
        int requiredLength = 6;
        if (arr.length < requiredLength) {
            return -1;
        }
        if (arr.length > requiredLength) {
            return -2;
        } else return 0;
    }

    private static void decoding(Integer meaning) {
        if (meaning.equals(-1)) {
            System.out.println("-1\nОшибка! Вы ввели данных меньше, чем требуется.");
            System.exit(0);
        }
        if (meaning.equals(-2)) {
            System.out.println("-2\nОшибка! Вы ввели данных больше, чем требуется.");
            System.exit(0);
        }
    }
}
