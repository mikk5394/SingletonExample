public class Main {

    public static void main(String[] args) {

        System.out.println(President.getPresidentInstance());

        President.getPresidentInstance().setName("Barack Obama");

        System.out.println(President.getPresidentInstance());

        //Nedenstående stykke kode kan ikke lade sig gøre da constructoren i President er sat som private
        //President pres = new President();

    }
}
