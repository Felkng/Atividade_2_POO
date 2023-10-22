/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.edu.ifnmg.atividade_2;

/**
 *
 * @author Felkng <&it;felkng374 at @gmail.com&gt;>
 */
public class Utils {
    public static int obterDigito(long num, int pos) throws Exception {
        if (pos < 1 || pos > 9) {
            throw new Exception("A posição do dígito deve estar entre 1 e 9.");
        }

        // Obtendo o dígito na posição especificada
        int digito = 0;
        for (int i = 1; i <= pos; i++) {
            digito = (int)(num % 10);
            num /= 10;
        }

        return digito;
    }

    public static boolean validateCpf(long cpf) {
        String strLong = Long.toString(cpf);
        return validateCpf(strLong);
    }

    public static boolean validateCpf(String cpf) {
        // Remova quaisquer caracteres não numéricos e verifique o tamanho
        cpf = cpf.replaceAll("[^0-9]", "");
        if (cpf.length() != 11) {
            return false;
        }

        boolean todosIguais = true;
        for (int i = 1; i < cpf.length(); i++) {
            if (cpf.charAt(i) != cpf.charAt(0)) {
                todosIguais = false;
                break;
            }
        }
        if (todosIguais) {
            return false;
        }

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            int digito = Character.getNumericValue(cpf.charAt(i));
            soma += digito * (10 - i);
        }
        int primeiroDigito = 11 - (soma % 11);
        if (primeiroDigito == 10 || primeiroDigito == 11) {
            primeiroDigito = 0;
        }
        if (primeiroDigito != Character.getNumericValue(cpf.charAt(9))) {
            return false;
        }

        soma = 0;
        for (int i = 0; i < 10; i++) {
            int digito = Character.getNumericValue(cpf.charAt(i));
            soma += digito * (11 - i);
        }
        int segundoDigito = 11 - (soma % 11);
        if (segundoDigito == 10 || segundoDigito == 11) {
            segundoDigito = 0;
        }
        if (segundoDigito != Character.getNumericValue(cpf.charAt(10))) {
            return false;
        }

        return true;
    }
}
