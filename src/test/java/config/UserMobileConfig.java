package config;

import org.aeonbits.owner.Config;


@Config.Sources({"classpath:userMobile.properties"})
public interface UserMobileConfig extends Config {

    @Key("user")
    String user();

    @Key("key")
    String key();

    @Key("url")
    String url();
}

