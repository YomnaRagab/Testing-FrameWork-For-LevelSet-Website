package wrappers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropFileHandler {
    static String fileNameAndPath = "Config.properties";
    public static Properties propFile = new Properties();

    static {
        FileInputStream fs =null;
        try{
            fs = new FileInputStream(fileNameAndPath);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        try{
            propFile.load(fs);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fs.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static String getProperty(String key){
        try{
            return propFile.getProperty(key);
        }
        catch (Exception e){
            return null;
        }
    }
    public static void setProperty(String key, String value){
        propFile.setProperty(key, value);
    }

}
