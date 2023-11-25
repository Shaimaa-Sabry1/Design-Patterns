public class GreenState implements TrafficLightState{
    @Override
    public void handleRequest() {
        System.out.println("Switching to Yellow");
    }
}
