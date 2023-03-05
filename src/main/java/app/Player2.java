package app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Player2 {
    String deviceName;

    public String getDeviceName() {
        return deviceName;
    }

    @Value("iPhone x")
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
}
