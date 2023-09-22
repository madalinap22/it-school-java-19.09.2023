public class Main {

    public static void main(String[] args) {
        //a. -5 + 8 * 6
        int x = -5;
        int y = 8;
        int z = 6;

        // Observam ca se respecta ordinea efectuarii operatiei ca la matematica.
        // Mai intai se executa inmultirea si de abia apoi scaderea.
        //
        // Daca adaugat paranteze pentru valorile numerice,
        // se executa mai intai ce este in paranteza si de abia apoi concatenarea cu String-ul.
        System.out.println("Sample data 1: " + (x + y * z));

        x = 55;
        y = 9;

        // Aplicarea de paranteze restrange "scope-ul" operatiilor
        // Prin urmare mai intai este executata operatia de adunare, de abia apoi inmultirea cu rezultatul adunarii;
        System.out.println("Sample data 2: " + ((x + y) % y));

        x = 20;
        y = -3;
        z = 5;
        int m = 8;

        // Ordinea efectuarii operatiei de la stanga la dreapta
        // Prin urmare se efectueaza inmultirea lui 'y' cu 'z' si de abia apoi se executa impartirea la 'm';
        System.out.println("Sample data 3: " + (x + y * z / m));

        x = 5;
        y = 15;
        z = 3;
        m = 2;
        int n = 8;

        // Se aplica regulile de precedenta deja prezentate mai sus.
        System.out.println("Sample data 4: " + (x + y / z * m - n % z));

        // Pentru comentarii multi-line (pe mai multe linii),
        // putem opta pentru modelul de mai jos ca alternativa pentru comentariile cu '//'.

        /** Aici am printat separatoare pentru a avea o mai buna vizibilitate in consola;
         * Prin separatoare ma refer la semnele de egal
         * Pe langa acest detaliu, putem observa si prezenta caracterelor '\n'.
         * Acesta inseamna 'newline' si este echivalentul tastei 'Enter' ca atunci cand scriem un mail.
         *
         * Scrierea unei instructiuni de printline fara nimic intre paranteze va simula printarea unui "\n".
         */
        System.out.println();
        System.out.println("=======\n");

        int a1 = 10;
        int a2 = 15;

        /**
         * La liniile 51 si 52 putem observa ca facem o operatie de adunare intre un String si o valoare de tip int.
         * Orice adunare cu un string a unei valori numerice incearca sa faca conversia intr-o reprezentare string a valorii numerice.
         * Prin urmare daca avem numarul 10, acesta va deveni "10".
         * In cazul insumarii a doua String-uri va rezulta concatenarea celor doua valori.
         * Exemplu: "10" + "1" => "101"
         */
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println();

        int a3 = a1;
        a1 = a2;
        a2 = a3;

        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);

        String str1 = "21";
        System.out.println("21" + 1);

        System.out.println();
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }
}
