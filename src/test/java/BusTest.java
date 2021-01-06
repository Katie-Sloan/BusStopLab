import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("Edinburgh Castle", 5);
        person = new Person();
        busStop = new BusStop("The Royal Mile");
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test public void busHasDestination(){
        assertEquals("Edinburgh Castle", bus.getDestination());
    }

    @Test public void busHasCapacity(){
        assertEquals(5, bus.getCapacity());
    }

    @Test public void canAddPassengerToBus(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test public void cannotAddPassengerToBus(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(5, bus.passengerCount());
    }

    @Test public void canRemovePassengerFromBus(){
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canPickUpPassengerFromBusStop(){
        busStop.addPerson(person);
        bus.pickUp(busStop);
        assertEquals(1, bus.passengerCount());
    }

}
