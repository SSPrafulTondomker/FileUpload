package com.company.typeface.response;

import com.company.typeface.dao.FileMetadata;
import lombok.*;

import java.util.List;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GetFilesResponse {
    List<FileMetadata> files;
}
