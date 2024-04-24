import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToDH(111));
        System.out.println("*********************************");
        Compte cp = proxy.getCopmte(5);
        System.out.println("Code : " + cp.getCode());
        System.out.println("Solde : " + cp.getSolde());
        System.out.println("Date de Creation : " + cp.getDateCreation());
        System.out.println("*********************************");
        List<Compte> comptesList = proxy.listComptes();
        for (Compte c:comptesList) {
            System.out.println("code : " + c.getCode());
            System.out.println("Solde : " + c.getSolde());
            System.out.println("Date de Creation : " + c.getDateCreation());
        }

    }
}
