package creational;

import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {
    public abstract BookMetadataFormatter createformatter();
    public void export(PrintStream stream) {
        // Please implement this method. You may create additional methods as you see fit.
        BookMetadataFormatter formatter = createformatter();
        for (Book book : books ){
            formatter.append(book);
        }
        // print formatter
        stream.print(formatter.getMetadataString());

    }
}
