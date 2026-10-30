package org.example;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {



        Map<String, SportsEquipment> equipmentMap = new HashMap<>();

        equipmentMap.put("мяч футбольный", new Ball("мяч футбольный", 1, 0.45, "футбол"));
        equipmentMap.put("мяч баскетбольный", new Ball("мяч баскетбольный", 2, 0.6, "баскетбол"));
        equipmentMap.put("мяч теннисный", new Ball("мяч теннисный", 3, 0.06, "тенис"));

        equipmentMap.put("ракетка теннисная", new Racket("ракетка теннисная", 4, 0.3, 25.0));
        equipmentMap.put("ракетка бадминтонная", new Racket("ракетка бадминтонная", 5, 0.1, 10.0));
        equipmentMap.put("ракетка сквош", new Racket("ракетка сквош", 6, 0.2, 15.0));

        equipmentMap.put("шлем хоккейный", new Helmet("шлем хоккейный", 7, 1.2, "l"));
        equipmentMap.put("шлем велосипедный", new Helmet("шлем велосипедный", 8, 0.5, "m"));

        for (Map.Entry<String, SportsEquipment> entry : equipmentMap.entrySet()) {
            System.out.println("ключ: " + entry.getKey());
            entry.getValue().displayInfo();
        }
    }
}