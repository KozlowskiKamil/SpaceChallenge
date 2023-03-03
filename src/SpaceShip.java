public interface SpaceShip {
    public boolean launch();
    //launch: a method that returns either true or false indicating if the launch was successful or if the rocket has crashed
    //start: metoda, która zwraca wartość true lub false, wskazując, czy wystrzelenie się powiodło, czy też rakieta się rozbiła
    public boolean land();
    //land: a method that also returns either true or false based on the success of the landing.
    //land: metoda, która również zwraca wartość true lub false w zależności od powodzenia lądowania.
    public boolean canCarry(Item item);
    //canCarry: a method that takes an Item as an argument and returns true if the rocket can carry such item or false if it will exceed the weight limit.
    //canCarry: metoda, która przyjmuje przedmiot jako argument i zwraca true, jeśli rakieta może unieść taki przedmiot lub false, jeśli przekroczy limit wagi.
    public void carry(Item item);
    //carry: a method that also takes an Item object and updates the current weight of the rocket.
    //carry: metoda, która pobiera również obiekt Item i aktualizuje aktualną wagę rakiety.
}
