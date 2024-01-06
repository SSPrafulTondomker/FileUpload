package com.company.typeface.services;

import com.company.typeface.dao.FileDao;
import com.company.typeface.dao.FileMetadata;
import com.company.typeface.dto.FileDto;
import com.company.typeface.response.*;
import com.company.typeface.services.impl.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.time.Instant;
import java.util.List;
import java.util.UUID;


@Service
public class FileServiceImpl implements IFileService {

    @Autowired
    FileDao fileDao;

    @Override
    public UploadFileResponse uploadFile(MultipartFile fileData, String name) {
        FileMetadata file = fileDao.insert(
                new FileDto(UUID.randomUUID().toString(), fileData, name, Instant.now().toEpochMilli()));
        return new UploadFileResponse(file);
    }

    @Override
    public GetFileResponse getFile(String fileId) {
        FileMetadata file = fileDao.get(fileId);
        return new GetFileResponse(file);
    }

    @Override
    public GetFilesResponse getFiles() {
        List<FileMetadata> files = fileDao.gets();
        return new GetFilesResponse(files);
    }

    @Override
    public UpdateFileResponse updateFile(String fileId, MultipartFile file) {
        FileMetadata fileMetadata = fileDao.update(fileId, file);
        return new UpdateFileResponse(fileMetadata);
    }

    @Override
    public DeleteFileResponse deleteFile(String fileId) {
        fileDao.delete(fileId);
        return null;
    }
}
