package Writers;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class XmlWriter implements Writer{
    private File file;
    private String xmlString;

    public XmlWriter(File file) {
        this.file = file;
        this.xmlString = "<LabTests>";
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public void writeData(LinkedList t) {
        XmlMapper xmlMapper = new XmlMapper();
            try {
                for (Object labTest : t) {
                    this.xmlString = this.xmlString + xmlMapper.writeValueAsString(labTest);
                }
                addDataToFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

    public void addDataToFile(){
        try {
            FileWriter fileWriter = new FileWriter(this.file);
            fileWriter.write(this.xmlString  + "</LabTests>");
            fileWriter.close();
            this.xmlString = "<LabTests>";
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
