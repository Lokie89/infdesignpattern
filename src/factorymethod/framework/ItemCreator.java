package factorymethod.framework;

public abstract class ItemCreator {

    public Item create() {
        requestItemInfo();
        Item item = createItem();
        createItemLog();
        return item;
    }

    protected abstract void requestItemInfo();

    protected abstract void createItemLog();

    protected abstract Item createItem();
}
