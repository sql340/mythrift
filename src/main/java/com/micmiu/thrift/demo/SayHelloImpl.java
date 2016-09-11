package com.micmiu.thrift.demo;

import org.apache.thrift.TException;
/**
 * Created by shang on 16/8/17.
 */
public class SayHelloImpl implements HelloWorldService.Iface {

    @Override
    public String sayHello(String username) throws TException {
        System.out.println("传入:" + username);
        return "Hello " + username;
    }
}
