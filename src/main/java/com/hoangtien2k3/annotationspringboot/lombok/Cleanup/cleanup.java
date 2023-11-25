package com.hoangtien2k3.annotationspringboot.lombok.Cleanup;

import lombok.Cleanup;

import java.io.*;

// @Cleanup can be used to ensure a given resource is automatically cleaned up before leaving the current scope.

/**
 * @author: hoangtien2k3
 * @create: 25/11/2023 11:21
 * @project: cleanup.java
 * @description:
 * @update: 25/11/2023
 */
public class cleanup {
    public static void main(String[] args) throws IOException {
        @Cleanup
        InputStream input = new FileInputStream(args[0]);

        @Cleanup
        OutputStream output = new FileOutputStream(args[1]);

        byte[] b = new byte[10000];

        while (true) {
            int r = input.read(b);

            if (r == -1)
                break;

            output.write(b, 0, r);
        }
    }
}


//public class CleanupDemo {
//    public static void main(String[] args) throws IOException {
//        try (OutputStream output = new FileOutputStream(args[1])) {
//            try (InputStream input = new FileInputStream(args[0])) {
//                byte[] b = new byte[10000];
//
//                while (true) {
//                    int r = input.read(b);
//
//                    if (r == -1)
//                        break;
//
//                    output.write(b, 0, r);
//                }
//            }
//        }
//    }
//}