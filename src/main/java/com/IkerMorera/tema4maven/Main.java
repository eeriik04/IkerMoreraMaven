package com.IkerMorera.tema4maven;
import com.github.lalyos.jfiglet.FigletFont;
import com.github.lalyos.jfiglet.JFiglet;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String texto = "Iker Morera";
        String banner = FigletFont.convertOneLine(texto);

        List<String> lineas = new ArrayList<>();

        for (String linea : banner.split("\\n")) {
            lineas.add(linea);
        }

        lineas.add("");
        lineas.add("");
        lineas.add("Curriculum Vitae");
        lineas.add("Nombre: iker Morera Larbi");
        lineas.add("Edad: 22 años");
        lineas.add("estudiante de desarrollo web");
        lineas.add("lenguajes: java, javascript, html, css,");
        lineas.add("Bases de datos: mySQL");
        lineas.add("Control de versiones: git, github");
        lineas.add("intereses: programación, informatica y videojuegos");
        lineas.add("objetivo: convertirme en desarrollador web de frontend");
        lineas.add("aptitudes: buen trabajo en equipo, proactivo y paciencia");
        lineas.add("disponibilidad completa y coche propio");

    }
}

