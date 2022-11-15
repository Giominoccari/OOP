package it.unibo.collections;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;

/**
 * Example class using {@link List} and {@link Map}.
 *
 */
public final class UseListsAndMaps {
    private static final int START = 1000;
    private static final int STOP = 2000;
    private UseListsAndMaps() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
        List<Integer> arrayList = new ArrayList<>();

        for(int i = START; i < STOP; i++){
            arrayList.add(i);
        }

        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */

        List<Integer> linkedList = new LinkedList<>(arrayList);

        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */

        ChenageLastWithFirst(arrayList);

        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
        for( final var element: arrayList){
            System.out.println(element);
        }
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
        PerfTestHead(arrayList);

        PerfTestHead(linkedList);

        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example PerfTest.java.
         */
        
        PerfTestMiddle(arrayList);

        PerfTestMiddle(linkedList);

        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         *
         * Africa -> 1,110,635,000
         *
         * Americas -> 972,005,000
         *
         * Antarctica -> 0
         *
         * Asia -> 4,298,723,000
         *
         * Europe -> 742,452,000
         *
         * Oceania -> 38,304,000
         */
        
        final Map <String, Long> map = new HashMap<>();

        map.put("Africa", (long)1110635000);
        map.put("Americas", (long)972005000);
        map.put("Antarctica", (long)0);
        map.put("Asia", (long)4298723000L);
        map.put("Europe", (long)742452000);
        map.put("Oceania", (long)38304000);
        /*
         * 8) Compute the population of the world
         */

        ComputeWorldPopulation(map);

    }

    public static <T extends List> void ChenageLastWithFirst( T coll){
        int lastposition = coll.size()-1;
        var temp = coll.get(0);
        coll.set(0, coll.get(lastposition));
        coll.set(lastposition, temp);
    }

    public static <T extends List> void PerfTestHead( T coll){
        long time = System.nanoTime();

        for (int i = 1; i <= 100000; i++) {
            coll.add(0, i);
        }

        time = System.nanoTime() - time;
        var millis = TimeUnit.NANOSECONDS.toMillis(time);  
        
        System.out.println(// NOPMD
                "insert "
                +coll.size()
                + " ints in a ArrayList took "
                + time
                + "ns ("
                + millis
                + "ms)"
        );
    }

    public static <T extends List> void PerfTestMiddle(T coll){
        long time = System.nanoTime();

        for (int i = 1; i <= 1000; i++) {
            coll.add(coll.size()/2, i);
        }

        time = System.nanoTime() - time;
        var millis = TimeUnit.NANOSECONDS.toMillis(time);  
        
        System.out.println(// NOPMD
                "insert "
                +coll.size()
                + " ints in a ArrayList took "
                + time
                + "ns ("
                + millis
                + "ms)"
        );
    }

    public static void ComputeWorldPopulation(Map map){
        long WorldPopulation = 0;
        for(final var i: map.keySet()){
            WorldPopulation += (long)map.get(i);
        }
        System.out.println(WorldPopulation);
    }
}
