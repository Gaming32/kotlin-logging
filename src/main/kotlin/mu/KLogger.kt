package mu

import org.slf4j.Logger

/**
 * An extension for org.slf4j.Logger with Lazy message evaluation
 * example:
 * logger.info{"this is $lazy evaluated string"}
 */
class KLogger(jLogger: Logger): Logger by jLogger{

    /**
     * Lazy add a log message if isTraceEnabled is true
     */
    inline fun trace(msg: () -> Any?) {
        if (isTraceEnabled) trace(msg.invoke().toString())
    }

    /**
     * Lazy add a log message if isDebugEnabled is true
     */
    inline fun debug(msg: () -> Any?) {
        if (isDebugEnabled) debug(msg.invoke().toString())
    }

    /**
     * Lazy add a log message if isInfoEnabled is true
     */
    inline fun info(msg: () -> Any?) {
        if (isInfoEnabled) info(msg.invoke().toString())
    }

    /**
     * Lazy add a log message if isWarnEnabled is true
     */
    inline fun warn(msg: () -> Any?) {
        if (isWarnEnabled) warn(msg.invoke().toString())
    }

    /**
     * Lazy add a log message if isErrorEnabled is true
     */
    inline fun error(msg: () -> Any?) {
        if (isErrorEnabled) error(msg.invoke().toString())
    }

    /**
     * Lazy add a log message with throwable payload if isTraceEnabled is true
     */
    inline fun trace(t: Throwable, msg: () -> Any?) {
        if (isTraceEnabled) trace(msg.invoke().toString(), t)
    }

    /**
     * Lazy add a log message with throwable payload if isDebugEnabled is true
     */
    inline fun debug(t: Throwable, msg: () -> Any?) {
        if (isDebugEnabled) debug(msg.invoke().toString(), t)
    }

    /**
     * Lazy add a log message with throwable payload if isInfoEnabled is true
     */
    inline fun info(t: Throwable, msg: () -> Any?) {
        if (isInfoEnabled) info(msg.invoke().toString(), t)
    }

    /**
     * Lazy add a log message with throwable payload if isWarnEnabled is true
     */
    inline fun warn(t: Throwable, msg: () -> Any?) {
        if (isWarnEnabled) warn(msg.invoke().toString(), t)
    }

    /**
     * Lazy add a log message with throwable payload if isErrorEnabled is true
     */
    inline fun error(t: Throwable, msg: () -> Any?) {
        if (isErrorEnabled) error(msg.invoke().toString(), t)
    }
}
