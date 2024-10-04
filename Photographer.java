import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long d = sc.nextLong(); 
        long a = sc.nextLong(); 
        long b = sc.nextLong();

        List<Client> clients = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            long xi = sc.nextLong();
            long yi = sc.nextLong(); 
            long totalSize = xi * a + yi * b;
            clients.add(new Client(i + 1, totalSize)); 
        }

        clients.sort(Comparator.comparingLong(client -> client.size));

        List<Integer> servedClients = new ArrayList<>();
        long usedMemory = 0;

        for (Client client : clients) {
            if (usedMemory + client.size <= d) {
                usedMemory += client.size;
                servedClients.add(client.index);
            } else {
                break; 
            }
        }

        System.out.println(servedClients.size());
        for (int index : servedClients) {
            System.out.print(index + " ");
        }
    }

    static class Client {
        int index; 
        long size; 

        Client(int index, long size) {
            this.index = index;
            this.size = size;
        }
    }
}
