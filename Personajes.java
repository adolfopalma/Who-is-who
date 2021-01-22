public class Personajes {
    String nombre, colorPelo, sexo, colorPiel, complementos, colorOjos, velloFacial;

    public Personajes() {
        nombre = "Antonia";
        colorPelo = "Negro";
        sexo = "Mujer";
        colorPiel = "Blanca";
        complementos = "Gafas";
        colorOjos = "Azules";
        velloFacial = "No";
    }

    public Personajes(String nombre, String colorPelo, String sexo, String colorPiel, String complementos,
            String colorOjos, String velloFacial) {
        this.nombre = nombre;
        this.colorPelo = colorPelo;
        this.sexo = sexo;
        this.colorPiel = colorPiel;
        this.complementos = complementos;
        this.colorOjos = colorOjos;
        this.velloFacial = velloFacial;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorPelo() {
        return this.colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColorPiel() {
        return this.colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public String getComplementos() {
        return this.complementos;
    }

    public void setComplementos(String complementos) {
        this.complementos = complementos;
    }

    public String getColorOjos() {
        return this.colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getVelloFacial() {
        return this.velloFacial;
    }

    public void setVelloFacial(String velloFacial) {
        this.velloFacial = velloFacial;
    }
}