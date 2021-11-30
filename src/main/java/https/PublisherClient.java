/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package https;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import models.APIError;
import models.Publisher;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;





/**
 *
 * @author hp
 */
public class PublisherClient {
    public static final String HOST = "https://app-eam-library.herokuapp.com";
    private ObjectMapper objectMapper;
    private OkHttpClient client;

    public PublisherClient() {
        objectMapper = new ObjectMapper();
        client = new OkHttpClient().newBuilder()
                .build();
    }

    public void createPublisher(Publisher publisher) throws Exception{

        //String bodyStr = objectMapper.writeValueAsString(publisher);

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\n    \"code\": "+publisher.getCode()+",\n    \"name\": \""+publisher.getName()+"\"\n}");
        //RequestBody body = RequestBody.create(mediaType, bodyStr);

        Request request = new Request.Builder()
                .url(HOST +"/publishers")
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();

        Response response = client.newCall(request).execute();

        if (!response.isSuccessful()) {
            String bodyAsString = response.body().string();

            APIError error = objectMapper.readValue(bodyAsString, APIError.class);
            throw new Exception(error.getMessage());
        }
    }
    
    public List<Publisher> getPublishers() throws IOException {
        Request request = new Request.Builder()
                .url(HOST +"/publishers")
                .method("GET", null)
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();

        String bodyAsString = response.body().string();

        Publisher[] publishers = objectMapper.readValue(bodyAsString, Publisher[].class);
        
        List<Publisher> mylist = Arrays.asList(publishers);

        return mylist;
    }

}
