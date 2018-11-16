package basic.utilities;

import java.util.Objects;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ComparisonChain;

public class objectCommonMethodsAndOrdering {

    public void objectCommonMethods() {

        Objects.equals(null, null); // returns true
        Objects.hash(5, "field2", "field3"); // instead of builidng the hash by hand

        MoreObjects.toStringHelper(this).add("x", 1).toString(); // "objectCommonMethodsAndOrdering{x=1}"
        MoreObjects.toStringHelper("Myobject").add("y", 2).toString(); // "MyObject{y=2}"

        // instead of implementing Comparator or Comparable interface, consider:
        ComparisonChain.start().compare("a", "a").compare(5, 8).compare(0, 0).result(); // lazy comparisons - only performs comparisons,
            // until it finds a non-zero result, after which it ignores further input

    }

    /**
     * Ordering is Guava's Comparator class, which can be used to build complex comparators and apply them to collections of objects.
     */
    public void ordering() {

    }
}
