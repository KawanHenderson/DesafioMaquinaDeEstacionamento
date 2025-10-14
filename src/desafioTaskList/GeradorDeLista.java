package DesafioTaskList;

import java.util.List;

public class GeradorDeLista {
    public static String formatarListaParaExibicao(List<String> listaDeTarefas) {
        if (listaDeTarefas.isEmpty()){
            return "Lista de tarefas vazia";
        }
        StringBuilder mensagem = new StringBuilder();
        for (int i = 0; i < listaDeTarefas.size(); i++){
            mensagem.append((i + 1)).append(". ").append(listaDeTarefas.get(i)).append("\n");
        }
        return mensagem.toString();
    }
}
