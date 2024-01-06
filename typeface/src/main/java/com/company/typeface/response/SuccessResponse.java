package com.company.typeface.response;

import com.company.typeface.enumerations.Status;

public class SuccessResponse extends ApiResponse{
    public SuccessResponse(Object data, String message, int code) {
        super(Status.SUCCESS);
        setCode(code);
        setData(data);
        setMessage(message);
    }
}