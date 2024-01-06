package com.company.typeface.services.impl;

import com.company.typeface.response.*;
import org.springframework.web.multipart.MultipartFile;

public interface IFileService {
    UploadFileResponse uploadFile(MultipartFile fileData, String name);
    GetFileResponse getFile(String fileId);
    GetFilesResponse getFiles();
    UpdateFileResponse updateFile(String fileId, MultipartFile file);
    DeleteFileResponse deleteFile(String fileId);
}
