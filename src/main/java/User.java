import java.util.ArrayList;
import java.util.List;

public class User {

    private final String email;
    private  String password;
    private final String nombreCompleto;
    private final String telefono;
    private final String modalidad;
    private final Boolean  traslado;
    private final String foto;
    private final String cv;

    Users users = new Users();
    private List<String> lenguajes = new ArrayList();



    private User(UserBuilder builder) {
        this.email = builder.email;
        this.password = builder.password;
        this.nombreCompleto = builder.nombreCompleto;
        this.telefono = builder.telefono;
        this.modalidad = builder.modalidad;
        this.traslado = builder.traslado;
        this.foto = builder.foto;
        this.cv = builder.cv;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getModalidad() {
        return modalidad;
    }

    public Boolean getTraslado() {
        return traslado;
    }

    public String getFoto() {
        return foto;
    }

    public String getCv() {
        return cv;
    }

    public List<String> getLenguajes()
    {
        return lenguajes;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", telefono='" + telefono + '\'' +
                ", modalidad='" + modalidad + '\'' +
                ", traslado=" + traslado +
                ", foto='" + foto + '\'' +
                ", cv='" + cv + '\'' +
                '}';
    }

    public static class UserBuilder{

        private final String email;
        private String password;
        private String nombreCompleto;
        private String telefono;
        private String modalidad;
        private Boolean  traslado;
        private String foto;
        private String cv;

        public UserBuilder(String email, String password) {
            this.email = email;
            this.password = password;
        }

        public UserBuilder password(String password)
        {
            this.password = password;
            return this;
        }

        public UserBuilder nombreCompleto(String nombreCompleto)
        {
            this.nombreCompleto = nombreCompleto;
            return this;
        }

        public UserBuilder telefono(String telefono)
        {
            this.telefono = telefono;
            return this;
        }

        public UserBuilder modalidad(String modalidad)
        {
            this.modalidad = modalidad;
            return this;
        }

        public UserBuilder traslado(Boolean traslado)
        {
            this.traslado = traslado;
            return this;
        }

        public UserBuilder foto(String foto)
        {
            this.foto = foto;
            return this;
        }

        public UserBuilder cv(String cv)
        {
            this.cv = cv;
            return this;
        }

       public User builder(){
            User user = new User(this);
            return user;
       }
    }

    public boolean register(String email, String password){


        return users.register(email,password);


    }

    public int login(String email, String password)
    {
        return users.login(email,password);
    }

    public void matricula( Lenguaje lenguaje)
    {
        this.lenguajes.add(lenguaje.getNombre());
        lenguaje.getUsuarios().add(email);

    }

    public Boolean desmatricular(Lenguaje lenguaje)
    {

        return lenguajes.remove(lenguaje);
    }
}
