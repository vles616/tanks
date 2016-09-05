import java.awt.*;

/**
 * Created by user on 23.08.2016.
 */
public class Text {

    private double x;
    private double y;
    private long time;
    private long start;
    private String s;

    public Text(double x, double y, String s, long time) {
        this.x = x;
        this.y = y;
        this.s = s;
        this.time = time;
        start = System.nanoTime();
    }

    public boolean update() {
        long elapsed = (System.nanoTime() - start) / 1000000;
        if (elapsed > time) {
            return true;
        }
        return false;
    }

    public void draw(Graphics2D g) {

        g.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        long elapsed = (System.nanoTime() - start) / 1000000;
        int alpha = (int)(255*Math.sin(3.14*elapsed/time));
        if (alpha>255) alpha = 255;
        g.setColor(new Color(255,255,255,alpha));
        int length = (int)g.getFontMetrics().getStringBounds(s,g).getWidth();
        g.drawString(s, (int)(x-(length/2)),(int)y);
//        g.setColor(Color.WHITE);
//        g.drawString(s, (int) x, (int) y);
    }


}
