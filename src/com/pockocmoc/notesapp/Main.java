package com.pockocmoc.notesapp;

import com.pockocmoc.notesapp.services.NoteService;


import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Меню:");
            System.out.println("1. Добавить заметку");
            System.out.println("2. Завершить программу");
            System.out.print("Выберите пункт меню: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите текст заметки: ");
                    String content = scanner.nextLine();
                    NoteService.addNote(content);
                    break;
                case 2:
                    isRunning = false;
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите пункт меню от 1 до 2.");
            }

            System.out.println();
        }
    }
}

