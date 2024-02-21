package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "Conversion")
    public double convertirEuroEnDH(@WebParam(name = "montant") double mt){
        return mt * 11;
    }

    @WebMethod
    public compte getCompte(@WebParam(name = "code") int code){
        return new compte(code,Math.random()*60000, new Date());
    }

    @WebMethod
    public List<compte> ListCompte(){
        return List.of(
                new compte(1,Math.random()*60000, new Date()),
                new compte(2,Math.random()*60000, new Date()),
                new compte(3,Math.random()*60000, new Date())
        );
    }
}
