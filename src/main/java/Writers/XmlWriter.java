package Writers;

import java.io.File;
import java.util.LinkedList;

public class XmlWriter implements Writer{
    private File file;

    public XmlWriter(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public void writeData(Object o) {

    }
}
