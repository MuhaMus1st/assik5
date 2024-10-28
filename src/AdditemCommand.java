public interface Command {
    void execute();
}

public class AddItemCommand implements Command {
    private InventoryManager manager;
    private Item item;

    public AddItemCommand(InventoryManager manager, Item item) {
        this.manager = manager;
        this.item = item;
    }

    public void execute() {
        manager.addItem(item);
    }
}
