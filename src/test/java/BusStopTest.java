import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("The Royal Mile");
        person = new Person();
    }

    @Test
    public void queueStartsEmpty(){
        assertEquals(0, busStop.queueLength());
    }

    @Test
    public void hasName(){
        assertEquals("The Royal Mile", busStop.getName());
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addPerson(person);
        assertEquals(1, busStop.queueLength());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busStop.addPerson(person);
        busStop.removePerson();
        assertEquals(0, busStop.queueLength());
    }

    }
