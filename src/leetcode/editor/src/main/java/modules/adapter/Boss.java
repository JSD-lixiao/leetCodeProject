package modules.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/5/27 16:37
 */
public class Boss {
    private List<Player> players = new ArrayList<>();

    public void attach(Player player){
        players.add(player);
    }
    public void detach(Player player){
        players.removeIf(player::equals);
    }
    public void everyBodyAttack(){
        for (Player player:players){
            player.attack();
        }
    }


}
