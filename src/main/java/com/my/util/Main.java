package com.my.util;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
    System.out.println("Hello everyone..!!");
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    welcome();
    hi();
    guys();
   newFeature();
   goodBye();
  }

  private static void newFeature() {
    int i = 1;
    while (i <= 15) {
      if(i == 7) {
        System.out.println("value : " + i);
        break;
      }
        System.out.println("Else value : " + i);
      i++;
    }
  }

  private static void goodBye() {
    System.out.println("good bye..!");
  }

  private static void hi() {
    System.out.println("hi..!");
  }

  private static void guys() {
    System.out.println("guys..!");
  }

  private static void welcome() {
    System.out.println("welcome!");
  }

}