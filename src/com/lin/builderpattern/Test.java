package com.lin.builderpattern;

/**
 * Test
 * @author linych
 * @version 1.0
 *
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person.Builder(1,"林轶超")
                            .age(-30)
                            .sex("男")
                            .desc("构造者模式")
                            .phone("18500214725")
                            .build();
        System.out.println(p);
    }
}
