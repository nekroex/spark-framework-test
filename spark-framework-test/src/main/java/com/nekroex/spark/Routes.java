package com.nekroex.spark;

import static spark.Spark.*;

/**
 * <p>
 * </p>
 * <p> Date: 2016-08-17 Time: 10:22 </p>
 *
 * @author jiyong.jy
 */
public class Routes {

    public static void main(String[] args) {
        get("/", (req, res) -> "get");
        post("/", (req, res) -> "post");
        put("/", (req, res) -> "put");
        delete("/", (req, res) -> "delete");
        options("/", (req, res) -> "options");
        get("hello/:name", (req, res) -> "hello: " + req.params(":name"));
        get("say/*/to/*", (req, res) -> "number of splat params : " + req.splat().length);
    }
}
