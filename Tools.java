package Glimmer;

public abstract class Tools {
    private int Atkex=0;
    String Material;
    private int toughness=10;

    public int getAtkex() {
        return Atkex;
    }
    public int getToughness() {
        return toughness;
    }

    public void setAtxex(int Atkex) {
        this.Atkex = Atkex;
    }
    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public abstract void setMaterial(String a);
    public abstract void use();

    public static class Hoe extends Tools implements Handable{
        @Override
        public void setMaterial(String a) {
            this.Material=a;
            this.setAtxex(5);
            if(a.equals("Diamond")){
                int defense=this.getAtkex();
                this.setAtxex(defense*3);
            }else if(a.equals("Iron")){
                int defense=this.getAtkex();
                this.setAtxex(defense*1);
            }else if(a.equals("Gold")){
                int defense=this.getAtkex();
                this.setAtxex(defense/2);
            }
        }

        @Override
        public void handing(Player name) {
            name.atk+=this.getAtkex();
        }

        @Override
        public void use() {
            System.out.println("开垦了田地");
            System.out.println("伟大的工农阶级万岁！");
        }
    }

    public static class Sword extends Tools implements Handable{
        @Override
        public void setMaterial(String a) {
            this.Material=a;
            this.setAtxex(10);
            if(a.equals("Diamond")){
                int defense=this.getAtkex();
                this.setAtxex(defense*3);
            }else if(a.equals("Iron")){
                int defense=this.getAtkex();
                this.setAtxex(defense*1);
            }else if(a.equals("Gold")){
                int defense=this.getAtkex();
                this.setAtxex(defense/2);
            }
        }

        @Override
        public void handing(Player name) {
            name.atk+=this.getAtkex();
        }

        @Override
        public void use() {
            System.out.println("发射了火焰弹");
        }
    }

    public static class Pickaxe extends Tools implements Handable{
        @Override
        public void setMaterial(String a) {
            this.Material=a;
            this.setAtxex(5);
            if(a.equals("Diamond")){
                int defense=this.getAtkex();
                this.setAtxex(defense*3);
            }else if(a.equals("Iron")){
                int defense=this.getAtkex();
                this.setAtxex(defense*1);
            }else if(a.equals("Gold")){
                int defense=this.getAtkex();
                this.setAtxex(defense/2);
            }
        }

        @Override
        public void handing(Player name) {
            name.atk+=this.getAtkex();
        }

        @Override
        public void use() {
            System.out.println("使用了镐子");
            System.out.println("但是我忘记做石头了");
        }
    }

    public static class Axe extends Tools implements Handable{
        @Override
        public void setMaterial(String a) {
            this.Material=a;
            this.setAtxex(8);
            if(a.equals("Diamond")){
                int defense=this.getAtkex();
                this.setAtxex(defense*3);
            }else if(a.equals("Iron")){
                int defense=this.getAtkex();
                this.setAtxex(defense*1);
            }else if(a.equals("Gold")){
                int defense=this.getAtkex();
                this.setAtxex(defense/2);
            }
        }

        @Override
        public void handing(Player name) {
            name.atk+=this.getAtkex();
        }

        @Override
        public void use() {
            System.out.println("使用了斧子");
            System.out.println("但是我忘记做木头了");
        }
    }
}
