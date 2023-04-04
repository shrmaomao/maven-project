package com.mao;

import org.junit.Assert;
import org.junit.Test;

public class calTest {
    @Test
    public void showTest(){

        cal cal1 = new cal();
        int b=cal1.show(3);
        Assert.assertEquals("数据错误1",6,b);
    }
}
