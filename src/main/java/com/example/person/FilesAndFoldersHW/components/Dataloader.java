package com.example.person.FilesAndFoldersHW.components;

import com.example.person.FilesAndFoldersHW.models.File;
import com.example.person.FilesAndFoldersHW.models.Folder;
import com.example.person.FilesAndFoldersHW.models.Person;
import com.example.person.FilesAndFoldersHW.repository.FileRepository;
import com.example.person.FilesAndFoldersHW.repository.FolderRepository;
import com.example.person.FilesAndFoldersHW.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component
public class Dataloader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    public Dataloader(){

    }

    public void run(ApplicationArguments args) {
        Person person = new Person("Jeff");
        personRepository.save(person);
        Folder folder = new Folder("TopSecret", person);
        folderRepository.save(folder);
        File file = new File("SecretStuff", "JPEG", 12, folder);
        fileRepository.save(file);

    }
}
