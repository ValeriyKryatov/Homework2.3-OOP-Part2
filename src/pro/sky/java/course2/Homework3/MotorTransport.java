package pro.sky.java.course2.Homework3;

public abstract class MotorTransport extends WheeledTransport {

    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}