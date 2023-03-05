package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Player {
    private Device device;
    private String songName;

    public Player(Device device, String songName) {
        this.device = device;
       this.songName = songName;
    }



    public void setDevice(Device device) {
        this.device = device;
    }

    @Value("Testing.mp3")
    public void setSongName(String songName) {
        this.songName = songName;
    }

    public Device getDevice() {
        return device;
    }


   public String getSongName() {
        return songName;
    }
}
