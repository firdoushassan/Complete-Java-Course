package com.company;

public class String_methods {
    public static void main(String[] args){
        String name = "Myselef";
//        System.out.println(name);
//        int value = name.length();
//        System.out.println(value);
//        String lower = name.toLowerCase();
//        System.out.println(lower);
//        String upper = name.toUpperCase();
//        System.out.println(upper);
//        System.out.println(name.toUpperCase());
//        String noTrim = "    Good boy    ";
//        System.out.println(noTrim);
//        String trim = noTrim.trim();
//        System.out.println(trim);
//        System.out.println(name.substring(3));
//        System.out.println(name.substring(3,5));
        System.out.println(name.replace('M','U'));
        System.out.println(name.replace("My", "Your"));
        System.out.println(name.startsWith("ur"));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf('e'));
        System.out.println(name.lastIndexOf('e'));
        System.out.println(name.equals("myselef"));
        System.out.println(name.equalsIgnoreCase("myselef"));
        System.out.println("\"i am escape sequence\" quote");

    }
}
