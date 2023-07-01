package pro.sky.java.course2.Homework3;

public abstract class WheeledTransport implements Transport {
    private String modelName;
    private int wheelsCount;

    public WheeledTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
    public void updateTyre(){
        System.out.println("Проверяем покрышки");
    }
}