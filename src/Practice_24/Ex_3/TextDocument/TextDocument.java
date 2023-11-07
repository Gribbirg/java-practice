package Practice_24.Ex_3.TextDocument;

import Practice_24.Ex_3.IDocument;

import javax.swing.*;
import java.io.*;

public class TextDocument implements IDocument {
    private File file;

    private JTextArea jTextArea;

    public TextDocument(File file) {
        this.file = file;
    }

    @Override
    public String getPath() {
        return file.getPath();
    }

    @Override
    public void save() throws IOException {
        FileWriter fileWriter = new FileWriter(file);

    }

    @Override
    public void createEditor(JFrame jFrame) throws IOException {
        FileReader fileReader = new FileReader(file);
        jTextArea = new JTextArea(String.valueOf(fileReader.read()));
        jFrame.add(jTextArea);
    }
}
