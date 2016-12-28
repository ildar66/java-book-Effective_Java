package chapter_10.item_54;

//Nonserializable stateful class allowing serializable subclass
public abstract class AbstractFoo {

    private int x, y; // The state
    private boolean initialized = false;

    public AbstractFoo(int x, int y) {
        initialize(x, y);
    }

    /**
     * This constructor and the following method allow subclass's
     * readObject method to initialize our internal state.
     */
    protected AbstractFoo() {
    }

    protected final void initialize(int x, int y) {
        if (initialized)
            throw new IllegalStateException("Already initialized");
        this.x = x;
        this.y = y;
        // ... // Do anything else the original constructor did
        initialized = true;
    }

    /**
     * These methods provide access to internal state so it can
     * be manually serialized by subclass's writeObject method.
     */
    protected final int getX() {
        return x;
    }

    protected final int getY() {
        return y;
    }

    // Must be called by all public instance methods
    private void checkInit() throws IllegalStateException {
        if (!initialized)
            throw new IllegalStateException("Uninitialized");
    }

    // ... // Remainder omitted
}
