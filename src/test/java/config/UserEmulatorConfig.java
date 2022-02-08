package config;


import org.aeonbits.owner.Config;

@Config.Sources({"classpath:userEmulatorMobile.properties"})
public interface UserEmulatorConfig extends Config {

    @Key("emulatorPlatformName")
    String emulatorPlatformName();

    @Key("emulatorDeviceName")
    String emulatorDeviceName();

    @Key("emulatorVersion")
    String emulatorVersion();
}
