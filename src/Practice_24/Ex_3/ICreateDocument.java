package Practice_24.Ex_3;

public interface ICreateDocument {
    IDocument createNew(String path);
    IDocument createOpen(String path);
}
