public class RedState implements TrafficLightState{
    @Override
    public void handleRequest() {
        System.out.println("Switching to Green");
    }
}
