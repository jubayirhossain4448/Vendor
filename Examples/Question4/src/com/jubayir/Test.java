
package com.jubayir;

public class Test {
    public static void main(String[] args) {
        Short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long) s1 + s2; // line n1
        String s4 = (String) (s3 * s2); //line n2
        System.out.println("Sum is " + s4);
    }
    /*Exception in thread "main" java.lang.RuntimeException: Uncompilable source code - incompatible types: long cannot be converted to java.lang.String
	at com.jubayir.Test.main(Test.java:9)*/
}
