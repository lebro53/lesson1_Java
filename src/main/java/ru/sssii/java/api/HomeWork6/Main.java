package ru.sssii.java.api.HomeWork6;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        Notebook notebook1 = new Notebook("Asus", 16, 1024, "Windows", "red");
        Notebook notebook2 = new Notebook("Lenovo", 8, 512, "Linux", "white");
        Notebook notebook3 = new Notebook("Apple", 16, 1024, "Mac OS", "red");
        Notebook notebook4 = new Notebook("DEXP", 8, 2048, "Windows", "black");
        List<Notebook> catalog = new ArrayList<>();
        catalog.add(notebook);
        catalog.add(notebook1);
        catalog.add(notebook2);
        catalog.add(notebook3);
        catalog.add(notebook4);
        Scanner scanner = new Scanner(System.in);
        menu(scanner, catalog);
    }

    private static void menu(Scanner sc, List<Notebook> ctlg) {
        boolean flag = true;
        List<Notebook> catalogCopy = new ArrayList<>(ctlg);
        while (flag) {
            System.out.println();
            System.out.println(new Text().selectionMenu);
            System.out.println(new Text().selection);
            int selection = sc.nextInt();
            switch (selection) {
                case 1:
                    for (Notebook s : ctlg) {
                        System.out.println(s);
                    }
                    break;
                case 2:
                    sortNotebook(catalogCopy, sc);
                    for (Notebook s : catalogCopy) {
                        System.out.println("Notebook " + s);
                    }
                    break;
                case 3:
                    List<Notebook> filter = filterNotebook(ctlg, sc);
                    if(!filter.isEmpty()){
                        System.out.println(new Text().foundItems);
                        for (Notebook s : filter) {
                            System.out.println(s);
                        }
                    }else {
                        System.out.println(new Text().notFound);
                    }
                    break;
                case 4:
                    flag = false;
                    System.out.println(new Text().exit);
            }
        }

    }

    private static List<Notebook> filterNotebook(List<Notebook> ctlg, Scanner sc) {
        List<Notebook> myList = new ArrayList<>();
        System.out.println(new Text().menuEnter);
        System.out.println(new Text().searchPart);
        int partSearch = sc.nextInt();
        switch (partSearch) {
            case 1:
                System.out.println(new Text().searchElem);
                String case1 = sc.next().toLowerCase();
                for (int i = 0; i < ctlg.size(); i++) {
                    if (ctlg.get(i).getManufacturer().toLowerCase().equals(case1)) {
                        myList.add(ctlg.get(i));
                    }
                }
                break;
            case 2:
                System.out.println(new Text().searchElem);
                int case2 = sc.nextInt();
                for (int i = 0; i < ctlg.size(); i++) {
                    if (ctlg.get(i).getRam().equals(case2)) {
                        myList.add(ctlg.get(i));
                    }
                }
                break;
            case 3:
                System.out.println(new Text().searchElem);
                int case3 = sc.nextInt();
                for (int i = 0; i < ctlg.size(); i++) {
                    if (ctlg.get(i).getVolumeVD().equals(case3)) {
                        myList.add(ctlg.get(i));                    }
                }
                break;
            case 4:
                System.out.println(new Text().searchElem);
                String case4 = sc.next().toLowerCase();
                for (int i = 0; i < ctlg.size(); i++) {

                    if (ctlg.get(i).getOperativeSystem().toLowerCase().equals(case4)) {
                        myList.add(ctlg.get(i));
                    }
                }
                break;
            case 5:
                System.out.println(new Text().searchElem);
                String case5 = sc.next().toLowerCase();
                for (int i = 0; i < ctlg.size(); i++) {
                    if (ctlg.get(i).getColor().toLowerCase().equals(case5)) {
                        myList.add(ctlg.get(i));
                    }
                }
                break;
        }
        return myList;
    }

    private static void sortNotebook(List<Notebook> catalogCopy, Scanner cs) {

        System.out.println(new Text().menu);
        int numberCase = cs.nextInt();
        switch (numberCase) {
            case 1:
                new Manufacturer().sortManufacturer(catalogCopy);
                break;
            case 2:
                new Ram().sortRam(catalogCopy);
                break;
            case 3:
                new VolumeVD().sortVolumeVD(catalogCopy);
                break;
            case 4:
                new OperativeSystem().sortOperative(catalogCopy);
                break;
            case 5:
                new Color().sortColor(catalogCopy);
                break;
        }
    }
}
