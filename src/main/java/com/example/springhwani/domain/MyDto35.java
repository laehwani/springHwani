package com.example.springhwani.domain;

import lombok.Getter;

public class MyDto35 {
   // 대소문자가 어떻게 바뀌는지 structure 켜서 확인
   private String id;
   @Getter
   private String uRl;

   // 프로퍼티명 : id
   public String getId() {
      return id;
   }

}
