package com.mycompany.flavorsdemo.mylibrary;

import com.mycompany.flavorsdemo.MyTrace;

/**
 * Created by nicolasg on 18/12/14.
 */
public class MyApiImpl implements MyAPi {
    @Override
    public CustomerType getCustomerType() {
        MyTrace.trace("getCustomerType() -> Customer1");
        return CustomerType.CUSTOMER1;
    }
}
