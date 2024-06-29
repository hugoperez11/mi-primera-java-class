package dev.hugo;


public final class App {
    private App() {
    }

    
    public static void main(String[] args) {
        Person pepe = new Person("Pepe", "Garcia", "252525", 1980, "Spain", "M");
        Person juan = new Person("Juan", "Smith", "6265858", 1991, "Germany", "M" );

        pepe.print();
        juan.print();
    }
}
