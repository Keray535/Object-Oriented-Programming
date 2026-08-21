import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.FileWriter;
import java.io.IOException;

enum LogLevel {
    Trace,
    Debug,
    Info,
    Warn,
    Error;
}

interface Logger {
    default void trace(String format, Object... args) {
        this.log(LogLevel.Trace, format, args);
    }
    default void debug(String format, Object... args) {
        this.log(LogLevel.Debug, format, args);
    }
    default void info(String format, Object... args) {
        this.log(LogLevel.Info, format, args);
    }
    default void warn(String format, Object... args) {
        this.log(LogLevel.Warn, format, args);
    }
    default void error(String format, Object... args) {
        this.log(LogLevel.Error, format, args);
    }
    void setLogLevel(LogLevel level);
    void log(LogLevel level, String format, Object... args);
}

interface ConsoleLogger implements Logger {

    default String trace(String format, Object... args) {
        String.format(format, args);
    }
    default String debug(String format, Object... args) {
        String.format(format, args);
    }
    default String info(String format, Object... args) {
        String.format(format, args);
    }
    default String warn(String format, Object... args) {
        String.format(format, args);
    }
    default String error(String format, Object... args) {
        String.format(format, args);
    }
    void log(String format, Object... args);
}