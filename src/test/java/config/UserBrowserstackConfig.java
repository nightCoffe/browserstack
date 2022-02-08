package config;

import org.aeonbits.owner.Config;


@Config.Sources({"classpath:userBrowserstack.properties"})
public interface UserBrowserstackConfig extends Config {

    @Key("user")
    String user();

    @Key("key")
    String key();

    @Key("url")
    String url();
}

