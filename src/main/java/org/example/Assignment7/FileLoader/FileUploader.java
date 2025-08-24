package org.example.Assignment7.FileLoader;

public class FileUploader {
    private static final double MAX_SIZE_MB = 25.0;

    public void uploadFile(String fileName, double fileSizeMB) throws FileTooLargeException {
        System.out.printf("Uploading %s (%.0f MB)...%n", fileName, fileSizeMB);
        if (fileSizeMB > MAX_SIZE_MB) {
            throw new FileTooLargeException("File size exceeds the 25 MB limit.");
        }

        System.out.println("File uploaded successfully.");
    }
}
