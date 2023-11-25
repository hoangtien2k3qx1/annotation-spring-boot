package com.hoangtien2k3.annotationspringboot.lombok.Synchronized;

import lombok.Synchronized;

public class synchronized_excample {
    private final Object objectToLock = new Object();

    @Synchronized
    public static void sayHello() {
        System.out.println("Hello!");
    }

    @Synchronized
    public int getOne() {
        return 1;
    }

    @Synchronized("objectToLock")
    public void printObject() {
        System.out.println(objectToLock);
    }
}


//public class SynchronizedDemo {
//    private static final Object $LOCK = new Object[0];
//    private final Object $lock = new Object[0];
//    private final Object readLock = new Object();
//
//    public static void sayHello() {
//        synchronized($LOCK) {
//            System.out.println("Hello");
//        }
//    }
//
//    public int getOne() {
//        synchronized($lock) {
//            return 1;
//        }
//    }
//
//    public void printObject() {
//        synchronized(readLock) {
//            System.out.println(objectToLock);
//        }
//    }
//}