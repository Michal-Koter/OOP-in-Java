package pl.edu.pjatk.Lotto;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        while (numbers.size()<6){
            System.out.printf("Enter %d number: ", numbers.size()+1);
            int number = getNum(scanner);
            if (number>0 && number<50){
                numbers.add(number);
            }
        }
        Set<Integer> lottery = runLottery();
        int result = getResult(numbers, lottery);
        System.out.printf("User's numbers :%s\n", numbers);
        System.out.printf("Lottery numbers :%s\n", lottery);
        System.out.printf("Hits : %d/6\n", result);
    }

    public static int getNum(Scanner scanner){
        String text = scanner.nextLine();
        try{
            return Integer.parseInt(text);
        } catch (NumberFormatException e){
            System.out.println("Entered incorrect number!");
            return getNum(scanner);
        }
    }

    private static Set<Integer> runLottery(){
        Random random = new Random();
        Set<Integer> numbers = new TreeSet<>();
        while (numbers.size()<6){
            numbers.add(random.nextInt(48)+1);
        }
        return numbers;
    }

    private static int getResult(Set<Integer> userNumbers, Set<Integer> lotteryNumbers){
        int hits = 0;
        for (Integer lotteryNumber:lotteryNumbers){
            if (userNumbers.contains(lotteryNumber)){
                hits++;
            }
        }
        return hits;
    }
}
