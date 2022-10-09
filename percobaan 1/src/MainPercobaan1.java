public class MainPercobaan1 {
    public static void main(String[] args) {
        processor p = new processor("Intel i5", 3);
        Laptop L = new Laptop("Thinkpad", new processor("Intel i5", 3));

        L.info();

        processor p1 = new processor();
        p1.setMerk("Intel i5");
        p1.setCahce(4);
        Laptop L1 = new Laptop();
        L1.setMerk("Thinkpad");
        L1.setProc(p1);
        L1.info();
    }
}