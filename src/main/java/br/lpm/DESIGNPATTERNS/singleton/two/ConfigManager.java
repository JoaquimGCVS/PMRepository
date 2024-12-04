package br.lpm.DESIGNPATTERNS.singleton.two;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private final Map<String,String> configurations;
    private static ConfigManager instance;
    private ConfigManager() {
        configurations = new HashMap<>();
    }
    public static ConfigManager getInstance() {
        if (instance==null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public void setConfig(String key, String value) {
        configurations.put(key,value);
    }

    public String getConfig(String key) {
        return configurations.getOrDefault(key,"No value");
    }

    public Map<String,String> listConfigs() {
        return configurations;
    }
}
