/*
 * @(#)Test.java 2019年4月11日下午6:40:51
 * design-mode
 * Copyright 2019 Thuisoft, Inc. All rights reserved.
 * THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
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
