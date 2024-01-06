package com.company.typeface.response;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public
class DeleteFileResponse {
    String Id;
    String postId;
    String text;
    String createdBy;
    Integer createdAt;
    Integer updatedAt;
}