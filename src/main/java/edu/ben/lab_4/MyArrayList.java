package edu.ben.lab_4;

import edu.ben.lab_3.MyList;

import java.lang.reflect.Array;


public class MyArrayList<T> implements MyList<T> {

    T[] ItemsInList;

    public MyArrayList(Class<T> clazz) {


        this.ItemsInList = (T[]) Array.newInstance(clazz, 10);
    }



    @Override
    public void add(T value) {

// if there is a value in the array, loop through it then when the value is equal to null set that value equal to value

            for (int i = 0; i < ItemsInList.length; i++) {
              if(this.ItemsInList[i]==null) {
                  this.ItemsInList[i] = value;
                  return;
              }
            }
        }



    // loop through the values, set each value equal to null
    @Override
    public void clear() {
        for (int i = 0; i < ItemsInList.length; i++) {
            this.ItemsInList[i] = null;
        }
    }


    //loop through values, return i
    @Override
    public int size() {
        for (int i = 0; i < ItemsInList.length; i++) {
            if (this.ItemsInList[i] == null) {
                return i;
            }
        }
        return ItemsInList.length;
    }

    //loop through values, set index 0 equal to previous and current, when current equals null set previous to null
    @Override
    public T remove() {
        if (ItemsInList[0] == null) {
            return null;
        }


        for (int i = 0; i < ItemsInList.length; i++) {
            if (ItemsInList[i] == null) {
                T result = ItemsInList[i-1];
                ItemsInList[i-1] = null;
                return result;
            }
        }
        T result = ItemsInList[ItemsInList.length-1];
        ItemsInList[ItemsInList.length-1] = null;
        return result;    }

}

