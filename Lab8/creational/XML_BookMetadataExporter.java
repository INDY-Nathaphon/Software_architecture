package creational;

import javax.xml.parsers.ParserConfigurationException;


public class XML_BookMetadataExporter extends BookMetadataExporter{
    BookMetadataFormatter formatter = null;
    @Override
    public BookMetadataFormatter createformatter()
    {
        try {
            //create formatter
            formatter = new XMLBookMetadataFormatter();
        }catch(ParserConfigurationException e) {
            e.printStackTrace();
        }
        return formatter;
    }
}
