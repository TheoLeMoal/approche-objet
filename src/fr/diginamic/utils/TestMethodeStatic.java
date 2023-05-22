package fr.diginamic.utils;

public class TestMethodeStatic {
    public static void main(String[] args) {
        String chaine = "12";
        int number = Integer.parseInt(chaine);
        System.out.println("number = " + number);
        int a = 5;
        int b = 8;
        int maximum = Integer.max(a, b);
        System.out.println(maximum);
    }
}
