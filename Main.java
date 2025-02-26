import java.time.LocalDate;
import java.util.List;

public class Main {

    Integer numero;
    Integer agencia;
    String nomeCliente;
    LocalDate dataNascimento;
    private Double saldo;
    boolean ativo = true;

    Double consultarSaldo(){

        return saldo;
    }

    @SuppressWarnings("rawtypes")
    List consultarExtrato (LocalDate dataInicial, LocalDate dataFinal){

        return null;
    }

    void cancelar(String justificativa){

    }

    void transferir ( Main contaDestino, 
                        Double valorTransferido){

    }

    void sacar (Double valorSolicitado){

    }

    public static void main(String[] args) {
        
    }
}