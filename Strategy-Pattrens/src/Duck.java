public  class Duck {
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    public void performFly()
    {
        flyBehavior.fly();
    }
    public void performQuack()
    {
        quackBehavior.quack();
    }


}
