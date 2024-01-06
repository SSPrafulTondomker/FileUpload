package com.company.typeface.response;

import com.company.typeface.dao.FileMetadata;
import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateFileResponse {
    String fileId;
    String fileData;
    String name;
    Long createdAt;
    Boolean status;
}
