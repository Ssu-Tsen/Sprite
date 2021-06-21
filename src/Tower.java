import java.lang.Math;
import java.awt.Point;

public class Tower extends Sprite{

    public Tower(int hp, int attackDistance){
        this.hp = hp;
        this.attackDistance = attackDistance;
    }

    @Override
    public void update(int enemyBattleLine) {

    }

    @Override
    public void attack(Team opponentTeam) {
        for(Unit opponent : opponentTeam){
            if(Math.abs(opponent.getLocation().x - this.location.x) <= attackDistance){
                opponent.takeDamage(damage);
            }
        }
    }
}
