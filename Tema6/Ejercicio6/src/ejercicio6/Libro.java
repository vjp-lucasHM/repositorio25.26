/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

import java.util.Set;

/**
 *
 * @author tumba
 */
public class Libro implements Transformable {
    
    private String titulo, autor, genero;

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.genero = "";
    }

    public Libro(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + '}';
    }

    @Override
    public String concadenarTodo() {
        return titulo + "#" + autor +  "#" + genero;
    }

    @Override
    public String obtenerIniciales() {
        return titulo.charAt(0) + " " + autor.charAt(0) + " " + genero.charAt(0);
    }

    @Override
    public int contarVocales() {
        return contarVocalesString(titulo) + contarVocalesString(autor) + contarVocalesString(titulo);
    }

    @Override
    public String obtenerCadenaMasLarga() {
        if(titulo.length() > autor.length() && titulo.length() > genero.length()) {
            return titulo;
        } else if(autor.length() > titulo.length() && autor.length() > genero.length()) {
            return autor;
        } else {
            return genero;
        }
    }

    @Override
    public boolean buscarCadena(String s) {
        return autor.equalsIgnoreCase(s) || genero.equalsIgnoreCase(s) || titulo.equalsIgnoreCase(s);
    }
    
    public int contarVocalesString(String s) {
        int vocales = 0;
        
        for(int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(0));
            
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++;
            }
        }
        
        return vocales;
    }

    
    
    
    
}
