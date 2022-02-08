package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:userRemote.properties"})
public interface UserRemoteConfig extends Config {

    @Key("remoteUser")
    String remoteUser();

    @Key("remotePassword")
    String remotePassword();
}
