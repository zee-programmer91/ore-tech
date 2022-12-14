package oretech.httpapi;

import io.javalin.http.Context;
import io.javalin.http.HttpCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.awt.image.BufferedImage;
import java.util.Scanner;

import javax.imageio.ImageIO;

import org.json.JSONObject;


public class   WebApiServerHandler {
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

   public static void getJavascript(Context context) {
      context.contentType("application/javascript");

      StringBuilder js = new StringBuilder();

      try {
         // Read file
         File myObj = new File("src/main/resources/html/javascript/javascript.js");
         Scanner myReader = new Scanner(myObj);

         // Read file content
         while (myReader.hasNextLine()) {
           String data = myReader.nextLine();
           js.append(data);
         }
         myReader.close();
      } catch (FileNotFoundException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }

      context.status(HttpCode.OK);
      context.result(js.toString());
   }

   public static void getCSS(Context context) {
      context.contentType("text/css");

      StringBuilder css = new StringBuilder();

      try {
         // Read file
         File myObj = new File("src/main/resources/html/css/index.css");
         Scanner myReader = new Scanner(myObj);

         // Read file content
         while (myReader.hasNextLine()) {
           String data = myReader.nextLine();
           css.append(data);
         }
         myReader.close();
      } catch (FileNotFoundException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }

      context.status(HttpCode.OK);
      context.result(css.toString());
   }

   public static void getLimpopoPage(Context context) {
      context.contentType("text/html");

      StringBuilder html = new StringBuilder();

      try {
         // Read file
         File myObj = new File("src/main/resources/html/limpopo.html");
         Scanner myReader = new Scanner(myObj);

         // Read file content
         while (myReader.hasNextLine()) {
           String data = myReader.nextLine();
           html.append(data);
         }
         myReader.close();
      } catch (FileNotFoundException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }

      context.status(HttpCode.OK);
      context.result(html.toString());
   }

   public static void getNorthenCapePage(Context context) {
      context.contentType("text/html");

      StringBuilder html = new StringBuilder();

      try {
         // Read file
         File myObj = new File("src/main/resources/html/northerncape.html");
         Scanner myReader = new Scanner(myObj);

         // Read file content
         while (myReader.hasNextLine()) {
           String data = myReader.nextLine();
           html.append(data);
         }
         myReader.close();
      } catch (FileNotFoundException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }

      context.status(HttpCode.OK);
      context.result(html.toString());
   }

   public static void getMpumalangaPage(Context context) {
      context.contentType("text/html");

      StringBuilder html = new StringBuilder();

      try {
         // Read file
         File myObj = new File("src/main/resources/html/mpumalanga.html");
         Scanner myReader = new Scanner(myObj);

         // Read file content
         while (myReader.hasNextLine()) {
           String data = myReader.nextLine();
           html.append(data);
         }
         myReader.close();
      } catch (FileNotFoundException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }

      context.status(HttpCode.OK);
      context.result(html.toString());
   }

   public static void getEasternCapePage(Context context) {
      context.contentType("text/html");

      StringBuilder html = new StringBuilder();

      try {
         // Read file
         File myObj = new File("src/main/resources/html/easterncape.html");
         Scanner myReader = new Scanner(myObj);

         // Read file content
         while (myReader.hasNextLine()) {
           String data = myReader.nextLine();
           html.append(data);
         }
         myReader.close();
      } catch (FileNotFoundException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }

      context.status(HttpCode.OK);
      context.result(html.toString());
   }

   public static void getFreeStatePage(Context context) {
      context.contentType("text/html");

      StringBuilder html = new StringBuilder();

      try {
         // Read file
         File myObj = new File("src/main/resources/html/freestate.html");
         Scanner myReader = new Scanner(myObj);

         // Read file content
         while (myReader.hasNextLine()) {
           String data = myReader.nextLine();
           html.append(data);
         }
         myReader.close();
      } catch (FileNotFoundException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }

      context.status(HttpCode.OK);
      context.result(html.toString());
   }

   public static void getGautengPage(Context context) {
      context.contentType("text/html");

      StringBuilder html = new StringBuilder();

      try {
         // Read file
         File myObj = new File("src/main/resources/html/gauteng.html");
         Scanner myReader = new Scanner(myObj);

         // Read file content
         while (myReader.hasNextLine()) {
           String data = myReader.nextLine();
           html.append(data);
         }
         myReader.close();
      } catch (FileNotFoundException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }

      context.status(HttpCode.OK);
      context.result(html.toString());
   }

   public static void getKwaZuluNatalPage(Context context) {
      context.contentType("text/html");

      StringBuilder html = new StringBuilder();

      try {
         // Read file
         File myObj = new File("src/main/resources/html/kwazulunatal.html");
         Scanner myReader = new Scanner(myObj);

         // Read file content
         while (myReader.hasNextLine()) {
           String data = myReader.nextLine();
           html.append(data);
         }
         myReader.close();
      } catch (FileNotFoundException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }

      context.status(HttpCode.OK);
      context.result(html.toString());
   }

   public static void getLesothoPage(Context context) {
      context.contentType("text/html");

      StringBuilder html = new StringBuilder();

      try {
         // Read file
         File myObj = new File("src/main/resources/html/lesotho.html");
         Scanner myReader = new Scanner(myObj);

         // Read file content
         while (myReader.hasNextLine()) {
           String data = myReader.nextLine();
           html.append(data);
         }
         myReader.close();
      } catch (FileNotFoundException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }

      context.status(HttpCode.OK);
      context.result(html.toString());
   }

   public static void getNorthWestPage(Context context) {
      context.contentType("text/html");

      StringBuilder html = new StringBuilder();

      try {
         // Read file
         File myObj = new File("src/main/resources/html/northwest.html");
         Scanner myReader = new Scanner(myObj);

         // Read file content
         while (myReader.hasNextLine()) {
           String data = myReader.nextLine();
           html.append(data);
         }
         myReader.close();
      } catch (FileNotFoundException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }

      context.status(HttpCode.OK);
      context.result(html.toString());
   }

   public static void getWesternCapePage(Context context) {
      context.contentType("text/html");

      StringBuilder html = new StringBuilder();

      try {
         // Read file
         File myObj = new File("src/main/resources/html/westerncape.html");
         Scanner myReader = new Scanner(myObj);

         // Read file content
         while (myReader.hasNextLine()) {
           String data = myReader.nextLine();
           html.append(data);
         }
         myReader.close();
      } catch (FileNotFoundException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }

      context.status(HttpCode.OK);
      context.result(html.toString());
   }

   public static void getAboutPage(Context context) {
      context.contentType("text/html");

      StringBuilder html = new StringBuilder();

      try {
         // Read file
         File myObj = new File("src/main/resources/html/about.html");
         Scanner myReader = new Scanner(myObj);

         // Read file content
         while (myReader.hasNextLine()) {
           String data = myReader.nextLine();
           html.append(data);
         }
         myReader.close();
      } catch (FileNotFoundException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
      }

      context.status(HttpCode.OK);
      context.result(html.toString());
   }
}

