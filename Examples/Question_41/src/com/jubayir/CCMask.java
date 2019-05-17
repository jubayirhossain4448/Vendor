package com.jubayir;

public class CCMask {

    public static String maskCC(String creditCard) {
        String x = "XXXX-XXXX-XXXX";
        // line n1
//        return x + creditCard.substring(15, 19);
        StringBuilder sb = new StringBuilder(x);
        sb.append(creditCard, 15, 19);
        return sb.toString();
    }
}
