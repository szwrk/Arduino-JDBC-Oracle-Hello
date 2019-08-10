package test;

import pl.hello.arduino.Serial;
import pl.hello.dao.SensorsDao;
import pl.hello.model.Sensors;

public class SensorsDaoTest {

    public static void main(String[] args) {

        SensorsDao sensorsDao = new SensorsDao();
        Sensors sensor = new Sensors();
        sensor.setAddress("0x28, 0xFF, 0x1A, 0x6B, 0x6E, 0x18, 0x01, 0x18");
        System.out.println(sensorsDao.getSensorIdByAddress(sensor));

    }
}
