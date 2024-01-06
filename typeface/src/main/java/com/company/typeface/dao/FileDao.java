package com.company.typeface.dao;

/*
* 1. comment-table:
      1. Id
      2. postId
      3. text
      4. createdBy
      5. createdAt
      6. updatedAt
* */

import com.company.typeface.dto.FileDto;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



@Service
public class FileDao {
    Map<String, FileMetadata> files;
    FileDao() {
        files = new HashMap<>();
    }


    public FileMetadata insert(FileDto file){
        files.put(file.getFileId(), new FileMetadata(file.getFileId(), file.getFiledata(), file.getName(), file.getCreatedAt(), true));
        return files.get(file.getFileId());
    }

    public FileMetadata update(String fileId, MultipartFile fileData){
        FileMetadata currentFile = files.getOrDefault(fileId, null);
        if (currentFile == null) return null;

        files.put(currentFile.getFileId(), new FileMetadata(currentFile.getFileId(), fileData, currentFile.getName(), Instant.now().toEpochMilli(), true));
        return files.get(fileId);
    }

    public FileMetadata get(String fileId){
        return files.getOrDefault(fileId, null);
    }

    public List<FileMetadata> gets(){
        return files.entrySet().stream()
                .filter((Map.Entry<String, FileMetadata> record) -> record.getValue().status)
                .map((Map.Entry<String, FileMetadata> record) -> record.getValue())
                .collect(Collectors.toList());
    }

    public void delete(String fileId){
        FileMetadata fileMetadata = files.getOrDefault(fileId, null);;
        if (fileMetadata == null) return;

        fileMetadata.setStatus(false);
        files.put(fileMetadata.getFileId(), fileMetadata);
    }

}


