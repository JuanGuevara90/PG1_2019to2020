/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import com.sun.opengl.util.Animator;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.swing.JFrame;


/**
 *
 * @author UCE
 */
public class Linea extends JFrame{
    static  GL gl;
    static GLU glu;
    
    public  Linea(){
        setTitle("Puntos");
        setSize(700,700);
        
        // Intancia de clase GraphicListener
        
        GraphicListener listener = new GraphicListener();
        GLCanvas canvas= new GLCanvas(new GLCapabilities());
        canvas.addGLEventListener(listener);
        getContentPane().add(canvas);
        
    }
    
    public static void main(String args[]){
        Linea frame = new Linea();
        frame.setVisible(true);
        frame.
    setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    public class GraphicListener 
            implements GLEventListener{

        @Override
        public void init(GLAutoDrawable arg0) {
            // Activar propiedades 

            
        }

        @Override
        public void display(GLAutoDrawable arg0) {
            glu = new GLU();
            gl = arg0.getGL();
            
            gl.glClearColor(0, 0, 1, 0);
            
            // Establecer los parametros de la proyección
            gl.glMatrixMode(gl.GL_PROJECTION);
            gl.glLoadIdentity();
            glu.gluOrtho2D(0,200,0 ,150);
            
            // Creación de linea
            // Definir el grosor de la linea
            gl.glLineWidth(7);
            gl.glColor3f(1,0,0
            );
            // Creacion
            // Letra J
            gl.glBegin(gl.GL_LINES);
                gl.glVertex2d(10, 50);
                gl.glVertex2d(50, 50);
                gl.glVertex2d(30, 50);
                gl.glVertex2d(30, 20);
                gl.glVertex2d(10, 20);
                gl.glVertex2d(30, 20);
                

            gl.glEnd();
            // Letra U
             gl.glColor3f(0,0,1);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex2d(60,50);
                gl.glVertex2d(60,20);
                gl.glVertex2d(60,20);
                gl.glVertex2d(90,20);
                gl.glVertex2d(90,20);
                gl.glVertex2d(90,50);
            gl.glEnd();
            
             // Letra A
             gl.glColor3f(0,1,0);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex2d(100,50);
                gl.glVertex2d(100,20);
                gl.glVertex2d(100,50);
                gl.glVertex2d(130,50);
                gl.glVertex2d(130,50);
                gl.glVertex2d(130,20);
                gl.glVertex2d(100,35);
                gl.glVertex2d(130,35);
            gl.glEnd();
            
            // Letra N
             gl.glColor3f(1,1,0);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex2d(140,50);
                gl.glVertex2d(140,20);
                gl.glVertex2d(140,50);
                gl.glVertex2d(170,20);
                gl.glVertex2d(170,20);
                gl.glVertex2d(170,50);

            gl.glEnd();
            gl.glFlush();

             
        }

        @Override
        public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
            
        }
        @Override
        public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
            
        }
        
    }
    
}
