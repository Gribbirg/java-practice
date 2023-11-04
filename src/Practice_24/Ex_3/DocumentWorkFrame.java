package Practice_24.Ex_3;

import Practice_24.Ex_3.TextDocument.CreateTextDocument;
import Practice_24.Ex_3.TextDocument.TextDocument;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class DocumentWorkFrame extends JFrame {

    JMenuBar menuBar = new JMenuBar();

    IDocument document;

    ICreateDocument createDocument = new CreateTextDocument();

    final String PATH = "C:\\Users\\gribk\\IdeaProjects\\GribkovJavaCourse\\src\\Files\\";

    public DocumentWorkFrame() {
        super("Работа с документами");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);

        JMenu menu = new JMenu("File");
        JMenuItem menuItem;

        menuItem = new JMenuItem("New");
        menuItem.addActionListener(e -> {
            String name = JOptionPane.showInputDialog("Введите имя файла:");
            if (name != null && !name.isEmpty())
                document = createDocument.createNew(PATH + name);
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Open");
        menuItem.addActionListener(e -> {
            String name = JOptionPane.showInputDialog("Введите имя файла:");
            if (name != null && !name.isEmpty())
                document = createDocument.createOpen(PATH + name);
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Save");
        menuItem.addActionListener(e -> {
            document = createDocument.createNew(document.path);
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Exit");
        menuItem.addActionListener(e -> {
            dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        });
        menu.add(menuItem);

        menuBar.add(menu);

        setJMenuBar(menuBar);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DocumentWorkFrame();
    }
}
