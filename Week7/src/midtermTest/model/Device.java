package midtermTest.model;

import java.util.UUID;

public class Device {
    private String id;
    private String model;

    public Device(String model) {
        this.id = UUID.randomUUID().toString();
        this.model = model;
    }

    public Device() {
    }

    public String getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
