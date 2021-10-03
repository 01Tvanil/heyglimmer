package Glimmer;
//父类
public abstract class Armor {
    private int defensePoint=0;
    String Material;
    private int toughness=10;

    public int getDefensePoint() {
        return defensePoint;
    }
    public int getToughness() {
        return toughness;
    }

    public void setDefensePoint(int defensePoint) {
        this.defensePoint = defensePoint;
    }
    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public abstract void setMaterial(String a);

    //子类：

    public static class Boots extends  Armor{
        @Override
        public void setMaterial(String a) {
            this.Material=a;
            this.setDefensePoint(4);
            if(a.equals("Diamond")){
                int defense=this.getDefensePoint();
                this.setDefensePoint(defense*3);
            }else if(a.equals("Iron")){
                int defense=this.getDefensePoint();
                this.setDefensePoint(defense*1);
            }else if(a.equals("Gold")){
                int defense=this.getDefensePoint();
                this.setDefensePoint(defense/2);
            }
        }
    }

    public static class Chestaplate extends Armor {
        @Override
        public void setMaterial(String a) {
            this.Material = a;
            this.setDefensePoint(10);
            if (a.equals("Diamond")) {
                int defense = this.getDefensePoint();
                this.setDefensePoint(defense * 3);
            } else if (a.equals("Iron")) {
                int defense = this.getDefensePoint();
                this.setDefensePoint(defense * 1);
            } else if (a.equals("Gold")) {
                int defense = this.getDefensePoint();
                this.setDefensePoint(defense / 2);
            }
        }

    }

    public static class Helmet extends Armor{
        @Override
        public void setMaterial(String a) {
            this.Material=a;
            this.setDefensePoint(6);
            if(a.equals("Diamond")){
                int defense=this.getDefensePoint();
                this.setDefensePoint(defense*3);
            }else if(a.equals("Iron")){
                int defense=this.getDefensePoint();
                this.setDefensePoint(defense*1);
            }else if(a.equals("Gold")){
                int defense=this.getDefensePoint();
                this.setDefensePoint(defense/2);
            }
        }
    }

    public static class Legging extends Armor{
        @Override
        public void setMaterial(String a) {
            this.Material=a;
            this.setDefensePoint(8);
            if(a.equals("Diamond")){
                int defense=this.getDefensePoint();
                this.setDefensePoint(defense*3);
            }else if(a.equals("Iron")){
                int defense=this.getDefensePoint();
                this.setDefensePoint(defense*1);
            }else if(a.equals("Gold")){
                int defense=this.getDefensePoint();
                this.setDefensePoint(defense/2);
            }
        }
    }
}
