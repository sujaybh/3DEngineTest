import javax.swing.*;

public class World {
    public static int[] windowSize = {400, 400};
    public static boolean flag = true;
    public static DisplayGraphics window;
    public static PaintStack painter;
    public World() {

    }

    public void startWorld() {
        painter = new PaintStack();
        JFrame f=new JFrame();
        window = new DisplayGraphics();
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        RunSim mainLoop = new RunSim();
        f.setSize(windowSize[0],windowSize[1]);
        f.setLayout(null);
        f.setVisible(true);
        f.add(window);
        mainLoop.run();

    }

}
