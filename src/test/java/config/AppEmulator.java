package config;

import org.aeonbits.owner.ConfigFactory;

public class AppEmulator {
    public static UserEmulatorConfig userEmulatorConfig = ConfigFactory.create(UserEmulatorConfig.class);
}
