public class YellowState implements TrafficLightState{
    @Override
    public void handleRequest() {
        System.out.println("Switching to Red");
    }
}
