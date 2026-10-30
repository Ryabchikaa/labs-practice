import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tool> tools = new ArrayList<>();

        tools.add(new Drill("Дрель Bosch",  800, 2.5, 3000));
        tools.add(new Drill("Дрель Makita", 750, 2.3, 2800));
        tools.add(new Drill("Дрель DeWalt", 900, 2.8, 3200));
        tools.add(new Saw("Пила Stihl",     1200, 4.5, 40));
        tools.add(new Saw("Пила Husqvarna", 1100, 4.2, 35));

        System.out.println("=== Список инструментов ===");
        for (Tool t : tools) {
            t.displayInfo();
            System.out.println("Действие: " + t.use());
            System.out.println("Класс безопасности: " + t.getSafetyClass());
            System.out.println();
        }

        for (Tool t : tools) {
            System.out.println(t.getName() + " -> " + t.use());
        }

    }
}