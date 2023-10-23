package com.example.springhwani.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

@Configuration
public class AppConfigration {

   @Value("${aws.accesskeyId}")
   private String accessKeyId;
   @Value("${aws.Secretaccesskey}")
   private String secretAccessKey;

   @Bean
   public S3Client s3Client() {
      AwsBasicCredentials creadentials = AwsBasicCredentials.create(accessKeyId,
         secretAccessKey);
      AwsCredentialsProvider provider = StaticCredentialsProvider.create(creadentials);

      return S3Client.builder()
         .region(Region.AP_NORTHEAST_2)
         .credentialsProvider(provider)
         .build();
   }

}
