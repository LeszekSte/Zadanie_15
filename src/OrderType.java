public enum OrderType {
    COMPLEX("Złożone"),
    PREPARED_FOR_SHIPMENT("Przygotowane do wysyłki"),
    IN_TRANSPORT("W transporcie"),
    COMPLETED("Zrealizowane"),
    CANCELED("Anulowane");

    private final String descripton;

    public String getDescripton() {
        return descripton;
    }

    OrderType(String description) {
        this.descripton = description;
    }

    public void printOrderType() {
        System.out.println(descripton);
    }

    public int compare(OrderType status) {

        return 0;

   }
    public int compare(Order o1, Order o2) {
        return -(o1.getStatus().compare(o2.getStatus()));
    }

}

