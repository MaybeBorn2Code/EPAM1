
import OurAquarium.Aquarium;
import OurAquarium.Fish;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Fish guppy = new Fish(" Guppy ", " black ", " bread ", 400);
        Fish poecilia = new Fish("Poecilia ", " orange ", " bread ", 500);
        Aquarium aquarium = new Aquarium();

        Scanner scanner = new Scanner(System.in);

            System.out.println("Press 1 to add fish(guppy) to aquarium");
            System.out.println("Press 2 to add fish(poecilia) to aquarium");
            System.out.println("Press 3 to feed guppy and poecilia");
            System.out.println("Press 4 to remove fish guppy");
            System.out.println("Press 5 to remove fish poecilia");
            System.out.println("Press 6 to count fishes");
            while(true) {
                String inputText = scanner.nextLine();
                switch (inputText) {
                    case "1":
                        aquarium.addFish(guppy);
                        System.out.println("One fish added to aquarium");
                        break;
                    case "2":
                        aquarium.addFish(poecilia);
                        System.out.println("Another fish added to aquarium");
                        break;
                    case "3":
                        aquarium.feedTheFish(guppy);
                        aquarium.feedTheFish(poecilia);
                        break;
                    case "4":
                        aquarium.removeFish(guppy);
                        break;
                    case "5":
                        aquarium.removeFish(poecilia);
                        break;
                    case "6":
                        aquarium.printAll();
                }
            }
        }
    }


