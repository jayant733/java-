package org.example;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TodoService {


    //u need to create a interface every single call
    //requires an interface

  ; //the file for the todos object
  //@PATH LINK THIS URL PARAM TO THE PATH

    @GET("/todos/{id}")// /TODOS IS CONSTANT BUT AFTER THAT IT IS USER DEFINED
    Call<Todos> getTodoById(@Path("id") String id);



}
