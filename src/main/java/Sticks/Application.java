package Sticks;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(FolderService folderService, NoteService noteService) {
        return (args) -> {
            // Создание папок и записок для демонстрации
            Folder folder1 = new Folder();
            folder1.setName("Folder 1");
            folderService.createFolder(folder1);

            Note note1 = new Note();
            note1.setTitle("Note 1");
            note1.setContent("Content of Note 1");
            note1.setFolder(folder1);
            noteService.createNote(note1);

            Note note2 = new Note();
            note2.setTitle("Note 2");
            note2.setContent("Content of Note 2");
            note2.setFolder(folder1);
            noteService.createNote(note2);

            Folder folder2 = new Folder();
            folder2.setName("Folder 2");
            folderService.createFolder(folder2);

            Note note3 = new Note();
            note3.setTitle("Note 3");
            note3.setContent("Content of Note 3");
            note3.setFolder(folder2);
            noteService.createNote(note3);
        };
    }
}

