package ua.lviv.iot.algo.part1.lab5.reader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostalCodeReader {
    public String readText() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your text): ");
            return scanner.nextLine();
        }
    }

    public List<Integer> readRange() {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Integer> range = new ArrayList<>();
            System.out.print("Enter postal code range (two integers separated by space): ");
            range.add(scanner.nextInt());
            range.add(scanner.nextInt());
            scanner.nextLine();
            return range;
        }
    }
}
