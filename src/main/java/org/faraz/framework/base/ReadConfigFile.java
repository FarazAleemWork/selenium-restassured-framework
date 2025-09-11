package org.faraz.framework.base;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

//creating this so a person can change the config file (chrome driver path) and run this framework on their local setup
public class ReadConfigFile {
    private static Properties prop;

    public void loadChromeDriverLocation(){
        prop = new Properties();
        try{
            prop.load(Files.newInputStream(Paths.get("src/main/java/resources/config.properties")));
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public String getChromeDriverPath(){
        if(prop == null){
            loadChromeDriverLocation();
        }
        return prop.getProperty("chromedriver.path");
    }

    public String getBaseUrlUi(){
        if(prop == null){
            loadChromeDriverLocation();
        }
        return prop.getProperty("baseUrl");
    }
}
