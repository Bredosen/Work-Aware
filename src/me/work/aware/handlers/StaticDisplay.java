package me.work.aware.handlers;

import me.work.aware.WorkAware;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public final class StaticDisplay {

    private final Frame frame;

    public StaticDisplay() {
        frame = new Frame();

        setupFrame();
    }

    private void setupFrame() {
        frame.setTitle(WorkAware.displayName() + " | Dynamic Display");
        frame.setUndecorated(true);
        setSize(1200.0D, 800.0D);
        centerLocation();
        setIcon();
    }

    private void setIcon() {
        try {
            URL url = WorkAware.class.getClassLoader().getResource("resources/WorkAwareIcon.png");
            Console.print(url);
            Image image = ImageIO.read(WorkAware.class.getClassLoader().getResource("resources/WorkAwareIcon.png"));
            if (image == null) {
                Console.print("error! :D");
                return;
            }
            frame.setIconImage(image);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void setSize(final double width, final double height) {
        frame.setSize((int) width, (int) height);
    }

    private void centerLocation() {
        frame.setLocationRelativeTo(null);
    }
}
