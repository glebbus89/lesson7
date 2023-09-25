package adapter;

import java.time.LocalDateTime;
import java.util.Locale;

public interface MeteoSensor {

    int getId(); // Уникальный идентификатор датчика

    double getTemperature(); // Средняя температура

    double getHumidity(); // Влажность

    double getPressure(); // Давление

    LocalDateTime genDateTime(); // Дата и Время

}
