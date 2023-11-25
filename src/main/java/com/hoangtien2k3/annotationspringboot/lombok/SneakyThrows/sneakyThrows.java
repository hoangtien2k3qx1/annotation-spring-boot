package com.hoangtien2k3.annotationspringboot.lombok.SneakyThrows;

import lombok.SneakyThrows;

import java.io.IOException;

/**
 * @author: hoangtien2k3
 * @create: 25/11/2023 - 11:31
 * @project: sneakyThrows.java
 * @description: @SneakyThrows
 * @update: 25/11/2023
 */
public class sneakyThrows {
    public static void main(String args[]) {
        try {
            throwsSneakyIOException();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    @SneakyThrows
    private static void throwsSneakyIOException() {
        throw new IOException("File Not found");
    }
}


//public class Main {
//    public static void main(String args[]) {
//        try {
//            throwsSneakyIOException();
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage().toString());
//        }
//    }
//    public static <E extends Throwable> void sneakyThrow(Throwable e) throws E {
//        throw (E) e;
//    }
//    private static void throwsSneakyIOException() {
//        sneakyThrow(new IOException("sneaky"));
//    }
//}
