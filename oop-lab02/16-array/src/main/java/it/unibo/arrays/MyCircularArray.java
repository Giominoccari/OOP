package it.unibo.arrays;

class MyCircularArray {

    int size;
    int ptr;
    int[] array;

    MyCircularArray(int size) {
        this.ptr = 0;
        this.size = size;
        this.array = new int[this.size];
    }

    MyCircularArray() {
        this(10);
    }

    void add(final int elem) {
        if(this.ptr == this.size - 1){
            array[this.ptr] = elem;
            this.ptr = 0;
            return;
        }
        array[this.ptr] = elem;
        this.ptr++;
    }

    void reset() {
        for (int i = 0; i < this.array.length; i++){
            this.array[i] = 0;
        }
        this.ptr = 0;
    }

    void printArray() {
        System.out.print("[");
        for (int i = 0; i < this.array.length - 1; i++) {
            System.out.print(this.array[i] + ",");
        }
        System.out.print(this.array[this.array.length - 1] + "]");
    }

    public static void main(final String[] args) {

        // 1) Creare un array circolare di dieci elementi

        // 2) Aggiungere gli elementi da 1 a 10 e stampare il contenuto
        // dell'array circolare

        // 3) Aggiungere gli elementi da 11 a 15 e stampare il contenuto
        // dell'array circolare

        // 4) Invocare il metodo reset

        // 5) Stampare il contenuto dell'array circolare

        // 6) Aggiungere altri elementi a piacere e stampare il contenuto
        // dell'array circolare
        MyCircularArray array = new MyCircularArray();
        for(int i = 1; i <= array.size; i++){
            array.add(i);
        }
        array.printArray();
        for(int i = 11; i <= 15; i++){
            array.add(i);
        }
        array.printArray();
        array.reset();
        array.printArray();
        for(int i = 20; i <= 30; i++){
            array.add(i);
        }
        array.printArray();
    }
}
