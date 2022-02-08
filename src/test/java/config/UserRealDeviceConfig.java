package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:userRealDevice.properties"})
public interface UserRealDeviceConfig extends Config{

        @Key("realDeviceName")
        String realDeviceName();
    }
