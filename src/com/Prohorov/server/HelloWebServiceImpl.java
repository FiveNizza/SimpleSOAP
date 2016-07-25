package com.Prohorov.server;

import javax.jws.WebService;

@WebService(endpointInterface = "com.Prohorov.server.HelloWebService")
public class HelloWebServiceImpl implements HelloWebService{
    @Override
    public String getHelloString(String name) {
        return "Hello " + name + ".";
    }
}
