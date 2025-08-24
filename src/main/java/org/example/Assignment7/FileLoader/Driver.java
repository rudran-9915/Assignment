package org.example.Assignment7.FileLoader;

public class Driver {
    public static void main(String[] args) {
        FileUploader uploader = new FileUploader();

        // First file (within limit)
        try {
            uploader.uploadFile("report.pdf", 12.0);
        } catch (FileTooLargeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        // Second file (exceeds limit)
        try {
            uploader.uploadFile("movie.mp4", 30.0);
        } catch (FileTooLargeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
