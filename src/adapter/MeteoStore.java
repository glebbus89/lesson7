package adapter;

import java.time.LocalDateTime;

public class MeteoStore {

    boolean save(MeteoSensor meteoSensor) {
        System.out.format("Saving data from sensor [%d] at %s%n temperature - %f; himidity - %f; pressure - %f \n\r",
                meteoSensor.getId(),
                meteoSensor.genDateTime(),
                meteoSensor.getTemperature(),
                meteoSensor.getHumidity(),
                meteoSensor.getPressure());
        return true;
    }

    /*boolean save(SensorTemperature sensorTemperature) {
        System.out.format("Saving data from sensor [%d] at temperature - %f \n\r",
              sensorTemperature.getIdentifier(),
              sensorTemperature.temperature());
        return true;

    }*/

}
