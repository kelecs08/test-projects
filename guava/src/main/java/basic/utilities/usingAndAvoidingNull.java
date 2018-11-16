package basic.utilities;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.base.Strings;

/**
 * null can be ambiguous, cause confusing errors and is sometimes just plain unpleasant
 * many Guava utilities reject and fail fast on nulls, rather than accepting them blindly
 */
public class usingAndAvoidingNull {

    // It is rarely obvious what a null return value is supposed to mean - Map.get(key) can return null either
    //   because the value in the map is null, or the value is not in the map.
    // null can mean failure, success ... anything
    // on the other hand, null is cheap, in terms of memory and speed, and it's unavoidable in object arrays

    // Many of the cases where programmers use null is to indicate some sort of absence.
    // Optional<T> may either contain a non-null T reference - the reference is present - or it may contain nothing.
    public Optional<Integer> sampleOptional() {
        Optional<Integer> possible = Optional.of(5); // make an Optional containing the given non-null value, or fail fast on null

        possible.isPresent(); // returns true
        possible.get();       // returns 5
        possible.or(0); // returns the value or the given one in case of absence
        possible.orNull();    // turns the given possibly-null Optional into null - reverso of fromNullable() function

        Optional.absent();          // returns an absent optional
        Optional.fromNullable(null); // turns the given possibly-null reference into an Optional

        Optional.fromJavaUtil(java.util.Optional.of(5));
        java.util.Optional javaOptional = Optional.toJavaUtil(possible);

        return possible;
    }

    public void nullMethods() {
        MoreObjects.firstNonNull(null, null); // if both of the parameters are null, it fails fast with a NullPointerException

        Strings.isNullOrEmpty("null");
    }
}
