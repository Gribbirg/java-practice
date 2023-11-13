package Practice_24.Ex_3.TextDocument;

import Practice_24.Ex_3.ICreateDocument;
import Practice_24.Ex_3.IDocument;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateTextDocument implements ICreateDocument {

    @Override
    public IDocument createNew(String path) throws IOException {
        File file = new File(path + ".txt");
        if (!file.createNewFile()) {
            if (file.delete()) {
                createNew(path);
            } else {
                throw new IOException("Can't delete file!");
            }
        }
        return new TextDocument(file);
    }

    @Override
    public IDocument createOpen(String path) {
        return new TextDocument(new File(path + ".txt"));
    }
}
