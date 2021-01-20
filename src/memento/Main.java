package memento;

import memento.origin.Memento;
import memento.origin.Originator;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Memento> mementos = new Stack<>();
        Originator originator = new Originator();
        originator.setState("state 1");
        mementos.push(originator.getInstance());
        originator.setState("state 2");
        mementos.push(originator.getInstance());
        originator.setState("state 3");
        mementos.push(originator.getInstance());
        originator.setState("state Final");
        mementos.push(originator.getInstance());

        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState());
        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState());
        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState());
        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState());
    }

}
