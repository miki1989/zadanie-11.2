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
        Formatter formatter = new Formatter();
        //System.out.println(formatter.format("%10s %10s %10s", "Nazwa produktu", "Ilość", "Reprezentacja wizualna"));
        /*for (int i = 0; i < products.size(); i++) {
            System.out.println(formatter.format("%5s %5s %5s", products.get(i).getName(), products.get(i).getAmount(), products.get(i).starsToProducts()));
        }
        */
        int j = 0;
        while(j < products.size()){
            System.out.format("%10s %10s %10s\n", products.get(j).getName(), products.get(j).getAmount(), products.get(j).starsToProducts());
            j++;
        }






    }
}
