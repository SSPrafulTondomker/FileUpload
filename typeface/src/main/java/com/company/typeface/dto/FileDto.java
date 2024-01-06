package com.company.typeface.dto;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FileDto {
    String fileId;
    MultipartFile filedata;
    String name;
    Long createdAt;
}
