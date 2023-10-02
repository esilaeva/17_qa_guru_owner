package com.melodicmind.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})

public interface WebConfig extends Config {

    @Key("baseUrl")
    String getBaseUrl();

    @Key("loginUrl")
    String getLoginUrl();

    @Key("browserName")
    Browser getBrowserName();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("browserSize")
    String getBrowserSize();

    @Key("remoteUrl")
    String getRemoteUrl();

    @Key("isRemote")
    Boolean isRemote();
}
