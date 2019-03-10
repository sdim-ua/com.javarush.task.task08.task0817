package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Виктор");
        map.put("Сидоров", "Александр");
        map.put("Антонов", "Юрий");
        map.put("Павлов", "Виталий");
        map.put("Козлов", "Иван");
        map.put("Иванов1", "Виктор");
        map.put("Иванов2", "Никита");
        map.put("Антонов1", "Роман");
        map.put("Крючков", "Иван");
        return map;


    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String> (map.values());
        int count;
        
        for (String s : list){
            count = 0;
             for (String s2 : list) {
                 if(s.equals(s2))
                 count++;
                 if (count==2){ 
                     removeItemFromMapByValue (map, s);
                     
                 }
             } 
        }
        
   

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
