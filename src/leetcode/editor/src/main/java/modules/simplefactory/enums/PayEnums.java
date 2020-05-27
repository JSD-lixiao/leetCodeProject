package modules.simplefactory.enums;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/4/27 16:36
 */
public enum PayEnums {
    /**
     * 银行卡支付
     */
    CARD(1, "Card"),

    /**
     * 现金支付
     */
    CASH(2, "Cash"),
    /**
     * 现金支付
     */
    MOBILE(3, "Mobile");


    private Integer value;
    private String className;

    PayEnums(Integer value, String className) {
        this.value = value;
        this.className = className;
    }

    public Integer getValue() {
        return value;
    }

    public String getClassName() {
        return className;
    }

    public static PayEnums getEnums(Integer value) {
        if (value == null) {
            return null;
        }
        for (PayEnums payEnums : PayEnums.values()) {
            if (payEnums.getValue().equals(value)) {
                return payEnums;
            }
        }
        return null;
    }
}
