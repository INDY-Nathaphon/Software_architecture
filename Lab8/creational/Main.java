package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Current usage
//        BookMetadataFormatter formatter = null;
//        try {
//            formatter = BookMetadataFormatterFactory.getBookMetadataFormatter(BookMetadataFormatterFactory.Format.CSV);
//            formatter.append(TestData.dragonBook);
//            formatter.append(TestData.dinosaurBook);
//            System.out.print(formatter.getMetadataString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParserConfigurationException e) {
//            e.printStackTrace();
//        }

        // Expected usage
//        BookMetadataExporter exporter = new XML_BookMetadataExporter();
//        exporter.add(TestData.sailboatBook);
//        exporter.add(TestData.GoFBook);
//        exporter.export(System.out);

        BookMetadataExporter exporter1 = null;
        String input1 = "xml";
        // for test
        if(input1.equals("json")  ){
            exporter1 = new JSON_BookMetadataExporter();
        }
        else if(input1.equals("csv")  ){
            exporter1 = new CSV_BookMetadataExporter();
        }
        else if(input1.equals("xml")  ){
            exporter1 = new XML_BookMetadataExporter();
        }
        System.out.println(input1);
        exporter1.add(TestData.sailboatBook);
        exporter1.add(TestData.GoFBook);
        exporter1.export(System.out);
    }
}
