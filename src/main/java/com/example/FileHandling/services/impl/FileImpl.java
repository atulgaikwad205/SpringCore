package com.example.FileHandling.services.impl;




import com.example.FileHandling.services.FileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class FileImpl implements FileService {


    @Override
    public String uploadFile(String path, MultipartFile file) throws IOException {
        System.out.println("hhhhhhhhhhhhhh");


        String name = file.getOriginalFilename();

        String filepath = path+ File.separator+name;

        File f = new File(path);

        if(!(f.exists())){
            f.mkdir();
        }

        Files.copy(file.getInputStream(), Paths.get(filepath));


        return name;
    }
}

