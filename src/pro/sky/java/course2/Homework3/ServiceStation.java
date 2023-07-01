package pro.sky.java.course2.Homework3;

public class ServiceStation {

    public void check(Transport transport) {
        System.out.println("Начинаем обслуживание транспорта");
        System.out.println();
        transport.service();
        System.out.println("Обслуживание транспорта окончено");
        System.out.println();
    }
}