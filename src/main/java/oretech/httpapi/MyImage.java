package oretech.httpapi;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class MyImage{
    public static void main(String args[])throws IOException{
      int width = 963;    //width of the image
      int height = 640;   //height of the image
      BufferedImage image = null;
      File file = null;

      try{
        file = new File("src/main/resources/html/images/limpopo.jpg");
        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        image = ImageIO.read(file);
      }catch(Exception e){
        e.printStackTrace();
      }
    }
}
