import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int passengerCount(){
        return this.passengers.size();
    }

    public String getDestination(){
        return this.destination;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void addPassenger(Person person){
        if (this.capacity > passengerCount()) {
            this.passengers.add(person);
        }
    }

    public void removePassenger(Person person) {
        if (passengerCount() > 0) {
            this.passengers.remove(person);
        }
    }

    public void pickUp(BusStop busStop) {
        Person personFromQueue = busStop.removePerson();
        addPassenger(personFromQueue);
    }
}
