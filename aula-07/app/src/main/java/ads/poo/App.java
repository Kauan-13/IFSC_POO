/*
 * This source file was generated by the Gradle 'init' task
 */
package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class App {

    public static void main(String[] args) {
        Draw draw = new Draw();

        draw.filledCircle(.5,.5,.2);
        
        draw.setPenColor(Draw.BOOK_LIGHT_BLUE);
        draw.text(0.5, 0.5,"Kauan");

        draw.setPenColor(Draw.RED);
        draw.line(.1,.1,.3,.3);


    }
}