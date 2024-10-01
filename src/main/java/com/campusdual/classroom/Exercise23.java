package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercise23 {
    private static Map<String, Person> mapValue;

    public static Map<String, Person> createHashMap() {
        mapValue = new HashMap<>();

        Person mapPerson;

        mapPerson= addMapValue(mapValue, "person", new Person("John", "Smith"));
        mapPerson= addMapValue(mapValue, "teacher", new Teacher ("María", "Montessori", "Educación"));
        mapPerson= addMapValue(mapValue, "police", new PoliceOfficer("Jake", "Peralta", "B-99"));
        mapPerson= addMapValue(mapValue, "doctor", new Doctor ("Gregory", "House", "Nefrología e infectología"));

        return mapValue;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {

        map.put(key, value);

        return map.get(key);
    }

    public static void printMapValues(Map<String, Person> map) {

        for (Map.Entry<String, Person> entry : map.entrySet()){
            entry.getValue().getDetails();
        }

    }
    public static void main(String[] args) {
        Person persona;
        mapValue =  createHashMap();
        printMapValues(mapValue);

        persona = addMapValue(mapValue, "police", new PoliceOfficer("Charles", "Boyle", "B-99"));

        System.out.println(mapValue.get("police"));

        if (persona == mapValue.get("police")){
            System.out.println("Encontrado");
        }else {
            System.out.println("No encontrado");
        }

    }
}
