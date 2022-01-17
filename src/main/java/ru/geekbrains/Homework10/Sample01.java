package ru.geekbrains.Homework10;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Sample01 {
    public static void main (String[] args) {
        Set<String> set = new HashSet<>();
        String[] words = {"Friends", "Rick and Morty", "Doctor Who",
                "Shameless", "The Big Bang Theory", "Final Space",
                "Office", "Dexter", "Doctor Who", "Parks and Recreation",
                "Parks and Recreation", "The Good Doctor", "The Handmaid's Tale",
                "Office", "Miracle Workers", "Parks and Recreation",
                "State of the Union", "Normal People", "Manifest", "Flash"};
        for (int i = 0; i < words.length; i++) {
            set.add(words[i]);
        }

        System.out.println(set);

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i]))
                map.put(words[i], map.get(words[i]) + 1);
            else
                map.put(words[i], 1);
        }
        System.out.println(map);

        Phonebook phonebook = new Phonebook();
        phonebook.addPhoneNumber("Ivanov", "123");
        phonebook.addPhoneNumber("Petrov", "124");
        phonebook.addPhoneNumber("Ivanov", "125");
        phonebook.addPhoneNumber("Popov", "126");

        System.out.println(phonebook.getPhoneNumbers("Ivanov"));
    }








}






