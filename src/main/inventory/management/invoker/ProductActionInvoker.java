package main.inventory.management.invoker;

import main.inventory.management.action.Action;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the "ProductActionInvoker" which is the COMMAND INVOKER for the COMMAND - "Action".
 */
public class ProductActionInvoker {
    List<Action> actions = new ArrayList<>();

    /**
     * To add the relevant action to the list.
     * @param action the instance of action class
     */
    public void addAction(Action action) {
        actions.add(action);
    }

    /**
     * To perform the "execute" method of all the action instances.
     */
    public void executeAllActions() {
        for (Action productAction: actions) {
            productAction.execute();
        }
        actions.clear();
    }
}
