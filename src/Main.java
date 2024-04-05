/*
Crea una classe Person con i campi firstName, lastName, age e address, i getter e i setter.
Il costruttore accetterà un Builder in input.
Creare una classe Builder che attraverso il costruttore e dei metodi specifici
(tranne nome e cognome, gli altri campi sono opzionali) costruisce l'oggetto Person.
Creare due oggetti Person e stamparli a video.
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PersonBuilder builder1 = new PersonBuilder("Giovanni", "Giorgio").setAge(28);
        Person person1 = builder1.build();
        PersonBuilder builder2 = new PersonBuilder("Gino", "De Ginis").setAddress("Via del Corso");
        Person person2 = builder2.build();
        System.out.println(person1);
        System.out.println(person2);
    }
}