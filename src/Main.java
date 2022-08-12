import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deque<Person> queue = new ArrayDeque<>(generateClients());
        while (!queue.isEmpty()) {
            Person client = queue.getFirst();
            client.rideOnAttraction();
            if (client.getTicketCnt() > 0 ) {
                queue.offerLast(client);
            }
            queue.pollFirst();

        }

    }

    static List<Person> generateClients() {
        List<Person> clients = new ArrayList<>();
        clients.add(new Person("Вася", " Морозов", 5, true));
        clients.add(new Person("Катя", "Лосева", 3, false));
        clients.add(new Person("Марина", "Зернова", 10, false));
        clients.add(new Person("Паша", "Калякин", 7, true));
        clients.add (new Person("Миша","Попов", 2, true));
        return clients;

    }
}

