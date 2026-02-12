package com.ontariotechu.sofe3980U;

public class Binary {
    private final String value;

    public Binary(String value) {
        if (value == null || value.trim().isEmpty()) {
            this.value = "0";
            return;
        }
        String v = value.trim();
        for (int i = 0; i < v.length(); i++) {
            char c = v.charAt(i);
            if (c != '0' && c != '1') {
                this.value = "0";
                return;
            }
        }
        // trim leading zeros but keep one digit
        int idx = 0;
        while (idx < v.length() - 1 && v.charAt(idx) == '0') idx++;
        this.value = v.substring(idx);
    }

    public String getValue() {
        return value;
    }

    public static Binary add(Binary b1, Binary b2) {
        int num1 = Integer.parseInt(b1.value, 2);
        int num2 = Integer.parseInt(b2.value, 2);
        return new Binary(Integer.toBinaryString(num1 + num2));
    }

    public static Binary or(Binary b1, Binary b2) {
        int num1 = Integer.parseInt(b1.value, 2);
        int num2 = Integer.parseInt(b2.value, 2);
        return new Binary(Integer.toBinaryString(num1 | num2));
    }

    public static Binary and(Binary b1, Binary b2) {
        int num1 = Integer.parseInt(b1.value, 2);
        int num2 = Integer.parseInt(b2.value, 2);
        return new Binary(Integer.toBinaryString(num1 & num2));
    }

    public static Binary multiply(Binary b1, Binary b2) {
        int num1 = Integer.parseInt(b1.value, 2);
        int num2 = Integer.parseInt(b2.value, 2);
        return new Binary(Integer.toBinaryString(num1 * num2));

    }
}
