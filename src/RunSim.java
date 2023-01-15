import java.awt.*;

public class RunSim implements Runnable {
    public void run() {
        while (Main.world.flag) {

            Main.world.painter.changeLinePoint(1, 1);
            render();

            try {
                Thread.sleep(1000/30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void render() {
        Main.world.window.repaint();
    }

}
