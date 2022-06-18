package com.huabin.dp.singleton;

/**
 * @Author huabin
 * @DateTime 2022-06-18 08:55
 * @Desc
 */
public class Person {

    private volatile static Person instance;  // volatile 防止JVM指令重排序 保证（读取，初始化，赋值）三个操作全部完成，而不会在赋值但未初始化时被读取

    // private修饰，不让外部创建
    private Person(){
        System.out.println("创建了Person类");
    }

    public static Person getPerson(){  // 必须用static修饰才能被外部调用
        if (instance == null) {
            synchronized (Person.class) {  // 关键点
                if (instance == null) {
                    instance = new Person();
                }
            }
        }
        return instance;
    }
}
