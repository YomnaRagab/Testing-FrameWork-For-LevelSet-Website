package wraperstests;

import org.testng.annotations.Test;
import wrappers.PropFileHandler;

public class WrapperTests {
    @Test
    public void testPropFile(){
        System.out.println(PropFileHandler.getProperty("name"));
        PropFileHandler.setProperty("graduation","2020");
        System.out.println(PropFileHandler.getProperty("graduation"));

    }
}
