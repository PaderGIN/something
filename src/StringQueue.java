public class StringQueue {
    protected final static int DEFSIZE = 16;
    public char[] array;
    protected int size, head, tail;

    public StringQueue(int capacity) {
        array = new char[capacity];
        clear();
    }

    public StringQueue() {
        this(DEFSIZE);
    }

    //Пуста ли очередь?
    public boolean isEmpty() {
        return size == 0;
    }

    //Сделать очередь пустой.
    public void clear() {
        size = head = 0;
        tail = array.length - 1;
    }

    //Вернуть индекс следующего за данным элемента.
    private int forward(int index) {
        return ++index < array.length ? index : 0;
    }

    //Добавить число в очередь (в конец).
    public void push(char val) throws Exception {
        if (++size > array.length)
            throw new Exception();

        array[tail = forward(tail)] = val;
    }

    //Удалить число из начала очереди.
    public char pop() throws Exception {
        char val = front();
        head = forward(head);
        size -= 1;
        return val;
    }

    //Получить начало очереди (не удаляя его).
    public char front() throws Exception {
        if (isEmpty())
            throw new Exception();

        return array[head];
    }
}