package controlleur;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped

public class ControlleurPersonne {
    private String resultat;
    public void test()
    {
        resultat = "test";
    }
    public String getResultat() {
        return resultat;
    }
}
