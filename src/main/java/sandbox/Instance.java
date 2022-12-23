package sandbox;

import script.SCRIPT;
import snake2d.MButt;
import snake2d.Renderer;
import snake2d.util.datatypes.COORDINATE;
import snake2d.util.file.FileGetter;
import snake2d.util.file.FilePutter;
import util.gui.misc.GBox;
import view.keyboard.KEYS;

import java.io.IOException;

public class Instance implements SCRIPT.SCRIPT_INSTANCE {
    private double elapsedTime = 0;

    public Instance() {
        System.out.println("Instance initialized!");
    }

    @Override
    public void update(double deltaTime) {
        elapsedTime += deltaTime;
        if (elapsedTime > 5) {
            elapsedTime -= 5;
            System.out.println("Hello from my custom script!");
        }
    }

    @Override
    public void save(FilePutter filePutter) {

    }

    @Override
    public void load(FileGetter fileGetter) throws IOException {

    }

    @Override
    public void hoverTimer(double mouseTimer, GBox text) {
        SCRIPT.SCRIPT_INSTANCE.super.hoverTimer(mouseTimer, text);
    }

    @Override
    public void render(Renderer r, float ds) {
        SCRIPT.SCRIPT_INSTANCE.super.render(r, ds);
    }

    @Override
    public void keyPush(KEYS key) {
        SCRIPT.SCRIPT_INSTANCE.super.keyPush(key);
    }

    @Override
    public void mouseClick(MButt button) {
        SCRIPT.SCRIPT_INSTANCE.super.mouseClick(button);
    }

    @Override
    public void hover(COORDINATE mCoo, boolean mouseHasMoved) {
        SCRIPT.SCRIPT_INSTANCE.super.hover(mCoo, mouseHasMoved);
    }
}
