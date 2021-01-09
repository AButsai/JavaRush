package JavaCore.level9.lecture3.task4ИЕщеОдинАдаптер;

import java.io.IOException;
import java.text.ParseException;

public interface PersonScanner {
    Person read() throws IOException, ParseException;

    void close() throws IOException;
}
