package com.company.typeface.response;

import com.company.typeface.enumerations.Status;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponse extends BaseResponse {
    public final Status status;

    public ApiResponse() { this(Status.FAILURE); }

    public ApiResponse(Status status) {
        this.status = status;
    }
}
