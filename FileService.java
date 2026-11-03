package com.demo.shop;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileService {
    private static final String BASE = "/var/app/uploads/";

    public String readFile(String fileName) throws IOException {
        File f = new File(BASE + fileName);
        return new String(Files.readAllBytes(f.toPath()));
    }
}
