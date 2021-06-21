import java.awt.*;
import java.util.List;

public abstract class Unit extends Sprite {
    protected List<State> states;
    protected State currentState;
    protected Direction face;
    protected int movementSpeed;
    protected int attackCd;
    protected int attackDistance;
    protected int hp;

    public Unit(int speed, int attackDist, int hp){
        currentState = new Moving();
        movementSpeed = speed;
        attackDistance = attackDist;
        this.hp = hp;
    }

    @Override
    public void update(int enemyBattleLine) {
        if(super.getLocation().x - enemyBattleLine > attackDistance){
            //currentState = MoveState;
            currentState.update();
        }
    }

    public void move(Direction dir){
        if(dir == Direction.LEFT){
            super.getLocation().x -= movementSpeed;
        } else {
            super.getLocation().x += movementSpeed;
        }
    }

    public void takeDamage(int damage){
        hp -= damage;
    }

}
