package test;

import org.junit.Test;
import schedule.utils.MD5Util;

public class TestMD5Util {

    @Test
    public void testEncryct(){
        String encrypt = MD5Util.encrypt("12345");
        System.out.println(encrypt);
    }
}
