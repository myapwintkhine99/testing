package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Device {
    private String deviceName;


    public String getDeviceName() {
        return deviceName;
    }

    @Value("Samsung")
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }


}
