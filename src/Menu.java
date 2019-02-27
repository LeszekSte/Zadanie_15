public enum Menu {

    SORT("Sortowanie zamówień",1),
    CHANGE_STATUS("Zmiana statusu zamówienia",2),
    ADD_ORDER("Dodawanie zamówień",3),
    END_PROGRAM("Koniec programu",0);

    private final String descripton;
    private final int chose;

    Menu(String descripton, int chose) {
        this.descripton= descripton;
        this.chose= chose;
    }

    public String getDescripton() {
        return descripton;
    }

    public int getChose() {
        return chose;
    }

    public void printOrderType() {
        System.out.println(descripton);
    }






}
