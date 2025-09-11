package org.faraz.framework;

import org.faraz.framework.base.BaseTestClass;
import org.faraz.framework.base.ReadConfigFile;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest extends BaseTestClass {

    /*public static void main(String[] args) {
        ReadConfigFile wc = new ReadConfigFile();

        System.out.println(wc.getChromeDriverPath());
    }*/

    @Test
    void testAddition() throws InterruptedException {
        Thread.sleep(130121);
        assertEquals(2, 1 + 1);
    }


}