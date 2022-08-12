import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Person {
    private String name;
    private String lastName;
    private int ticketCnt;
    private int round;
    private boolean male;

    public Person (String name, String lastName, int ticketCnt, boolean male) {
        this.name = name;
        this.lastName = lastName;
        this.ticketCnt = ticketCnt;
        this.male = male;

    }


    @Override
    public String toString() {
        String gender = male ? "прокатился на аттракционе" : "прокатилась на аттракционе";
        return name + " " + lastName + " " + gender +
                 " " + round + "-й раз" ;
    }

    public void rideOnAttraction () {
        ticketCnt--;
        round++;
        System.out.println(toString());
    }
    public int getTicketCnt (){
        return ticketCnt;
    }
}
