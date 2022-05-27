public class TestarAnimais {

    public static void main(String[] args) {

        Mamifero camelo = new Mamifero("Camelo",
                                       150,
                                       4,
                                       "Amarelo",
                                       "Terra",
                                       2.0,
                                       "Vegetais");

        camelo.dados();

        Peixe tubarao = new Peixe("Tubarão",
                                  300,
                                  0,
                                  "Cinzento",
                                  "Mar",
                                  1.5,
                                  "Barbatanas");
        tubarao.dados();
    }
}
