package Utils;

import Constants.EnvType;

import java.util.Properties;

public class ConfigLoader {
    private  final Properties properties;
    private static ConfigLoader instance;
    private static final String CONFIG_FILE_PATH = "src/test/resources/stage_config.properties";
    private ConfigLoader() {
        String env=System.getProperty("env",String.valueOf(Constants.EnvType.STAGE));
        switch (EnvType.valueOf(env))
        {
            case PROD:
                properties = PropertyUtils.propertyLoader("src/test/resources/prod_config.properties");
                break;
            case DEV:
                properties = PropertyUtils.propertyLoader("src/test/resources/dev_config.properties");
                break;
            case QA:
                properties = PropertyUtils.propertyLoader("src/test/resources/qa_config.properties");
                break;
            case STAGE:
                properties = PropertyUtils.propertyLoader("src/test/resources/stage_config.properties");
                break;
            default:
                properties = PropertyUtils.propertyLoader(CONFIG_FILE_PATH);
                break;
        }

    }
    public static ConfigLoader getInstance() {
        if (instance == null) {
            instance = new ConfigLoader();
        }
        return instance;
    }
    public String getProperty(String key) {
        return properties.getProperty(key);
    }
    public int getIntProperty(String key) {
        String value = properties.getProperty(key);
        return value != null ? Integer.parseInt(value) : 0;
    }
    public boolean getBooleanProperty(String key) {
        String value = properties.getProperty(key);
        return value != null && Boolean.parseBoolean(value);
    }
}
