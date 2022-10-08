package oretech.httpapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.HttpCode;
import io.javalin.plugin.json.JsonMapper;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import java.util.List;
import java.util.Objects;

/**
 * Exercise 1
 * <p>
 * Application Server for the Tasks API
 */
public class Server {
    private final Javalin appServer;

    /**
     * Create the application server and configure it.
     */
    public Server() {
        this.appServer = Javalin.create(config -> {
            config.defaultContentType = "text/html";
            config.jsonMapper(createGsonMapper());
        });

        this.appServer.get("/",                     WebApiServerHandler::getHomePage);
        this.appServer.get("/javascript.js",        WebApiServerHandler::getJavascript);
        this.appServer.get("/index.css",            WebApiServerHandler::getCSS);
        this.appServer.get("/limpopo",              WebApiServerHandler::getLimpopoPage);
        // this.appServer.get("/images/limpopo.jpg",   WebApiServerHandler::getLimpopoImage);
    }

    /**
     * Use GSON for serialisation instead of Jackson
     * because GSON allows for serialisation of objects without noargs constructors.
     *
     * @return A JsonMapper for Javalin
     */
    private static JsonMapper createGsonMapper() {
        Gson gson = new GsonBuilder().create();
        return new JsonMapper() {
            @NotNull
            @Override
            public String toJsonString(@NotNull Object obj) {
                return gson.toJson(obj);
            }

            @NotNull
            @Override
            public <T> T fromJsonString(@NotNull String json, @NotNull Class<T> targetClass) {
                return gson.fromJson(json, targetClass);
            }
        };
    }

    /**
     * Start the application server
     *
     * @param port the port for the app server
     */
    public void start(int port) {
        this.appServer.start(port);
    }

    /**
     * Stop the application server
     */
    public void stop() {
        this.appServer.stop();
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start(4000);
    }
}
