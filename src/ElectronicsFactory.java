public class ElectronicsFactory {
    public Electronics generateElectronics(String type){
        if(type==null)
            return null;
        if(type.equalsIgnoreCase("IRON"))
            return new Iron.Builder("apolo").build();
        return null;
    }
}
