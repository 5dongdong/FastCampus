package ch06;

public class ThreeDPrinterTest {

    public static void main(String[] args) {

        Powder powder = new Powder();
        ThreeDprinter3 printer = new ThreeDprinter3();

        printer.setMaterial(powder);

        Powder p = (Powder)printer.getmaterial();
    }

}
