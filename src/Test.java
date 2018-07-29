import java.io.BufferedReader;
import java.io.File;
import java.util.Comparator;
import java.io.IOException;
import java.util.*;

import static java.lang.String.CASE_INSENSITIVE_ORDER;
import static java.util.Collections.*;

public class Test {
    final static int ZMIENNA = 100;
    public static void main(String[] args) throws IOException {


        File file = new File("produkty.csv");
        if (!file.exists()) {
            file.createNewFile();
        }
        ArrayList<Warehouse>products = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        String value = "";
        while (scanner.hasNextLine()) {
            value = scanner.nextLine();
            if(value != null) {
                String[] divide = value.split(";");
                Warehouse warehouse = new Warehouse(divide[0], Integer.valueOf(divide[1]));
                products.add(warehouse);
            }
        }

        //wyświetlenie pierwotnej wersji listy
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
        }
        System.out.println();
        System.out.println();
        //sortowanie listy wg nazwy produktu
        sort(products, Warehouse.Comparators.NAME);
        // wyswietlanie zawartosci posortowanej listy
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
        }





    }
}
