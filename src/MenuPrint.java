import javax.sound.sampled.Line;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class MenuPrint {


    Scanner sc = new Scanner(System.in);


    public int choiceMenu(List<Order> orders) {

        int choice = -1;
        Menu m = null;
        Menu[] menus = Menu.values();
        do {
            System.out.println("*************** MENU ******************\n");
            System.out.println(Menu.SORT.getDescripton() + "        - 1");
            System.out.println(Menu.ADD_ORDER.getDescripton() + "         - 2");
            System.out.println(Menu.CHANGE_STATUS.getDescripton() + "  - 3");
            System.out.println(Menu.END_PROGRAM.getDescripton() + "            - 0");
            choice = sc.nextInt();
            sc.nextLine();

            for (Menu menu : menus) {
                if (menu.getChose() == choice) {
                    m = menu;
                    //    System.out.println(m);
                }
            }

            switch (m) {
                case SORT:
                    choiceSort(orders);
                    choice = -1;
                    break;
                case CHANGE_STATUS:
                    changeStatusOrder(orders);
                    choice = -1;
                    break;
                case ADD_ORDER:
                    choiceSort(orders);
                    choice = -1;
                    break;
            }
        } while (!(choice >= Menu.END_PROGRAM.getChose() && choice <= Menu.ADD_ORDER.getChose()));
        return choice;
    }

    private void changeStatusOrder(List<Order> orders) {
        System.out.println("Któer chcesz zmienica zmówienie ?");



    }

    private void choiceSort(List orders) {
        int choice = -1;
        do {
            System.out.println("******* SORTOWANIE - MENU ******************\n");
            System.out.println("Sortowanie wg Nazwy             (rosnąco)   - 1");
            System.out.println("                                (malejąco)  - 2");
            System.out.println("Sortowanie wg Ceny              (rosnąco)   - 3");
            System.out.println("                                (malejąco)  - 4");
            System.out.println("Sortowanie wg Status Zamówienia (rosnąco)   - 5");
            System.out.println("                                (malejąco)  - 6");
            System.out.println("Powrót                                      - 0");
            choice = sc.nextInt();
            sc.nextLine();
        } while (!(choice >= 0 && choice <= 6));
        if (choice != 0) {
            sortOrders((List) orders, choice);
        }
    }


    private void sortOrders(List orders, int choice) {
        Comparator<Order> comparator = null;
        switch (choice) {
            case 1:
                comparator = new NameComparator();
                break;
            case 2:
                comparator = new NameComparatorDesc();
                break;
            case 3:
                comparator = new PriceComparator();
                break;
            case 4:
                comparator = new NameComparatorDesc();
                break;
            case 5:
                comparator = new StatusComparator();
                break;
            case 6:
                comparator = new NameComparatorDesc();
        }
        if (comparator != null)
            Collections.sort(orders, comparator);
        System.out.println(orders);
    }


}

