package com.rapidbizapps.databindingfun;

/**
 * Created by mlanka on 11/11/16.
 */

public class StringUtils {

    public static String capitalize(String text) {
        return Character.toUpperCase(text.charAt(0)) + text.substring(1);
    }
}
