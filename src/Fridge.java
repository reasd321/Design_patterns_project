public class Fridge implements Electronics{
    private int length;
    private int width;
    private String manufacturer;

    private Fridge(int length,int width){
        this.length=length;
        this.width=width;
    }

    public String toString(){
        return "Width of the fridge: " + width + "\n"
                +"Length of the fridge: " + length + "\n"
                +"Manufacturer of the fridge " + manufacturer + "\n";
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

        public Fridge build(){
            Fridge toReturn = new Fridge(this.length,this.width);
            toReturn.length=this.length;
            toReturn.width=this.width;
            toReturn.manufacturer=manufacturer;

            return toReturn;
        }
    }

}
