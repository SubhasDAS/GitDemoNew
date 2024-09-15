package com.company;

import java.util.Scanner;

public class Palindrom {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String");
    String str = sc.nextLine(); 
sc.close();
    // String str= "Madam";
String str1 = "";

for(int i=str.length()-1; i>=0; i--){
str1=str1+str.charAt(i);
}
if (str.equalsIgnoreCase(str1)) {
    System.out.println("String is palindrom");
}
}
    
}
