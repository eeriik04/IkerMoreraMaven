package com.IkerMorera.tema4maven;
import com.github.lalyos.jfiglet.FigletFont;
import com.github.lalyos.jfiglet.JFiglet;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.graphics.TextGraphics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String texto = "Iker Morera";
        String banner = FigletFont.convertOneLine(texto);

        List<String> lines = new ArrayList<>();


        for (String line : banner.split("\\n")) {
            lines.add(line);
        }

        lines.add("");
        lines.add("");
        lines.add("Curriculum Vitae");
        lines.add("Nombre: iker Morera Larbi");
        lines.add("Edad: 22 años");
        lines.add("estudiante de desarrollo web");
        lines.add("lenguajes: java, javascript, html, css,");
        lines.add("Bases de datos: mySQL");
        lines.add("Control de versiones: git, github");
        lines.add("intereses: programación, informatica y videojuegos");
        lines.add("objetivo: convertirme en desarrollador web de frontend");
        lines.add("aptitudes: buen trabajo en equipo, proactivo y paciencia");
        lines.add("disponibilidad completa y coche propio");

        Screen screen = new DefaultTerminalFactory().createScreen();
        screen.startScreen();
        screen.setCursorPosition(null);

        int yOffset=screen.getTerminalSize().getRows();

        while (yOffset>-lines.size()) {
            drawFrame(screen,lines,yOffset);

            try {
                Thread.sleep(200);
            }catch (InterruptedException ignored){
            }
            yOffset--;
        }
        screen.stopScreen();
    }

    private static void drawFrame(Screen screen, List<String> lines, int yOffset)
            throws IOException, InterruptedException {
        TerminalSize size = screen.getTerminalSize();
        int width = size.getColumns();
        int height = size.getRows();
        screen.clear();
        TextGraphics tg = screen.newTextGraphics();
        for (int i = 0; i < lines.size(); i++) {
            int y = yOffset + i;
            if (y < 0 || y >= height) continue;
            String line = lines.get(i);
            // Centrado horizontal (opcional, pero queda mejor)
            int x = Math.max(0, (width - line.length()) / 2);
            if (x >= width) continue;
            // Recorte simple si se sale por la derecha
            String visible = (line.length() > width) ? line.substring(0, width) :
                    line;
            tg.putString(x, y, visible);
        }
        screen.refresh();

    }


}

