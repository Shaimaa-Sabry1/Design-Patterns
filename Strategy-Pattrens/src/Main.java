public class Main {
    public static void main(String[] args) {
        Duck mallerDuck=new Duck() ;
        System.out.println("Mallered Duck");
        mallerDuck.setFlyBehavior(new FlyWithWings());
        mallerDuck.performFly();
        mallerDuck.setQuackBehavior(new Quack());
        mallerDuck.performQuack();
        System.out.println("******************");
        System.out.println("Rubber Duck");

        Duck rubberDuck = new Duck();

        rubberDuck.setFlyBehavior(new FlyNoWay());
        rubberDuck.setQuackBehavior(new SQuack());

        rubberDuck.performFly();
        rubberDuck.performQuack();

    }
}
