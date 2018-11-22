/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Aran_
 */
public class MemoriaVirtual {

    private int tamMemoriaPrincipal;
    private int tamPagina;
    private MarcoDePagina[] memoriaPrincipal;
    private int tamMemoriaSecundaria;
    private Pagina[] memoriaSecundaria;
    private LinkedList procesos;
    private int cantidadMarcosDePagina;

    public MemoriaVirtual(int tamMemoriaPrincipal, int tamPagina) {
        this.procesos = new LinkedList();
        this.establecerMarcosDePagina();
        this.tamMemoriaPrincipal = tamMemoriaPrincipal;
        this.tamPagina = tamPagina;
    }

    public void establecerMarcosDePagina() {
        this.cantidadMarcosDePagina = this.tamMemoriaPrincipal / this.tamPagina;
        this.memoriaPrincipal = new MarcoDePagina[this.cantidadMarcosDePagina];
        for (int i = 0; i < this.memoriaPrincipal.length; i++) {
            this.memoriaPrincipal[i] = new MarcoDePagina(this.tamPagina, i);
        }
    }
}
