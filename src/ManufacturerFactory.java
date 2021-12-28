public class ManufacturerFactory {
    public Manufacturer getManufacturer(String manufacturerType){
        if(manufacturerType == null)
            return null;
        if(manufacturerType.equalsIgnoreCase("IRONMANUFACTURER"))
            return new Manufacturers.IronManufacturer();
        else if(manufacturerType.equalsIgnoreCase("FRIDGEMANUFACTURER"))
            return new Manufacturers.FridgeManufacturer();
        else if(manufacturerType.equalsIgnoreCase("GASCOOKERMANUFACTURER"))
            return new Manufacturers.GasCookerManufacturer();
        return null;
    }
}
