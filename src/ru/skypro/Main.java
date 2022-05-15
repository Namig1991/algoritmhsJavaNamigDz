package ru.skypro;


public class Main {
    public static void main(String[] args) {
        StringListImpl strings = new StringListImpl(5);
        StringListImpl secondStrings = new StringListImpl(5);
        System.out.println(strings.add("Java"));
        System.out.println(strings.add("C#"));
        System.out.println(strings.add("C/C++"));
        System.out.println(strings);
        System.out.println(strings.remove(0));
        System.out.println(strings);
    }
}
