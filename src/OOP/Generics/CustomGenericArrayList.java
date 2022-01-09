package OOP.Generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int size =0;

    public CustomGenericArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T number){
        if(isfull()){
            resize();
        }
        data[size++] = number;
    }

    private void resize() {
        Object[] temp= new Object[data.length*2];
//        copy the current item in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }
    public T remove(){
        T remove = (T)data[--size];
        return remove;
    }
    public T get(int index){
        return (T)data[size];
    }
    public int size(){
        return size;
    }
    public void set(int index, T value){
        data[index]=value;
    }



    private boolean isfull() {
        return size==data.length;
    }

    @Override
    public String toString() {
        return "CustomGenericArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenericArrayList list = new CustomGenericArrayList();
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.remove();
        System.out.println(list);
        CustomGenericArrayList<Integer> list2 = new CustomGenericArrayList<>();
        list2.add(45);
        list2.add(68);
        System.out.println(list2);


    }
}
