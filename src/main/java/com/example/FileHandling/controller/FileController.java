package com.example.FileHandling.controller;


import com.example.FileHandling.pojo.FileResponse;
import com.example.FileHandling.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/file")
public class FileController {

    @Value("${project.image}")
    private String path ;

    @Autowired
    private FileService service;

    @PostMapping("/upload")
    public ResponseEntity<FileResponse> fileUpload(@RequestParam("image") MultipartFile image) throws IOException {
        String fileName = null;

        try {
            System.out.println("Received file upload request for file: " + image.getOriginalFilename());
            fileName = this.service.uploadFile(path, image);
            System.out.println("File uploaded successfully: " + fileName);
        } catch (IOException e) {
            System.err.println("Error uploading file: " + image.getOriginalFilename());
            e.printStackTrace();
            return new ResponseEntity<>(new FileResponse(fileName, "File not uploaded..!"), HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(new FileResponse(fileName, "File uploaded successfully..!"), HttpStatus.OK);
    }
}
