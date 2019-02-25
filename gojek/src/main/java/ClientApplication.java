import model.ProdDictionary;

public class ClientApplication {

    public static void main(String[] args) {
        ProdDictionary prodDictionary = new ProdDictionary();
        prodDictionary.set(1,"SONY TV");
        prodDictionary.set(2,"Apple iphone");

        String name = prodDictionary.get(1);
        System.out.println(name);

        prodDictionary.set(1,"Sony TV Bravia");

        name = prodDictionary.get(1);
        System.out.println(name);
    }
}
