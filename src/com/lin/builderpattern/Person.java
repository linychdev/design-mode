/*
 * @(#)Person.java 2019年4月11日下午6:39:15
 * design-mode
 * Copyright 2019 Thuisoft, Inc. All rights reserved.
 * THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.lin.builderpattern;

/**
 * Person
 * @author linych
 * @version 1.0
 *
 */
public class Person {
    //必要参数
    private final int id;
    private final String name;
    //可选参数
    private int age;
    private String sex;
    private String phone;
    private String address;
    private String desc;

    private Person(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
        this.phone = builder.phone;
        this.address = builder.address;
        this.desc = builder.desc;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }
    
    /** (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder2 = new StringBuilder();
        builder2.append(id);
        builder2.append(",");
        builder2.append(name);
        builder2.append(",");
        builder2.append(age);
        builder2.append(",");
        builder2.append(sex);
        builder2.append(",");
        builder2.append(phone);
        builder2.append(",");
        builder2.append(address);
        builder2.append(",");
        builder2.append(desc);
        return builder2.toString();
    }



    public static class Builder {
        //必要参数
        private final int id;
        private final String name;
        //可选参数
        private int age;
        private String sex;
        private String phone;
        private String address;
        private String desc;

        public Builder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder age(int val) {
            this.age = val;
            return this;
        }

        public Builder sex(String val) {
            this.sex = val;
            return this;
        }

        public Builder phone(String val) {
            this.phone = val;
            return this;
        }

        public Builder address(String val) {
            this.address = val;
            return this;
        }

        public Builder desc(String val) {
            this.desc = val;
            return this;
        }

        public Person build() {
            validation();
            return new Person(this);
        }

        /**
         * @return
         */
        private void validation() {
            validationAge();
            validationsex();
        }

        /**
         * 
         */
        private void validationsex() {
            if(!("男".equals(this.sex)||("女".equals(this.sex)))){
                throw new RuntimeException("性别只能为男或女");
            }
        }

        /**
         * 
         */
        private void validationAge() {
            if(this.age < 0){
                throw new RuntimeException("年龄不能为负数");
            }
        }
    }
}
