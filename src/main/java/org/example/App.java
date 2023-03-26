package org.example;
import static spark.Spark.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        secure(getKeyStore(), getPwdKeyStore(), null, null);
        port(getPort());
        get("/local", (req, res) -> "Hello 1");
        get("/remote",(req, res) -> URLReader.readURL("localhost:5000/local"));
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
    private static String getKeyStore() {
        if (System.getenv("KEYSTORE") != null) {
            return System.getenv("KEYSTORE");
        }
        return "keystores/ecikeystore.p12";

    }
    private static String getPwdKeyStore() {
        if (System.getenv("KEYSTOREPWD") != null) {
            return System.getenv("KEYSTOREPWD");
        }
        return "123456";
    }

}

