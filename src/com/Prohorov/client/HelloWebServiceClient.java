package com.Prohorov.client;

import com.Prohorov.server.HelloWebService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class HelloWebServiceClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:1986/wss/hello?wsdl");

        QName qName = new QName("http://server.Prohorov.com/", "HelloWebServiceImplService");

        Service service = Service.create(url, qName);

        HelloWebService hello = service.getPort(HelloWebService.class);

        System.out.println(hello.getHelloString("user"));
    }
}
