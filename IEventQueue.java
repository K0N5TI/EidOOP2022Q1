
// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

public interface IEventQueue <E> {
    void enqueue(java.lang.Double aDouble, E e);

    IEventQueue.Entry<E> dequeue();

    static interface Entry <E> {
        java.lang.Double getTime();

        E getEvent();
    }
}