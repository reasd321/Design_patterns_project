public class GasCooker implements Electronics{
    private int length;
    private int width;
    private String manufacturer;

    private GasCooker(int length,int width){
        this.length=length;
        this.width=width;
    }

    public String toString(){
        return "Width of the gas cooker: " + width + "\n"
                +"Length of the gas cooker: " + length + "\n"
                +"Manufacturer of the gas cooker: " + manufacturer + "\n";
    }

    @Override
    public void setLength(int length) {
        this.length=length;
    }

    @Override
    public void setWidth(int width) {
        this.width=width;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public static class Builder{
        private int length;
        private int width;
        private String manufacturer;

        public Builder(String manufacturer){
            this.manufacturer=manufacturer;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public GasCooker build(){
            GasCooker toReturn = new GasCooker(this.length,this.width);
            toReturn.length=this.length;
            toReturn.width=this.width;
            toReturn.manufacturer=manufacturer;

            return toReturn;
        }
    }

}
