package ws;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main (String[] args){
        Endpoint.publish("http://localhost:8090/",new BanqueService());
        System.out.println("Web servise déployer");
    }
}
