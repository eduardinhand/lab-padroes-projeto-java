package subsistema2.cep;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }
    
    public String recuperarCidade(String cep) {
        if (cep.equals("14801788")) {
            return "Araraquara";
        } else {
            return "Cidade Desconhecida";
        }
    }
    
    public String recuperarEstado(String cep) {
        if (cep.equals("14801788")) {
            return "SP";
        } else {
            return "Estado Desconhecido";
        }
    }
}
