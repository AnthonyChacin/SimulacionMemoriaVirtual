/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Aran_
 */
public class Proceso {

    private Pagina[] tablaDePaginas;
    private int duracion;
    private int tamProceso;
    private String nombre;
    private int cantidadPaginas;
    private int idProceso;

    public Proceso(int tamProceso, String nombre, int tamPagina, int idProceso) {
        this.tamProceso = tamProceso;
        this.nombre = nombre;
        this.idProceso = idProceso;
        this.generarTablaDePaginas(tamPagina);
        this.duracion = (int) (Math.random() * 5) + 1;
    }

    public void generarTablaDePaginas(int tamPagina) {
        if (this.tamProceso % tamPagina == 0) {
            this.cantidadPaginas = this.tamProceso / tamPagina;
        } else {
            this.cantidadPaginas = ((int) this.tamProceso / tamPagina) + 1;
        }
        this.tablaDePaginas = new Pagina[this.cantidadPaginas];
        for (int i = 0; i < this.tablaDePaginas.length; i++) {
            this.tablaDePaginas[i] = new Pagina(tamPagina, i, this.idProceso);
        }
    }

}
