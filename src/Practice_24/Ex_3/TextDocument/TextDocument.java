package Practice_24.Ex_3.TextDocument;

import Practice_24.Ex_3.IDocument;

import java.io.File;

public class TextDocument implements IDocument {
    private File file;

    public TextDocument(File file) {
        this.file = file;
    }

    @Override
    public String getPath() {
        return file.getPath();
    }
}
