package com.pockocmoc.notesapp.services;
import com.pockocmoc.notesapp.models.Note;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NoteService {
    private static final String FILE_PATH = "notes.txt";
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void addNote(String content) {
        String timestamp = LocalDateTime.now().format(FORMATTER);
        Note note = new Note(content, timestamp);

        try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
            writer.write(note.getContent() + " - " + note.getTimestamp() + "\n");
            System.out.println("Заметка успешно добавлена");
        } catch (IOException e) {
            System.out.println("Ошибка при добавлении заметки: " + e.getMessage());
        }
    }
}