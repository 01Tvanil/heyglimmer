package Glimmer;

import java.awt.*;

public class Player {

    //构建方法

    public Player(String n){
        this.name=n;
    }

    //基本数据

    String name;
    int defensePoint;
    int atk=10;
    int health=100;

    //基本行为

    public void wearArmor(Armor armor){
        if(armor instanceof Armor.Boots){
            this.defensePoint+=armor.getDefensePoint();
            System.out.println(this.name+"穿上了"+armor.Material+"鞋子,防御值变为了"+this.defensePoint);
        }else if (armor instanceof Armor.Chestaplate){
            this.defensePoint+=armor.getDefensePoint();
            System.out.println(this.name+"穿上了"+armor.Material+"胸甲,防御值变为了"+this.defensePoint);
        }else if(armor instanceof Armor.Helmet){
            this.defensePoint+=armor.getDefensePoint();
            System.out.println(this.name+"穿上了"+armor.Material+"头盔,防御值变为了"+this.defensePoint);
        }else if(armor instanceof Armor.Legging){
            this.defensePoint+=armor.getDefensePoint();
            System.out.println(this.name+"穿上了"+armor.Material+"裤子,防御值变为了"+this.defensePoint);
        }
    }

    public void getWeapon(Tools tool){
        if(tool instanceof Tools.Sword){
            System.out.println(this.name+"装备了"+tool.Material+"剑");
            ((Tools.Sword) tool).handing(this);
            System.out.println("攻击力变为了"+this.atk);
        }else if(tool instanceof Tools.Hoe){
            System.out.println(this.name+"装备了"+tool.Material+"锄");
            ((Tools.Hoe) tool).handing(this);
            System.out.println("攻击力变为了"+this.atk);
        }else if(tool instanceof Tools.Pickaxe){
            System.out.println(this.name+"装备了"+tool.Material+"镐");
            ((Tools.Pickaxe) tool).handing(this);
            System.out.println("攻击力变为了"+this.atk);
        }else if(tool instanceof Tools.Axe){
            System.out.println(this.name+"装备了"+tool.Material+"斧");
            ((Tools.Axe) tool).handing(this);
            System.out.println("攻击力变为了"+this.atk);
        }
    }

    public void useWeapon(Tools tool){
        if(tool instanceof Tools.Sword){
            System.out.print(this.name);
            tool.use();
            tool.setToughness(tool.getToughness()-1);
            System.out.println(this.name+"的剑耐久度变为"+tool.getToughness());
        }else if(tool instanceof Tools.Hoe){
            System.out.print(this.name);
            tool.use();
            tool.setToughness(tool.getToughness()-1);
            System.out.println(this.name+"的锄头耐久度变为"+tool.getToughness());
        }else if(tool instanceof Tools.Pickaxe){
            System.out.print(this.name);
            tool.use();
            tool.setToughness(tool.getToughness()-1);
            System.out.println(this.name+"的镐子耐久度变为"+tool.getToughness());
        }else if(tool instanceof Tools.Axe){
            System.out.print(this.name);
            tool.use();
            tool.setToughness(tool.getToughness()-1);
            System.out.println(this.name+"的斧头耐久度变为"+tool.getToughness());
        }
    }

    public Sundries useSundry(Sundries s){
        if(s instanceof Sundries.Torch){
            System.out.print(this.name);
            s.use();
            s=null;
        }else if(s instanceof  Sundries.Cake){
            System.out.print(this.name);
            s.use();
            this.health+=20;
            s=null;
        }
        return s;
    }

    public void ttk(Player name){
        System.out.println(this.name+"攻击了"+name.name);
        System.out.print(name.name+"的血量从"+name.health+"变为了");
        int sub=this.atk*(100-name.defensePoint)/100;
        name.health-=sub;
        System.out.println(name.health);
    }

}
