package com.suki;

import lombok.Data;

public class Test01 {

    public static void main(String[] args) {
        Object o1 = new Object();  // 系统自带类

        System.out.println(o1.getClass().getClassLoader());  // Object是在启动类加载器（根加载器）加载的，但是我们拿不到它的引用，返回null

        Person p1 = new Person();   // 自定义类
        System.out.println(p1.getClass().getClassLoader());  // sun.misc.Launcher$AppClassLoader@18b4aac2  应用程序类加载器
        System.out.println(p1.getClass().getClassLoader().getParent());  // sun.misc.Launcher$ExtClassLoader@7f31245a  扩展类加载器
        System.out.println(p1.getClass().getClassLoader().getParent().getParent());  // null  启动类加载器（根加载器）
    }


}

@Data
class Person{
    private String name;
    private String age;
}
