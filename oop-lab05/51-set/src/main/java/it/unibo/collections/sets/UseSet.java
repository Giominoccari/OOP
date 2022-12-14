package it.unibo.collections.sets;

import java.util.Set;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;


import static it.unibo.collections.test.Assertions.assertContentEqualsInAnyOrder;
import static it.unibo.collections.test.Assertions.assertTrue;
/**
 * Example class using {@link java.util.Set}.
 *
 */
public final class UseSet {

    private static final int ELEMS = 20;

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */
        final Set<String> set = new TreeSet<>();
        /*
         * 2) Populates such Collection with all the Strings representing numbers ranging from "1" to
         * "20" (both included)
         */
        for(int i = 1; i <= 20; i++){
            set.add(Integer.toString(i));
        }
        /*
         * 3) Prints its content
         */
        System.out.println(set);

        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
         */
        final var iter = set.iterator();
        while (iter.hasNext()) {
            if (Integer.parseInt(iter.next()) % 3 == 0) {
                iter.remove();
            }
        }
        /*
         * 5) Prints the content of the Set using a for-each construct
         */
        final StringBuilder builder = new StringBuilder();
        for (final var element: set) {
            builder.append(element);
            builder.append(' ');
        }
        System.out.println(builder);
        /*
         * 6) Verifies whether all the numbers left in the set are even
         */
        System.out.println(// NOPMD
            "The collection does " + (onlyContainsEvenNumbers(set) ? "" : "not ") + "contain only even numbers"
        );
    }

    private static boolean onlyContainsEvenNumbers(final Collection<String> target) {
        for (final var element: target) {
            if (Integer.parseInt(element) % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
