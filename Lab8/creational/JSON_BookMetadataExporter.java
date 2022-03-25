package creational;

public class JSON_BookMetadataExporter extends BookMetadataExporter {
    @Override
    public BookMetadataFormatter createformatter()
    {
        // Create Book form JSONBookMetadataFormatter
        return new JSONBookMetadataFormatter();
    }
}
