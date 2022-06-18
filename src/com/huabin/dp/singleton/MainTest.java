package com.huabin.dp.singleton;

/**
 * @Author huabin
 * @DateTime 2022-06-18 08:55
 * @Desc
 */
public class MainTest {

    public static void main(String[] args) {
        Person person1 = Person.getPerson();
        Person person2 = Person.getPerson();
        System.out.println(person2 == person1);
    }

}
