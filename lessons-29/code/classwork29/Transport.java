package classwork29;

//внешний класс
public class Transport {

    private String model;
    private String goal;
    private Engine engine;

    public void go(){
        System.out.println("Transport is going");
        this.engine.turnOn();
    }

    public void stop(){
        System.out.println("Transport is stopped");
        this.engine.criticalTurnOff();
    }

    public void handleAnimalOnWay(){
        System.out.println("Critical situation");
        System.out.println("Animal is on the way");
        this.engine.turnOff();
    }

    public Transport(String model, String goal, double engineVolume) {
        this.model = model;
        this.goal = goal;
        this.engine = this.new Engine(engineVolume);

    }

        @Override
    public String toString() {
        return "Transport{" +
                "model='" + model + '\'' +
                ", goal='" + goal + '\'' +
                ", engine=" + engine +
                '}';
    }

    class Engine {
        private boolean isEnabled = false;
        private double volume;

        public void turnOn() {
            if (!this.isEnabled) {
                this.isEnabled = true;
                System.out.println("The engine is turned on");

            }
        }

        public void turnOff(){
            if(this.isEnabled){
                this.isEnabled = false;
                System.out.println("The engine is turned off");

            }
        }
        public void criticalTurnOff(){
            this.isEnabled = false;
            Transport.this.stop();
        }

        private Engine(double volume) {
            this.volume = volume;

        }

        @Override
        public String toString() {
            return "Engine{" +
                    "isEnabled=" + isEnabled +
                    ", volume=" + volume +
                    '}';
        }
    }


}
