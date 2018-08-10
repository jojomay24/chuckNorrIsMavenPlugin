package com.kahla.chuckNorris_maven_plugin;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class RestClient {
    
    private static final String REST_URI 
      = "https://api.chucknorris.io/jokes/random";
  
    private Client client = ClientBuilder.newClient();
 
    public Wisdom getWisdom() {
        return client
          .target(REST_URI)
//          .path(String.valueOf(id))
          .request(MediaType.APPLICATION_JSON)
          .get(Wisdom.class);
    }
    //...
}