package oretech.httpapi;

import io.javalin.http.Context;
import io.javalin.http.HttpCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.json.JSONObject;


public class WebApiServerHandler {
   public static void getHomePage(Context context) {
      context.contentType("text/html");

      StringBuilder htmlPage = new StringBuilder();

      try {
         // Read file
         File myObj = new File("src/main/resources/html/home.html");
         Scanner myReader = new Scanner(myObj);

         // Read file content
         while (myReader.hasNextLine()) {
           String data = myReader.nextLine();
           htmlPage.append(data);
         }
         myReader.close();
      } catch (FileNotFoundException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }

      context.status(HttpCode.OK);
      context.result(htmlPage.toString());
   }
}
