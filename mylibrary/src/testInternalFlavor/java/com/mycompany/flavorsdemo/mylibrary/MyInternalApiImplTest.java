package com.mycompany.flavorsdemo.mylibrary;

import com.mycompany.flavorsdemo.mylibrary.MyAPi;
import com.mycompany.flavorsdemo.mylibrary.MyApiImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;

/**
 * Created by nicolasg on 19/12/14.
 */
@Config(emulateSdk = 18)
@RunWith(RobolectricTestRunner.class)
public class MyInternalApiImplTest {
    @Test
    public void testGetCustomerTypeFromInternalFlavor() {
        MyAPi api = new MyApiImpl();
        assertEquals(api.getCustomerType(), CustomerType.INTERNAL);
    }
}
