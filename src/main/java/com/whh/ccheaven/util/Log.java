package com.whh.ccheaven.util;

/**
 * @author weiwhite on 5/17/17.
 * @description
 */
public class Log {
    private static final boolean DEBUG = true;

    public static void print(String tag, String message) {
        if (DEBUG) {
            System.out.print(tag + "," + message);
        }
    }

    public static void println(String tag, String message) {
        if (DEBUG) {
            System.out.println(tag + "," + message);
        }
    }

}
