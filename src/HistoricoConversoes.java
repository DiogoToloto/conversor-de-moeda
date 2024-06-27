import java.util.ArrayList;
import java.util.List;

public class HistoricoConversoes {
    private final List<String> historico;

    public HistoricoConversoes() {
        this.historico = new ArrayList<>();
    }

    public void adicionarConversao(String conversao) {
        historico.add(conversao);
    }

    public void mostrarHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Nenhuma conversão realizada ainda.");
        } else {
            System.out.println("Histórico de Conversões:");
            for (String conversao : historico) {
                System.out.println(conversao);
            }
        }
    }
}