package org.example.day14.추가문제;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

//==> 이미지 url을 이용해서 파일로 다운로드하여 저장
public class CrawlImage {
    public static void main(String[] args) {
        String imageUrl = "https://hnhwangtogol.com/_upload/mall/20191010171935_16421.jpg";

        String destinationFile = "C:\\dataSSG\\downloaded_image.jpg";

        try {
            downloadImage(imageUrl, destinationFile);
            System.out.println("이미지 다운로드 완료: " + destinationFile);
        } catch (IOException e) {
            System.out.println("이미지 다운로드 실패: " + e.getMessage());
        }
    }

    public static void downloadImage(String imageUrl, String destinationFile) throws IOException {
        try (InputStream in = new URL(imageUrl).openStream()) {
            Files.copy(in, Paths.get(destinationFile));
        }
    }

}
