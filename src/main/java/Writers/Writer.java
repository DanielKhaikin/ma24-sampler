package Writers;

import Parsers.LabTest;

import java.util.LinkedList;
import java.util.List;

public interface Writer<T> {
    public void writeData(LinkedList<T> t);
}
