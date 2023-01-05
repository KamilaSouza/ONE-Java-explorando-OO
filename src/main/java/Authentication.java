public abstract interface Authentication  {

    public abstract void setPassword(int password);

    public abstract boolean authenticate(int password);

    // abstract class with abstract methods
    // who sign this interface needs to implement all methods

}
