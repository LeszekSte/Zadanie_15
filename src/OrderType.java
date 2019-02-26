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
}
