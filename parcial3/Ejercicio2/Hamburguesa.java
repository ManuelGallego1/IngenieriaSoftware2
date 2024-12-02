package parcial3.Ejercicio2;

public class Hamburguesa {
    private String tipoCarne;
    private String tipoTomate;
    private String tipoQueso;
    private String tipoPan;

    private Hamburguesa(Builder builder) {
        this.tipoCarne = builder.tipoCarne;
        this.tipoTomate = builder.tipoTomate;
        this.tipoQueso = builder.tipoQueso;
        this.tipoPan = builder.tipoPan;
    }

    public static class Builder {
        private String tipoTomate;
        private String tipoCarne;
        private String tipoQueso;
        private String tipoPan;

        public Builder setTipoTomate(String tipoTomate) {
            this.tipoTomate = tipoTomate;
            return this;
        }

        public Builder setTipoCarne(String tipoCarne) {
            this.tipoCarne = tipoCarne;
            return this;
        }

        public Builder setTipoQueso(String tipoQueso){
            this.tipoQueso = tipoQueso;
            return this;
        }

        public Builder setTipoPan(String tipoPan){
            this.tipoPan = tipoPan;
            return this;
        }

        public Hamburguesa build() {
            return new Hamburguesa(this);
        }
    }

    @Override
    public String toString(){
        return "Hamburguesa {"
         + "tipo tomate: " + tipoTomate + " / " 
         + "tipo carne: " + tipoCarne + " / "
         + "tipo queso: " + tipoQueso + " / "
         + "tipo pan: " + tipoPan
         + "}";
    }

}
