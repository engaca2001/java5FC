

public class Main {

    public static void main(String[] args) {
        Pais pais1 = new Pais("España");
        Pais pais2 = new Pais("Francia");

        Ciudad madrid = new Ciudad("Madrid",pais1);


        User user1 = new User.UserBuilder("engaca2001@hotmail.com","palomino")
                .nombreCompleto("Enrique Gallego Cabrales")
                .pais(pais1)
                .builder();

        User user2 = new User.UserBuilder("pepe@hotmail.com","casitas")
                .nombreCompleto("Pepito Flores")
                .pais(pais1)
                .ciudad(madrid)
                .builder();





        

        System.out.println(user1.register(user1.getEmail(),user1.getPassword()));


        System.out.println(user1.login(user1.getEmail(),user1.getPassword()));

        System.out.println(user2.register(user1.getEmail(),user1.getPassword()));


        System.out.println(user2.login(user1.getEmail(),user1.getPassword()));

        Lenguaje lenguaje1= new Lenguaje("java");
        Lenguaje lenguaje2= new Lenguaje("python");

        user1.matricula(lenguaje1);
        user2.matricula(lenguaje1);
        user2.matricula(lenguaje2);

        System.out.println(user2.getLenguajes());

        System.out.println(lenguaje1.getUsuarios());

        System.out.println(user2);

        System.out.println(pais1.getUsuarios());
        System.out.println(pais2.getUsuarios());

        System.out.println(pais1.getCiudades());
        System.out.println(pais2.getCiudades());




    }




}
