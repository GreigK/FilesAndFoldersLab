package com.example.person.FilesAndFoldersHW;

import com.example.person.FilesAndFoldersHW.controller.PersonController;
import com.example.person.FilesAndFoldersHW.models.File;
import com.example.person.FilesAndFoldersHW.models.Folder;
import com.example.person.FilesAndFoldersHW.models.Person;
import com.example.person.FilesAndFoldersHW.repository.FileRepository;
import com.example.person.FilesAndFoldersHW.repository.FolderRepository;
import com.example.person.FilesAndFoldersHW.repository.PersonRepository;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@SpringBootTest
class FilesAndFoldersHwApplicationTests {

	@Autowired
	PersonRepository personRepository;

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void createPersonAndFile(){
//		File file = new File("DodgyStuff","JPEG", 100);
//		fileRepository.save(file);
//		Person person = new Person("Jeff", file);
//		personRepository.save(person);
//		Folder folder = new Folder("TopSecret", person);
//		folderRepository.save(folder);
	}

}
