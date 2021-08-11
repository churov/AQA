package src.main.java.lessons;
import java.util.*;
public class Homework8 {
    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Барселона", "Реал", "ПСЖ",
                "Челси", "Ливерпуль", "Арсенал",
                "ЦСКА", "Цска", "цска",
                "Арсенал", "Бавария", "Ливерпуль",
                "Ювентус", "Милан", "Рома",
                "Ювентус", "Валенсия", "Боруссия", "Монако"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void task2() {
        Directory directory = new Directory();

        directory.add("Громыко", "8999123321");
        directory.add("Латушко", "8912155326");
        directory.add("Тихановская", "8917155552");
        directory.add("Лукашенко", "8913455672");
        directory.add("Бабарико", "899999999");
        directory.add("Лукашенко", "899111111");
        directory.add("Эйсмонт", "89923231999");
        directory.add("Азаренок", "8888123113");
        directory.add("Тихановская", "8324325234");

        System.out.println(directory.get("Тихановская"));
        System.out.println(directory.get("Лукашенко"));
        System.out.println(directory.get("Бабарико"));
        System.out.println(directory.get("Латушко"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }

}


