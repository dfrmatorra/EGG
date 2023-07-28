
/**
 *
 * @author DarioF
 */
public class Dni {

    private char serie;
    private int num;

    public class Persona {

        private String nombre;
        private String apellido;
        private Dni dni;

        public Dni getDni() {
            return dni;
        }

        public void setDni(Dni dni) {
            this.dni = dni;
        }

    }

}
