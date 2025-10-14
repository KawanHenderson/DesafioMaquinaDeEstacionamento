package DesafioTaskList;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TaskList {

    public static void main (String[] args) {
        List<String> tarefas = new ArrayList<>();

        String[] opcoes = {"Adicionar", "Remover", "Cancelar"};

        while(true){

            String gerarLista = GeradorDeLista.formatarListaParaExibicao(tarefas);

            int taskList = JOptionPane.showOptionDialog(
                    null,
                    gerarLista ,
                    "LISTA DE TAREFAS",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
                    );
            if (taskList == 0) {
                String novaTarefa = JOptionPane.showInputDialog(
                        null,
                        "Nova tarefa:",
                        "ADICIONAR NOVA TAREFA",
                        JOptionPane.QUESTION_MESSAGE);

                if (novaTarefa != null && !novaTarefa.trim().isEmpty()) {
                    tarefas.add(novaTarefa.trim());

                    JOptionPane.showMessageDialog(
                            null,
                            novaTarefa.trim(),
                            "TAREFA ADICIONADA!",
                            JOptionPane.INFORMATION_MESSAGE);

                }
                else {
                    JOptionPane.showMessageDialog(
                            null,
                            "Nenhuma tarefa foi adicionada.",
                            "Operação cancelada",
                            JOptionPane.WARNING_MESSAGE);
                }
            }

            if (taskList == 1) {
                if (tarefas != null && !tarefas.isEmpty()) {
                    int removerTarefa = JOptionPane.showOptionDialog(
                            null,
                            "Selecione a tarefa que deseja remover:",
                            "REMOVER TAREFA",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.WARNING_MESSAGE,
                            null,
                            tarefas.toArray(),
                            tarefas.toArray());

                    tarefas.remove(removerTarefa);

                }
                else {
                    JOptionPane.showMessageDialog(
                            null,
                            "LISTA DE TAREFAS VAZIA");
                }
            }
            if (taskList == 2 || taskList == -1) {
                return;
            }
        }
    }
}

