package com.company.typeface.dao;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FileMetadata {
    String fileId;
    MultipartFile fileData;
    String name;
    Long createdAt;
    Boolean status;
}