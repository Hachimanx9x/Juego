/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author DIEGO
 */
//Canvas permire mostrar contenido de la ui
//Runnable permite usar la interfas de thread
public class Juego extends Canvas implements Runnable{
    //esto es para darle una id a la clase
    private static final long serialVersionUID = 1L; 
    //--------Configuacion ventana----------
    //dimenciones windows en px
    private static final int ANCHO = 800 ;
    private static final int ALTO = 600 ;
    //nombre de la ventana
    private static final String NOMBRE = "EL juego "; 
    // uso de la libreria de la ventana
    private static JFrame ventana; 
    //
    private static Thread thread;
    //main de juego
    private Juego(){
        //damos el tamaño al iniciar
        setPreferredSize(new Dimension(ANCHO,ALTO));
        //iniciamos la ventana con el nombre 
        ventana = new JFrame(NOMBRE); 
        //limpiamos para cuando se cierre se apague la aplicacion
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);//no puede alterar las dimenciones
        ventana.setLayout(new BorderLayout());//diseño de la ventana
        ventana.add(this, BorderLayout.CENTER);//centramos el contenido
        ventana.pack();//todo se ajusta al tamaño de la ventana
        ventana.setLocationRelativeTo(null);// hubicamos la pantalla en el escritorio
        ventana.setVisible(true);//poner la ventana visible
        
        
    }
    public static void main(String args[]) {
        Juego juego = new Juego(); 
        juego.iniciar(); 
    }
    private void iniciar(){
        thread = new Thread(this,"Graficos"); 
        thread.start(); 
    }
    private void detener(){
        
    }
    @Override
    public void run() {
         System.out.print("el thread 2 se esta ejecutando");
    }
    
   
}
/*
Thread

manda procesos 
mide su tiempo y orden de ejecucion 
permite ejecutar procesos de manera "sincronica" entre muchas comillas
*/
