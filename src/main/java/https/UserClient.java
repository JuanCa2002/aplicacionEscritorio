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
import models.Book;
import models.User;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 *
 * @author hp
 */
public class UserClient {
    public static final String HOST = "https://app-eam-library.herokuapp.com";
    private ObjectMapper objectMapper;
    private OkHttpClient client;

    public UserClient() {
        objectMapper = new ObjectMapper();
        client = new OkHttpClient().newBuilder()
                .build();
    }
    
     public void createUser(User user) throws Exception{

        String bodyStr = objectMapper.writeValueAsString(user);

        MediaType mediaType = MediaType.parse("application/json");
        //RequestBody body = RequestBody.create(mediaType, "{\n    \"id\": \""+person.getId()+"\",\n    \"name\": \""+person.getName()+"\",\n    \"age\": 30,\n    \"city\": \"Cali\"\n}");
        RequestBody body = RequestBody.create(mediaType, bodyStr);

        Request request = new Request.Builder()
                .url(HOST +"/users")
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
     
    public List<Book> findBooksByUser(int idUser) throws IOException {
        Request request = new Request.Builder()
                .url(HOST +"/users/"+idUser+"/books")
                .method("GET", null)
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();

        String bodyAsString = response.body().string();

        Book[] books = objectMapper.readValue(bodyAsString, Book[].class);
        
        List<Book> mylist = Arrays.asList(books);

        return mylist;
    }
    
    public List<User> getUsers() throws IOException {
        Request request = new Request.Builder()
                .url(HOST +"/users")
                .method("GET", null)
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();

        String bodyAsString = response.body().string();

        User[] users = objectMapper.readValue(bodyAsString, User[].class);
        
        List<User> mylist = Arrays.asList(users);

        return mylist;
    }
    
    
}
