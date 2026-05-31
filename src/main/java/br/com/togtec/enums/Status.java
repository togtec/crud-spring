package br.com.togtec.enums;

public enum Status {
    ACTIVE("Active"),
    INACTIVE("Inactive");

    private final String value;

    private Status(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Status fromValue(String value) {
        if (value == null) {
            return null;
        }

        for (Status status : Status.values()) {
            if (status.getValue().equals(value)) {
                return status;
            }
        }

        throw new IllegalArgumentException("Invalid status: " + value);
    }

}
