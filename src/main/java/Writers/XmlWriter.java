package Writers;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

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
        XmlMapper xmlMapper = new XmlMapper();
        try {
            xmlMapper.writeValue(file, o);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
