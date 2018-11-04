public class President {

    //Det eneste objekt som bliver lavet ud fra denne klasse
    private static final President presidentObject = new President();

    private String name = "Trump";

    //Constructoren er sat som private for at sikre at der ikke kan laves en instans af President-klassen
    private President(){}

    //Nedenstående metode kaldes hvis man ønsker at arbejde med det ene President objekt som findes
    public static President getPresidentInstance(){
        return presidentObject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(name + " is now the new president.");
    }

    @Override
    public String toString() {
        return "Current president: " + name;
    }
}
