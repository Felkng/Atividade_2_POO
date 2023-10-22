/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.br.edu.ifnmg.atividade_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Felkng <&it;felkng374 at @gmail.com&gt;>
 */
public class Atividade_2 {

     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha qual atividade quer: ");
        System.out.println("1 - Exercício 1");
        System.out.println("2 - Exercício 2");        
        System.out.println("3 - Exercício 3");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                int t;
                System.out.println("Quantidade de ins e outs: ");
                t = (int)scanner.nextInt();
                Double aux;
                ArrayList<Double> ins = new ArrayList<>();
                ArrayList<Double> outs = new ArrayList<>();
                for(int i=0; i<t; i++){
                    System.out.println("\nin: ");
                    aux = (Double)scanner.nextDouble();
                    ins.add(new Double(aux));
                    System.out.println("\nout: ");
                    aux = (Double)scanner.nextDouble();
                    outs.add(new Double(aux));
                }
                for(var x: ins){
                    System.out.println(x + " ");
                }

                Dupla<Double, Double> res = new Dupla();
                res = MinhaClasse.metodo(ins, outs);

                System.out.println("w1 = " + res.getX() + " w0 = " + res.getY());
                break;
            case 2:
                System.out.println("Digite o CPF: ");
                String input = scanner.nextLine();                
                if(input.equals(""))
                    input = scanner.nextLine();
                if(input.startsWith("0") || input.contains(".") || input.contains("-")){
                    if(Utils.validateCpf(input))
                        System.out.println("Válido");
                    else
                    System.out.println("Inválido");
                }
                else{
                    if(Utils.validateCpf(Long.parseLong(input)))
                        System.out.println("Válido");
                    else
                        System.out.println("Inválido");
                }
                break;
            case 3:
                System.out.println("Digite a coluna inicial: ");
                int col = scanner.nextInt();
                System.out.println("Digite a linha inicial: ");
                int row = scanner.nextInt();
                PasseioCavalo cavalo = new PasseioCavalo(row, col);
                break;
        }
        
        
        
    }
}
