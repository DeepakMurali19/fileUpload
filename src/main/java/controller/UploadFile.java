package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import service.UploadFileService;

import java.io.IOException;

@RestController
public class UploadFile {

    @Autowired
    UploadFileService uploadFileService;
    @PostMapping
    public void UploadFile(@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
        uploadFileService.uploadFile(file);

    }
}
