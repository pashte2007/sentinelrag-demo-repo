package com.demo.shop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SafeFileService {
    private static final Path BASE = Paths.get("/var/app/uploads").toAbsolutePath().normalize();

    public String readFile(String fileName) throws IOException {
        Path target = BASE.resolve(fileName).normalize();
        if (!target.startsWith(BASE)) {
            throw new IllegalArgumentException("Invalid file path");
        }
        return new String(Files.readAllBytes(target));
    }
}
