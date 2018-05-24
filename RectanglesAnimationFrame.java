
package rectanglesanimation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * @author egsef
 */
public class RectanglesAnimationFrame extends JFrame{
    private RectanglesAnimationComponent scene;
    private static final short FRAME_WIDTH = 1920;
    private static final short FRAME_HEIGHT = 1080;
    private short ds;
    
    public RectanglesAnimationFrame (RectanglesAnimationComponent m) {
        scene = m;
        ds = 2;
        add(scene);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("My Rectangles Animation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setVisible(true);
        ActionListener ls = new TimerListener();
        final int DELAY = 25;
        Timer t = new Timer(DELAY, ls);
        t.start();    
    }
    
    class TimerListener implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            scene.translateAndGrowRectsBy(ds, ds);
        }
    } 
}
