import java.awt.*;

public abstract class Sprite {
    protected Point location = new Point();
    protected Direction face;
    protected Team team;
    protected int hp;
    protected int attackDistance;
    protected int damage;

    public abstract void update(int enemyBattleLine);

    public abstract void render(Graphics g);

    public abstract void attack(Team opponentTeam);

    public abstract void takeDamage();

    public void setTeam(Team team){
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }

    public Point getLocation(){
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public Direction getFace() {
        return face;
    }

    public void setFace(Direction face) {
        this.face = face;
    }

    public void takeDamage(int damage){
        hp -= damage;
    }

    public boolean isDead() { // make sure that removeSprite sets the team to null
        return hp<=0;
    }
}
