public class StatePatternExample {
    public static void main(String[] args) {
        TrafficLight trafficLight=new TrafficLight();
        trafficLight.requestStateChange();
        trafficLight.setState(new GreenState());
        trafficLight.requestStateChange();
        trafficLight.setState(new YellowState());
        trafficLight.requestStateChange();
    }
}
