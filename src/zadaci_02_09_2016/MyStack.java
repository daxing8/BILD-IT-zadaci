package zadaci_02_09_2016;

import java.util.ArrayList;

public class MyStack implements Cloneable{

	private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override /** Override the toString in the Object class */
    public String toString() {
        return "stack: " + list.toString();
    }

    @Override
    protected Object clone()  {
        MyStack myStack = null;
        try {
            myStack = (MyStack) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        myStack.list = new ArrayList<>(list);
        return myStack;
    }
}
