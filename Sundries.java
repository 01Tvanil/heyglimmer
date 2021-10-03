package Glimmer;

public abstract class Sundries {
    public abstract void use();

    public static class Torch extends Sundries{
        @Override
        public void use() {
            System.out.println("火炬被点亮了");
        }
    }

    public static class Cake extends Sundries{
        String name="cake";
        @Override
        public void use() {
            System.out.println("吃了一个蛋糕，血量恢复了20点");
        }
    }
}
