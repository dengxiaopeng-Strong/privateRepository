package interfaces;

import classes.BaseException;

public interface Assert {

    BaseException newException(Object... args);

    BaseException newException(Throwable t, Object... args);

    default void assertNotNull(Object obj) {
        if (obj == null) {
            throw newException();
        }
    }

}
