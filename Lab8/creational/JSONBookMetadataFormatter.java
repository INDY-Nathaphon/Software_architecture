package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    // create JSON
    private JSONArray jsonObj;

    public JSONBookMetadataFormatter(){
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        this.jsonObj = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.
        JSONObject jsonFormatter = new JSONObject();
        jsonFormatter.put(Book.Metadata.ISBN.value,b.getISBN());

        JSONArray Authors =new JSONArray();
        // get all Authors
        for(String author:b.getAuthors()){
            Authors.add(author);
        }
        // add datato jsonFormatter
        jsonFormatter.put(Book.Metadata.AUTHORS.value,Authors);
        jsonFormatter.put(Book.Metadata.TITLE.value,b.getTitle());
        jsonFormatter.put(Book.Metadata.PUBLISHER.value,b.getPublisher());

        // add all data to jsonObj
        this.jsonObj.add(jsonFormatter);

        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit
        JSONObject jsonMetadata = new JSONObject();
        // print json
        jsonMetadata.put("Book",jsonObj);
        return jsonMetadata.toString();
    }
}