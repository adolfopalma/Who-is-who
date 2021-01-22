import java.util.*;

public class Juego extends Personajes {

    public static void main(String[] arg) {
        RellenaPersonajes rellena = new RellenaPersonajes();
        List<Personajes> per = new ArrayList<Personajes>();

        for (Personajes personaje : rellena.rellenarPersonajes()) {
            per.add(personaje);
        }

        for (int i = 0; i < per.size(); i++) {
            System.out.println(per.get(i).getNombre() + ": " + per.get(i).getColorPelo() + ", " + per.get(i).getSexo()
                    + ". " + per.get(i).getColorPiel() + ", " + per.get(i).getComplementos() + ", "
                    + per.get(i).getColorOjos() + ", " + per.get(i).getVelloFacial());
        }
    }
}
