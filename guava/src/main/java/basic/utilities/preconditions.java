package basic.utilities;

import java.util.Collections;

import com.google.common.base.Preconditions;

/**
 * Guava provides a number of precondition checking utilities.
 */
public class preconditions {

    public void preconditions() {

        Preconditions.checkArgument("null".equals("empty"), "null is not null :P"); // checks whether the boolean is true, else throws IllegalArgumentException with the error message
        Preconditions.checkNotNull(null); // NullPointerException
        Preconditions.checkState(Collections.emptyIterator().hasNext()); // IllegalStateException
        Preconditions.checkElementIndex(1, 1); // IndexOutOfBoundsException

    }
}
