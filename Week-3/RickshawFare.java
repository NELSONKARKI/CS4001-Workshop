import java.util.Scanner;

class RickshawFare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();
        System.out.print("Enter time (minutes): ");
        int time = sc.nextInt();
        System.out.print("Is customer local? (yes/no): ");
        boolean isLocal = sc.next().equalsIgnoreCase("yes");
        System.out.print("Is it night-time? (yes/no): ");
        boolean isNight = sc.next().equalsIgnoreCase("yes");
        double base = 40;       // Updated base fare
        double perKm = 18;      // Updated per km rate
        double perMin = 1.5;    // Updated per minute rate
        double fare = base + (distance * perKm) + (time * perMin);
        // Apply updated discount and surcharge
        fare *= (isLocal && distance > 5) ? 0.85 : 1.0;   // 15% discount
        fare *= isNight ? 1.25 : 1.0;                    // 25% night charge
        System.out.println("Final Fare: Rs. " + (int) fare);
    }
}
