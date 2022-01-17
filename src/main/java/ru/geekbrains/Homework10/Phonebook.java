package ru.geekbrains.Homework10;

import java.util.*;

public class Phonebook {

        public HashMap<String, HashSet<String>> getMap() {
                return map;
        }

        private HashMap<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();

        public void addPhoneNumber(String lastName, String phoneNumber){
                HashSet<String> numbers;
                if (map.containsKey(lastName)) {
                        numbers = map.get(lastName);
                } else {
                        numbers = new HashSet<>();
                }
                numbers.add(phoneNumber);
                map.put(lastName, numbers);
        }
        Set<String> getPhoneNumbers(String lastName) {
                return map.get(lastName);
        }
}

