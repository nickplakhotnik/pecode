package pecode.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

public class FileSaved {

    private static String directory = "%s.jpg";

    public static void screenshotSaved(byte[] screenshot, String name) {
        try {
            BufferedImage bf = ImageIO.read(new ByteArrayInputStream(screenshot));
            ImageIO.write(bf, "jpg", new File(String.format(directory, name)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
