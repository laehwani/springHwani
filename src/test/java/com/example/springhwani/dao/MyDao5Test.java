package com.example.springhwani.dao;

import static org.junit.jupiter.api.Assertions.*;

import com.example.springhwani.SpringHwaniApplication;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringHwaniApplication.class)
class MyDao5Test {

   @Autowired
   MyDao5 dao5;

   @Test
   void select5test1() {
      dao5.select5();
   }
   @Test
   void select6test1() {
      dao5.select6();
   }
   @Test
   void select7test2() {
      dao5.select7(List.of("mexico", "UK", "korea"));
   }
   @Test
   void select8test1() {
      dao5.select8(List.of("usa", "uk", "korea"));
   }
   @Test
   void select8test2() {
      dao5.select8(List.of());
   }
   @Test
   void select9test1() {
      dao5.select9("%"+ "com" +"%");
   }
   @Test
   void select9test2() {
      dao5.select9("com");
   }
   @Test
   void select10test1() {
      dao5.select10("abc");
   }
   @Test
   void select10test2() {
      dao5.select10("def");
   }
   @Test
   void select10test3() {
      dao5.select10("q");
   }
   @Test
   void select10test4() {
      dao5.select10("K");
   }
}