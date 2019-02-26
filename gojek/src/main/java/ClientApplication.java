import model.ProdDictionary;

public class ClientApplication {

    public static void main(String[] args) throws Exception {
        ProdDictionary prodDictionary = new ProdDictionary(10);
        prodDictionary.set(1,"Sony TV");
        prodDictionary.set(2,"Apple iphone");

        String name = prodDictionary.get(1);
        System.out.println(name);

        prodDictionary.set(1,"Sony TV Bravia");

        name = prodDictionary.get(1);
        System.out.println(name);
    }
}
