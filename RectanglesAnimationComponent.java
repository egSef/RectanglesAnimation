package rectanglesanimation;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.JComponent;

/**
 * @author egsef
 */
public class RectanglesAnimationComponent extends JComponent{
    private static int width = 1, height = 1;
    private static int x1 = 1900, y1 = 1000;
    private static int x2 = 1901, y2 = 1001;
    private static int x3 = 1902, y3 = 1002;
    private static int x4 = 1900, y4 = 1000;
    private static int x5 = 1901, y5 = 1001;
    private static int x6 = 1902, y6 = 1002;
    private static int x7 = 1900, y7 = 1000;
    private static int x8 = 1901, y8 = 1001;
    private static int x9 = 1902, y9 = 1002;
    private int angle;
    private int STRING_X = 450, STRING_Y = 0;
    
    public RectanglesAnimationComponent () {}
    
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Color background = new Color(51,51,51);
        g2.setColor(background);
        g2.fillRect(0, 0, getWidth(), getHeight());
        
            int red = new Random().nextInt(256);
            int green = new Random().nextInt(256);
            int blue = new Random().nextInt(256);
            
        g2.setColor(new Color(red, green, blue));
        g2.setFont(new Font("Courier", 2, 40));
        g2.drawString("TIME IS AN ABYSS... DEATH IS NOT THE WORST", STRING_X, STRING_Y);
        Rectangle rec1 = new Rectangle(x1, y1, width, height);
        Rectangle rec2 = new Rectangle(x2, y2, width, height);
        Rectangle rec3 = new Rectangle(x3, y3, width, height);
        Rectangle rec4 = new Rectangle(x4, y4, width, height);
        Rectangle rec5 = new Rectangle(x5, y5, width, height);
        Rectangle rec6 = new Rectangle(x6, y6, width, height);
        Rectangle rec7 = new Rectangle(x7, y7, width, height);
        Rectangle rec8 = new Rectangle(x8, y8, width, height);
        Rectangle rec9 = new Rectangle(x9, y9, width, height);
        g2.draw(rec1); g2.fill(rec1); g2.rotate(angle, x1, y1);
        g2.draw(rec2); g2.fill(rec2); 
        g2.draw(rec3); g2.fill(rec3);
        g2.draw(rec4); g2.fill(rec4);
        g2.draw(rec5); g2.fill(rec5);
        g2.draw(rec6); g2.fill(rec6);
        g2.draw(rec7); g2.fill(rec7);
        g2.draw(rec8); g2.fill(rec8);
        g2.draw(rec9); g2.fill(rec9);
    }

    public void translateAndGrowRectsBy(int dx, int dy) {
        x1 = x1 - dx; y1 = y1 - dy;
        y2 = y2 - dy;
        x3 = x3 + dx; y3 = y3 - dy;
        x4 = x4 - dx; 
        x6 = x6 + dx; 
        x7 = x7 - dx; y7 = y7 + dy;  
        y8 = y8 + dy;
        x9 = x9 + dx; y9 = y9 + dy;
        width = width + dx / 2;
        height = height + dy / 2;
        angle = angle + dx;
        STRING_Y = STRING_Y + dx;
        repaint();
    }
}
