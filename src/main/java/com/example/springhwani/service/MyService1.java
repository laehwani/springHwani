package com.example.springhwani.service;

import com.example.springhwani.dao.MyDao6;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MyService1 {

   private final MyDao6 dao6;
   @Transactional(rollbackFor = Exception.class)
   // rollbackFor = Exception.class 는 notion 참조.
   // 모든 예외발생을 처리함.
   public void tx1() {
      dao6.update1();
      int c = 1/0;  //runtimeException
      dao6.update2();
   }

}
