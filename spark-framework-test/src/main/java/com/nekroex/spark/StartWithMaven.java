package com.nekroex.spark;

import static spark.Spark.*;
/**
 * <p>
 *    start with maven
 * </p>
 * <p> Date: 2016-08-17 Time: 10:22 </p>
 *
 * @author jiyong.jy
 */
public class StartWithMaven {

    public static void main(String[] args) {
        // java8 single abstract method interfaces
        get("/hello", (req, res) -> "Hello World");
    }
}
