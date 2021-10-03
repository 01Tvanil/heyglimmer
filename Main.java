package Glimmer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player Steven=new Player("Steven");
        Player Alex=new Player("Alex");
        Tools.Sword s1=new Tools.Sword();
        Tools.Hoe h1=new Tools.Hoe();
        h1.setMaterial("Gold");
        s1.setMaterial("Diamond");
        Armor.Boots b1=new Armor.Boots();
        b1.setMaterial("Diamond");
        Steven.getWeapon(s1);
        Steven.useWeapon(s1);
        Alex.getWeapon(h1);
        Alex.useWeapon(h1);
        Alex.ttk(Steven);
        Steven.wearArmor(b1);
        Alex.ttk(Steven);
        List<Sundries.Torch> torches=new ArrayList<>();
        List<Sundries.Cake> cakes=new ArrayList<>();
        for(int i=1;i<=64;i++){
            if(i<=4){
                torches.add(new Sundries.Torch());//火炬有64个，蛋糕有4个
                cakes.add(new Sundries.Cake());
            }else{
                torches.add(new Sundries.Torch());
            }
        }
        Steven.ttk(Alex);
        Alex.useSundry(cakes.get(1));
        Steven.ttk(Alex);
    }
}
