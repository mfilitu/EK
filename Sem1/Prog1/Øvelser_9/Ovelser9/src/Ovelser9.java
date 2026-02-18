import java.util.Random;

public class Ovelser9 {
    public static void main(String[] args) {

        //Opgave 1
        String[] songs = new String[10];

        songs[0] = "song1";
        songs[1] = "song2";
        songs[2] = "song3";
        songs[3] = "song4";
        songs[4] = "song5";
        songs[5] = "song6";
        songs[6] = "song7";
        songs[7] = "song8";
        songs[8] = "song9";
        songs[9] = "song10";
        //myPlaylist(songs);

        //Opgave 2
        //String[] arr = {"1", "2", "3", "4", "5"};
        //copyArray(arr);

        //printArray(copyArray(arr));

        //Opgave 3
        //cinemaSeating();

        //Opgave 4
        removeDuplicates();

    }

    public static void removeDuplicates() {
        String[] songs = {"Blinding Lights", "Levitating", "Peaches", "Save Your Tears",
                "Blinding Lights", "Kiss Me More", "Levitating", "Montero",
                "Peaches", "Stolt", "Stolt", "Blinding Lights", "Smells Like Teen Spirit", "Levitating", "Kiss Me More"};
        String[] uniqueSongs = new String[songs.length];

        int count = 0;
        for(int i = 0; i< songs.length; i++){
            boolean alreadyExists = false;
            for (int j = 0; j < count; j++) {
                if (songs[i].equals(uniqueSongs[j])) {
                    alreadyExists = true;
                    break;
                }
            }
            if (!alreadyExists) {
                uniqueSongs[count] = songs[i];
                count++;
            }
        }
        System.out.println("Before: ");
        printArray(songs);
        System.out.println("After: ");
        printArray(uniqueSongs);

    }


    public static void cinemaSeating() {
        int[] seats = {
                120, 120, 120, 120, 120, 120, 120, 120, 120, //række 1
                120, 120, 120, 120, 120, 120, 120, 120, 120, //række 2
                100, 100, 100, 100, 100, 100, 100, 100, 100, //række 3
                80, 80, 80, 80, 80, 80, 80, 80, 80, //række 4
                80, 80, 80, 80, 80, 80, 80, 80, 80 //række 5
        };
        printSeats(seats);
        buySeat(1, 1, seats);
        buySeat(1, 4, seats);
        buySeat(2, 4, seats);
        buySeat(3, 4, seats);
        buySeat(4, 4, seats);
        buySeat(9, 4, seats);
        buySeat(9, 4, seats);
        buySeat(9, 4, seats);
        printSeats(seats);

    }

    public static void printSeats(int[] seats) {
        System.out.print("\n--- Lærred ---");
        for (int i = 0; i < seats.length; i++) {

            if (i % 9 == 0) {
                System.out.println();
            }
            if (seats[i] == 0) {
                System.out.print("X ");
            } else {
                System.out.print("O ");
            }
        }
    }

    public static void buySeat(int seat, int row, int[] arr) {
        int theSeat = seat - 1 + ((row - 1) * 9);
        if (arr[theSeat] == 0) {
            System.out.println("\nThis seat is occupied");
        } else {
            arr[theSeat] = 0;
            System.out.printf("\nYou have purchased seat: %s in row: %s\n", seat, row);
        }
    }

    public static String[] copyArray(String[] arr) {
        String[] newArray = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }


        return newArray;

    }

    public static void myPlaylist(String[] songs) {


        for (String song : songs) {
            System.out.println(song);
        }

        for (int i = songs.length - 1; i >= 0; i--) {
            System.out.println("Spiller sang: " + songs[i]);
        }
    }

    public static void printArray(String[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }

    }
}