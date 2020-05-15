/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class ExemploVetor {
    
    private String[] nomeLivro;
    
    public ExemploVetor(){
        nomeLivro = new String[3];
    }

    public String getNomeLivro(int i) {
        return nomeLivro[i];
    }

    public void setNomeLivro(String elementoNomeLivro, int i) {
        this.nomeLivro[i] = elementoNomeLivro;
    }
    
    public int mostrarQuantidade(){
        return nomeLivro.length;
    }
    
    public void add(String nomeLivro, int i){
        setNomeLivro(nomeLivro, i);
        JOptionPane.showMessageDialog(null, "Livro Add com sucesso!!");
    }
    
    public String listarLivros(){
        String res = "Lista de Livros\n ";
        for(int i = 0; i < nomeLivro.length;i++){
            res += (i+1)+"º "+getNomeLivro(i)+"\n";
        }
        return res;
    }
    
}
