package creational;

import java.io.IOException;

public class CSV_BookMetadataExporter extends BookMetadataExporter {
    BookMetadataFormatter formatter = null;
    @Override
    public BookMetadataFormatter createformatter()
    {
        try {
            //Create formatter
            formatter = new CSVBookMetadataFormatter();
        }catch(IOException e) {
            e.printStackTrace();
        }
        return formatter;
    }
}
