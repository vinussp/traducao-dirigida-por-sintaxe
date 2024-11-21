package com.example;

public class Main {
  public static void main(String[] args) throws Exception {

    String input = "let a = 42 + 5;";
    String input_2 = "let b = 50 + 5 -20;";
      
    Parser p = new Parser (input.getBytes());
    Parser p2 = new Parser (input_2.getBytes());
    p.parse();
    p2.parse();
  }

}