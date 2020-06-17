package com.employee;

public class JavaProgramStructureTest { // class name
    int repeat = 4; // global variable
    public static void main(String args[]) { // main method
    JavaProgramStructureTest test = new JavaProgramStructureTest();
       test.printMessage("Welcome to Tutorials Point");
 }
 public void printMessage(String msg) { // method
    Date date = new Date(); // variable local to method
    for(int index = 0; index < repeat; index++) { // Here index - variable local to for loop
       System.out.println(msg + "From" + date.toGMTString());
    }
 }
}
