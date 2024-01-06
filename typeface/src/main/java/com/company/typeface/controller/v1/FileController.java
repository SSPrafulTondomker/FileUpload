package com.company.typeface.controller.v1;

import com.company.typeface.response.ApiResponse;
import com.company.typeface.response.SuccessResponse;
import com.company.typeface.services.impl.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/file-service/v1")
public class FileController {

    @Autowired
    IFileService fileService;


    @RequestMapping(value="/files/upload", method= RequestMethod.POST)
    public
    @ResponseBody
    ApiResponse uploadFile(@RequestBody(required = false) MultipartFile fileData, @RequestParam(required = false) String name) {
        return new SuccessResponse(fileService.uploadFile(fileData, name), "success", 200);
    }

    @RequestMapping(value="/files/{fileId}", method= RequestMethod.GET)
    public
    @ResponseBody
    ApiResponse getFile( @PathVariable(required = false) String fileId) {
        return new SuccessResponse(fileService.getFile(fileId), "success", 200);
    }

    @RequestMapping(value="/files/{fileId}", method= RequestMethod.PUT)
    public
    @ResponseBody
    ApiResponse updateFile(@RequestParam(required = false) MultipartFile file, @PathVariable(required = false) String fileId) {
        return new SuccessResponse(fileService.updateFile(fileId, file), "success", 200);
    }

    @RequestMapping(value="/files/{fileId}", method= RequestMethod.DELETE)
    public
    @ResponseBody
    ApiResponse deleteFile(@PathVariable(required = false) String fileId) {
        return new SuccessResponse(fileService.deleteFile(fileId), "success", 200);
    }

    @RequestMapping(value="/files", method= RequestMethod.GET)
    public
    @ResponseBody
    ApiResponse getFiles() {
        return new SuccessResponse(fileService.getFiles(), "success", 200);
    }

}