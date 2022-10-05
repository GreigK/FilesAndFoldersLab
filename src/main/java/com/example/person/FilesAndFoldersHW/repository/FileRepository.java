package com.example.person.FilesAndFoldersHW.repository;

import com.example.person.FilesAndFoldersHW.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
