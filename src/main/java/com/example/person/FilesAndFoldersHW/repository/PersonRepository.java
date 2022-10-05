package com.example.person.FilesAndFoldersHW.repository;

import com.example.person.FilesAndFoldersHW.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
