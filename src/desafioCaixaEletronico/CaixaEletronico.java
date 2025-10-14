package desafioCaixaEletronico;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class caixaEletronico {

    public static boolean isDouble(String texto) {

        if (texto == null || texto.isEmpty()) {
            return false;
        }

        try {
            Double.parseDouble(texto);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor Inválido!");
            return false;
        }
    }

    public static void main(String[] args) {

        Locale localeBrasil = new Locale("pt", "BR");
        NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance(localeBrasil);

        String[] metodoPagamento = {"Dinheiro", "Cartão", "Pix"};
        String[] opcoes = {"Registrar produto", "Finalizar compra", "Sair"};

        double troco = 0.00;
        double valorPagoEmDouble = 0.00;
        String valorPago;
        String registrarProduto;
        double valor;
        double totalCompra = 0.00;

        while (true) {

            int caixaEletronico = JOptionPane.showOptionDialog(
                    null,
                    "VALOR DA COMPRA:\n R$ " + totalCompra + "\nEscolha a operação que deseja realizar:",
                    "CAIXA ELETRÔNICO",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            if (caixaEletronico == 0) {
                while (true) {
                    registrarProduto = JOptionPane.showInputDialog("Digite o valor do produto:");
                    if (isDouble(registrarProduto)) {
                        valor = Double.parseDouble(registrarProduto);
                        if (valor > 0.00) {
                            totalCompra += valor;
                            break;
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Valor inválido!");
                        }
                    }
                    break;
                }
            }
            else if (caixaEletronico == 1 && totalCompra != 0) {
                if (totalCompra > 100.00) {
                    JOptionPane.showMessageDialog(null, "Desconto de 10% adicionado!");
                    totalCompra -= totalCompra * 0.10;
                }

                // Flag para finalizar compra
                boolean compraFinalizada = false;

                do {
                    int finalizarCompra = JOptionPane.showOptionDialog(
                            null,
                            "Valor total: R$ " + totalCompra,
                            "FINALIZAR COMPRA",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            metodoPagamento,
                            metodoPagamento[0]);

                    if (finalizarCompra == 0) {
                        while (true) {
                            valorPago = JOptionPane.showInputDialog("Digite o valor pago em espécie:");
                            if (valorPago == null) {
                                break;
                            }
                            else if (isDouble(valorPago)) {
                                valorPagoEmDouble = Double.parseDouble(valorPago);
                                if (valorPagoEmDouble > 0.00) {
                                    troco = valorPagoEmDouble - totalCompra;
                                    compraFinalizada = true;
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Valor inválido!");
                                }
                            }
                        }
                        if (valorPagoEmDouble > totalCompra) {
                            //NUMBER FORMAT
                            JOptionPane.showMessageDialog(null, "Troco: R$ " + troco);
                        }
                    }
                    else if (finalizarCompra == 1) {
                        //NUMBER FORMAT
                        JOptionPane.showMessageDialog(null, "Aproxime ou Insira o cartão :)");
                        compraFinalizada = true;
                    }
                    else if (finalizarCompra == 2) {
                        JOptionPane.showMessageDialog(null, "Desconto adicional de 2% aplicado!");
                        //NUMBERFORMAT
                        totalCompra -= totalCompra * 0.02;
                        JOptionPane.showMessageDialog(null, "QR-CODE");
                        compraFinalizada = true;
                    }

                    if (compraFinalizada) {

                        String totalCompraFormatada = formatadorMoeda.format(totalCompra);

                        JOptionPane.showMessageDialog(null, "Valor final da compra: " + totalCompraFormatada);
                        int novaCompra = JOptionPane.showConfirmDialog(null, "Iniciar uma nova compra?");

                        if (novaCompra == 0) {
                            totalCompra *= 0.00;
                        } else {
                            return;
                        }
                    }
                } while(totalCompra != 0.00);
                }
            else if (caixaEletronico == 2 || caixaEletronico == -1) {
                return;
            }
        }
    }
}

