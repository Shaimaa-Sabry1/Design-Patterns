public class TrafficLight {
    private TrafficLightState trafficLightState;
   public TrafficLight()
    {
        trafficLightState=new RedState();
    }
    public void setState(TrafficLightState state)
    {
        this.trafficLightState=state;
    }
    public void requestStateChange() {
        trafficLightState.handleRequest();
    }
}
