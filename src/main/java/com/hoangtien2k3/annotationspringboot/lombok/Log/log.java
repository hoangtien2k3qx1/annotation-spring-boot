package com.hoangtien2k3.annotationspringboot.lombok.Log;

import lombok.extern.java.Log;

/**
 * @author: hoangtien2k3
 * @create: 25/11/2023 - 14:39
 * @project: log.java
 * @description: 
 * @update: 25/11/2023 
 */
@Log
public class log {
    public static void main(String... args) {
        log.severe("Something's wrong here");
    }
}

//public class LogExample {
//    private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(LogExample.class.getName());
//
//    public static void main(String... args) {
//        log.severe("Something's wrong here");
//    }
//}
