public class Manufacturers{
    public static class IronManufacturer implements Manufacturer{
        @Override
        public String printType() {
            return "This manufacturer is a: " + this.getClass().getSimpleName() +"\n";
        }
    }

    public static class FridgeManufacturer implements Manufacturer{
        @Override
        public String printType() {
            return "This manufacturer is a: " + this.getClass().getSimpleName() +"\n";
        }
    }

    public static class GasCookerManufacturer implements Manufacturer{
        @Override
        public String printType() {
            return "This manufacturer is a: " + this.getClass().getSimpleName() +"\n";
        }
    }
}
