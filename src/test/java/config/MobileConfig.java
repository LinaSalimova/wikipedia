package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:ios.properties",
})
public interface MobileConfig extends Config {
    @Key("bs")
    String bs();

    @Key("device")
    String device();

    @Key("osVersion")
    String os_version();

    @Key("project")
    String project();

    @Key("build")
    String buildName();

    @Key("name")
    String testName();

}