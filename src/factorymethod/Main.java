package factorymethod;

import factorymethod.concrete.HpCreator;
import factorymethod.framework.Item;
import factorymethod.framework.ItemCreator;

public class Main {
    public static void main(String[] args) {
        ItemCreator creator = new HpCreator();
        Item item = creator.create();
        item.use();
    }
}
