package config;

import org.aeonbits.owner.ConfigFactory;

public class AppRemote {
    public static UserRemoteConfig userRemoteConfig = ConfigFactory.create(UserRemoteConfig.class);
}
