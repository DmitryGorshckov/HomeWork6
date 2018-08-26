import ru.gorshckov.Driver;
import ru.gorshckov.Lorry;
import ru.gorshckov.Passenger;

public class Main {

    public static void main(String[] args) {
       Lorry lr = new Lorry ();
       lr.addDieselFuel(100);
       Driver petr = new Driver();
       petr.sayName("Петр");
       lr.Start(1,2);
        Passenger ps = new Passenger();
        ps.sayName("вася");
        ps.sayAge(12);
    }
}
