import java.util.LinkedList;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//1.Write a Java program to iterate through all elements in a array list.

        List<String> strings = new ArrayList<>(); //creare arrayList si adaugare elemente
        strings.add("Biblioteca");
        strings.add("Card");
        strings.add("Carte");
        strings.add("Orar");
        strings.add("Bibliotecar");

        System.out.println("Exercitiu 1_iterare vector: ");
        for (String vect : strings) {
            System.out.println(vect);
        }

        //2.Write a Java program to insert an element into the array list at the first position.

        String elementNou = "Cititor";  //crearea variabila
        strings.add(0, elementNou); //adaugare in vector

        System.out.println("\nExercitiu 2_adaugare element: ");
        for (String vect : strings) {
            System.out.println(vect);
        }
        //3. Write a Java program to sort a given array list.
        Collections.sort(strings);


        System.out.println("\nExercitiu 3_sortare alfabetica:");
        for (String vect : strings) {
            System.out.println(vect);
        }

        //4. Write a Java program to copy one array list into another.

        List<String> copie = new ArrayList<>(strings.size());
        for (int i = 0; i < strings.size(); i++) {     //ca sa nu-mi arunce exceptie. Initializam elementele din vector cu null
            copie.add(null);
        }

        Collections.copy(copie, strings);

        System.out.println("\nExercitiu 4_copie:");
        for (String vect : copie) {
            System.out.println(vect);
        }

        System.out.println("-------------------------Verificare string original vs copie---------------------");
        System.out.println("Array original:");
        for (String vect : strings) {
            System.out.println(vect);
        }
        String elementNou2 = "Imprumut carti";
        strings.add(0, elementNou2);
        System.out.println("Array original dupa adaugarea unui nou element:");
        for (String vect : strings) {
            System.out.println(vect);
        }
        System.out.println("Array copie:");
        for (String vect : copie) {
            System.out.println(vect);
        }

        //5.Write a Java program of swap two elements in an array list.
        Collections.swap(strings, 0, 1);

        System.out.println("\nExercitiu 5_swap:");
        for (String vect : strings) {
            System.out.println(vect);
        }

        //6.Write a Java program to trim the capacity of an array list the current list size.
        ((ArrayList<String>) strings).trimToSize(); //cand un ArrayList este creat are o capacitate de 10 elemente by default. Pe masura ce adaugam elemente si aceasta capacitate se mareste cu inca 10 elemente. trimToSize reduce spatiul alocat

        System.out.println("\nExercitiu 6_trim:");
        for (String vect : strings) {
            System.out.println(vect);
        }

        //7.Write a Java program to empty an array list.
        copie.clear();
        System.out.println("\nExercitiu 7_clear:");
        for (String vect : copie) {
            System.out.println(vect);
        }

        //8.Write a Java program to iterate through all elements in a linked list starting at the specified position.

        LinkedList<String> copieLinked = new LinkedList<>(strings); //creare o noua copie
        int startPosition = 3;

        ListIterator<String> numarator = copieLinked.listIterator(startPosition); //creare un numarator

        System.out.println("\nArray original:");
        for (String vect : strings) {
            System.out.println(vect);
        }
        System.out.println("\nExercitiu 8_LinkedList pleaca de la pozitia " + startPosition);
        while (numarator.hasNext()) {  //true if the list iterator has more elements when traversing the list in the forward direction
            System.out.println(numarator.next());
        }

        //9. Write a Java program to iterate a linked list in reverse order.
        LinkedList<String> copieLinked2 = new LinkedList<>(strings);
        ListIterator<String> numarator2 = copieLinked2.listIterator(copieLinked2.size());
        System.out.println("\nExercitiu 9_reverse order:");
        while (numarator2.hasPrevious()) {
            System.out.println(numarator2.previous());
        }

        //10. Write a Java program to insert some elements at the specified position into a linked list.
        LinkedList<String> copieLinked3 = new LinkedList<>(strings);
        String elementNou1 = "Bibliografie";
        String elementNou3 = "Referinta";
        int pozitieInserare = 2;

        copieLinked3.add(pozitieInserare, elementNou1);
        copieLinked3.add(++pozitieInserare, elementNou3);
        System.out.println("\nVector original:");
        for (String vect : strings) {
            System.out.println(vect);
        }
        System.out.println("\nExercitiu 10_elemente noi:");
        for (String vect : copieLinked3) {
            System.out.println(vect);
        }

        //11.Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        copieLinked3.add("Referinta");
        String elementCautat = "Referinta";

        int primulElement = copieLinked3.indexOf(elementCautat);
        int ultimulElement = copieLinked3.lastIndexOf(elementCautat);


        System.out.println("\nExercitiu 11_pozitie element:");
        System.out.println("Array original:");
        for (String vect : copieLinked3) {
            System.out.println(vect);
        }
        System.out.println("First occurrence of '" + elementCautat + "': " + primulElement);
        System.out.println("Last occurrence of '" + elementCautat + "': " + ultimulElement);

        //12.Write a Java program to join two linked lists.
        System.out.println("\nExercitiu 12_join:");

        LinkedList<String> copieLinked4 = new LinkedList<>(strings);
        copieLinked4.add("Ziar");

        System.out.println("Elemente CopieLinked 4:");
        for (String vect : copieLinked4) {
            System.out.println(vect);
        }
        System.out.println("\nElemente CopieLinked 1:");
        for (String vect : copieLinked) {
            System.out.println(vect);
        }
        copieLinked.addAll(copieLinked4);

        System.out.println("\nArray join:");
        for (String vect : copieLinked4) {
            System.out.println(vect);
        }

        //13. Write a Java program to clone an linked list to another linked list.
        LinkedList<String> listaOriginala1 = new LinkedList<>();
        listaOriginala1.add("Revista");
        listaOriginala1.add("Ziar");
        listaOriginala1.add("Carte");

        LinkedList<String> clona = (LinkedList<String>) listaOriginala1.clone();
        System.out.println("\nExercitiu 13_clone:");
        System.out.println("Original:");
        for (String vect : listaOriginala1) {
            System.out.println(vect);
        }
        System.out.println("\nClona:");
        for (String vect : clona) {
            System.out.println(vect);
        }

        //14.Write a Java program to remove and return the first element of a linked list.
        System.out.println("\nExercitiu 14:");
        String primulElement1 = clona.removeFirst();
        System.out.println("Element sters: " + primulElement1);

        System.out.println("Array dupa stergere:");
        for (String vect : clona) {
            System.out.println(vect);
        }

        //15. Write a Java program to retrieve but does not remove, the first element of a linked list.
        System.out.println("\nExercitiu 15:");
        System.out.println("Primul element din Array clona: "+ clona.getFirst());

        //16. Write a Java program to iterate through all elements in a hash list.
        Set<Integer> set1 = new HashSet<>();          //Nu pot contine duplicate si elementele nu sunt ordonate
        set1.add(2);
        set1.add(7);
        set1.add(9);
        set1.add(2);
        System.out.println("\nExercitiul 16_hash set:");
        for (Integer intg : set1) {
            System.out.println(intg);
        }

        //17. Write a Java program to test a hash set is empty or not.
        System.out.println("\nExercitiul 17_hash set empty:");
        if (set1.isEmpty()) {
            System.out.println("Setul1 este gol.");
        } else {
            System.out.println("Setul1 nu este gol.");
        }

        //18.Write a Java program to convert a hash set to an array.
        Integer[] vector = set1.toArray(new Integer[0]);
        System.out.println("\nExercitiul 18_hash set to array:");
        System.out.println("Array elements:");
        for (Integer intg : vector) {
            System.out.println(intg);
        }

        //19. Write a Java program to convert a hash set to a List/ArrayList.
        List<Integer> lista1 = new ArrayList<>(set1);
        System.out.println("\nExercitiul 19_hash set to arrayList:");
        System.out.println("Elemente ArrayList: " + lista1);

        //20. Write a Java program to compare two sets and retain elements which are same on both sets.
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(100);
        set2.add(222);
        set2.add(99);

        System.out.println("\nExercitiul 20_elemente comune:");
        System.out.println("Elemente Set1: " + set1);
        System.out.println("Elemente Set2: " + set2);
        set1.retainAll(set2);
        System.out.println("Elemente comune: " + set1);



    }
}
