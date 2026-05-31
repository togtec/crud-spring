package br.com.togtec.enums;

public enum Category {
    BACK_END("Back-End"),
    FRONT_END("Front-End");

    private final String value;

    private Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Category fromValue(String value) {
        if (value == null) {
            return null;
        }

        for (Category category : Category.values()) {
            if (category.getValue().equals(value)) {
                return category;
            }
        }

        throw new IllegalArgumentException("Invalid category: " + value);
    }

}
