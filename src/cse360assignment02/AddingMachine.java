package cse360assignment02;

import java.util.ArrayList;

public class AddingMachine {
    private int total;
    private ArrayList<String> history = new ArrayList<>(); //ArrayList to store the "history"

    public AddingMachine () {
        total = 0;  // not needed - included for clarity
        history.add("0"); //Inital 0 value
    }

    public int getTotal () {
        return total;
    }

    //Adds to the total
    public void add (int value) {
        total = total + value;
        history.add(" + " + value);
    }

    //Subtracts from the total
    public void subtract (int value) {
        total = total - value;
        history.add(" - " + value);
    }

    //Prints out the ArrayList/Result
    public String toString () {
        return String.join("",history);
    }

    //Clears the memory
    public void clear() {
        total = 0;
        history.clear();
    }

    //Main method to test
    public static void main(String[] args)
    {
        AddingMachine result = new AddingMachine();
        result.add(4);
        result.subtract(2);
        result.add(5);
        System.out.println(result.toString());
    }
}
