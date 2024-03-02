package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    DB databaze = DB.getInstance();
        String[] firstNames = {
                "Adam",
                "Anna",
                "Barbora",
                "David",
                "Denisa",
                "Eva",
                "Filip",
                "Gabriela",
                "Hana",
                "Jakub",
                "Jana",
                "Jan",
                "Jaroslav",
                "Jiri",
                "Karel",
                "Katerina",
                "Kristyna",
                "Lucie",
                "Marie",
                "Martin",
                "Michaela",
                "Milan",
                "Natalie",
                "Nikola",
                "Ondrej",
                "Pavel",
                "Petr",
                "Petra",
                "Renata",
                "Radek",
                "Roman",
                "Tereza",
                "Tomas",
                "Veronika",
                "Vaclav",
                "Zdenek",
                "Zuzana",
                "Adam",
                "Aneta",
                "Bohuslav",
                "Bozena",
                "Dana",
                "Daniel",
                "Elena",
                "Frantisek",
                "Irena",
                "Josef",
                "Karolina",
                "Lea"
        };

        String[] lastNames = {
                "Novak",
                "Svoboda",
                "Novotny",
                "Dvorak",
                "Cerny",
                "Prochazka",
                "Kucera",
                "Vesely",
                "Horak",
                "Nemec",
                "Pospisil",
                "Marek",
                "Hajek",
                "Kral",
                "Pokorny",
                "Ruzicka",
                "Benes",
                "Fiala",
                "Sedlacek",
                "Kriz",
                "Bartu",
                "Jelinek",
                "Mach",
                "Simek",
                "Sobotka",
                "Pavlik",
                "Urban",
                "Cech",
                "Dolezal",
                "Pribyl",
                "Havel",
                "Moravec",
                "Tomasek",
                "Liska",
                "Kolar",
                "Hruska",
                "Vlcek",
                "Sevcik",
                "Novy",
                "Duda",
                "Krejci",
                "Richter",
                "Barta",
                "Ondracek",
                "Muller",
                "Holan",
                "Nahlik",
                "Blaha",
                "Vesela",
                "Kadlec"
        };





        try {
        databaze.dbInit("jdbc:mysql://localhost/DBS?user=java_conn&password=1234");

        for (int i = 0; i < 50; i++) {
            databaze.createUser(firstNames[(int) (Math.random() * firstNames.length)], lastNames[(int) (Math.random() * firstNames.length)]);
        }


        databaze.getUsers();


    } catch (Exception e) {
        System.out.println(e);
    }

    }
}