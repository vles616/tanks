import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by user on 25.08.2016.
 */
public class Sprite {

    private SpriteSheet sheet;
    private float scale;
    private BufferedImage image;

    public Sprite(SpriteSheet sheet, float scale) {
        this.sheet = sheet;
        this.scale = scale;
        image =  sheet.getSprite(0);
    }

    public void render(Graphics2D g, float x, float y) {

        g.drawImage(image, (int) (x), (int) (y), (int) (image.getWidth() * scale), (int) (image.getHeight() * scale), null);

    }

}
