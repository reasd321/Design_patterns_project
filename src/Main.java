public class Main {
    public static void main(String[] args) {
        Iron.Builder iron = new Iron.Builder("Apple");
        iron.setLength(23);
        iron.setWidth(1);

        Iron myiron = iron.build();
        System.out.println(myiron);

        Fridge.Builder fridge = new Fridge.Builder("BMW");
        fridge.setLength(4);
        fridge.setWidth(2);

        Fridge myfridge= fridge.build();
        System.out.println(myfridge);

        GasCooker.Builder cooker = new GasCooker.Builder("Audi");
        cooker.setLength(6);
        cooker.setWidth(34);

        GasCooker mycooker= cooker.build();
        System.out.println(mycooker);

        ManufacturerFactory Factory= new ManufacturerFactory();
        Manufacturer apolo = Factory.getManufacturer("ironmanufacturer");
        Manufacturer hades = Factory.getManufacturer("gascookermanufacturer");

        System.out.println(apolo.printType());

        ElectronicsFactory Factory2 = new ElectronicsFactory();
        Electronics generated = Factory2.generateElectronics("IRON");
        generated.setLength(10);
        System.out.println(generated);
    }
}
