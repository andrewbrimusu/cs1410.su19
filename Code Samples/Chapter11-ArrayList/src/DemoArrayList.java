import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();

        cities.add("Logan");
        cities.add("Nibley");
        cities.add("Smithfield");
        cities.add("Clarkston");
        cities.add("Newton");

        System.out.printf("There are %d cities in the list.\n", cities.size());

        cities.add(2, "Paradise");

        for (String city : cities) {
            System.out.println(city);
        }

        cities.remove("Clarkston");

        for (String city : cities) {
            System.out.println(city);
        }

        String[] names = { "one", "two", "three" };
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));

        String[] nameArray = new String[nameList.size()];
        nameList.toArray(nameArray);

        for (String name : nameArray) {
            System.out.printf("name: %s\n", name);
        }

    }
}

