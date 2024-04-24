package org.example;

import java.io.File;
import java.util.Arrays;


public class MyFilesList {
    public static void main(String[] args) {
        File file;
        if (args == null && args.length > 0) {
            System.out.println(args[0]);
            file = new File(args[0]);
        } else {
            file = new File(".");

        }
        System.out.println(Arrays.stream(file.listFiles()).filter(val -> val.isFile()).toList());

    }
}
