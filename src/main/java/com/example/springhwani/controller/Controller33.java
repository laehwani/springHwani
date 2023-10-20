package com.example.springhwani.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("main33")
@RequiredArgsConstructor
public class Controller33 {

   @GetMapping("sub1")
   public void method1() {

   }

   @PostMapping("sub2")
   public void method2(String name, Integer age, MultipartFile myFile) throws IOException {
      System.out.println("name = " + name);
      System.out.println("age = " + age);

      if (myFile != null) {
         String filename = myFile.getOriginalFilename();
         System.out.println("filename = " + filename);

         String path = "c:\\Temp\\upload_" + filename;
         InputStream inputStream = myFile.getInputStream();
         FileOutputStream fileOutputStream = new FileOutputStream(path);
         BufferedInputStream bis = new BufferedInputStream(inputStream);
         BufferedOutputStream bos = new BufferedOutputStream(fileOutputStream);

         byte[] data = new byte[1024];
         int len = 0;

         while ((len = bis.read(data)) != -1) {
            bos.write(data, 0, len);

         }
         bos.flush();
      }
   }

   @GetMapping("sub3")
   public void method3() {

   }

   @PostMapping("sub4")
   public void method4(String name, MultipartFile upload) throws IOException {
      // 업로드한 파일을 C:\\Temp\\ 폴더내에 저장
      System.out.println("name = " + name);
      System.out.println("upload = " + upload);

      if (upload != null) {
         String filename = upload.getOriginalFilename();
         System.out.println("filename = " + filename);

         String path = "c:\\Temp\\upload_" + filename;

         BufferedInputStream bis = new BufferedInputStream(upload.getInputStream());
         BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path + upload));
         try (bis; bos) {
            byte[] data = new byte[2048];
            int len = 0;

            while ((len = bis.read(data)) != -1) {
               bos.write(data, 0, len);
            }
            bos.flush();
         }
      }
   }

   @GetMapping("sub5")
   public void method5() {

   }

   @PostMapping("sub6")
   public void method6(MultipartFile[] files) throws IOException {
//      System.out.println("files.length = " + files.length);
      System.out.println("업로드 파일 크기들");
      for (MultipartFile file : files) {
         System.out.println("file.getSize() = " + file.getSize());

         if (file.getSize() > 0) {
            String path = "c:\\Temp\\";
            BufferedInputStream bis = new BufferedInputStream(file.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream
               (new FileOutputStream(path + file.getOriginalFilename()));

            try (bis; bos) {
               byte[] data = new byte[2048];
               int len = 0;

               while ((len = bis.read(data)) != -1) {
                  bos.write(data, 0, len);
               }
               bos.flush();
            }
         }
      }
   }

   @GetMapping("sub7")
   public void method7() {

   }
   @PostMapping("sub8")
   public void method8(MultipartFile[] files) throws IOException {
      // 여러 업로드된 파일을 temp\\upload 에 저장

      System.out.println("업로드 파일 크기들");

      for (MultipartFile file : files){
         if (file.getSize() > 0) {
            String uploadPath = "c:\\Temp\\upload";
            File file1 = new File(uploadPath);
            if (!file1.exists()) {
               file1.mkdirs();
            }

         BufferedInputStream bis = new BufferedInputStream(file.getInputStream());
         BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(uploadPath));

         try (bis; bos) {
            byte[] data = new byte[2048];
            int len = 0;

            while ((len = bis.read(data)) != -1) {
               bos.write(data, 0, len);
            }
            bos.flush();
         }
         }

      }
   }
}
