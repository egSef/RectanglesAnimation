package rectanglesanimation;
import javax.swing.JFrame;

/**
 * @author egsef
 */
public class RectanglesAnimation {

    public static void main(String[] args) {
        RectanglesAnimationComponent comp = new RectanglesAnimationComponent();
        JFrame frame = new RectanglesAnimationFrame(comp);
    }
}
