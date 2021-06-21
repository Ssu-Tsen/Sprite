import java.awt.*;
import java.util.List;

public abstract class State {
    protected List<Image> images;
    protected Unit unit;

    public abstract void update();
    public abstract void render();
}
