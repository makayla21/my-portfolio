package com.google.sps.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    ArrayList<String> messageList = new ArrayList<>(Arrays.asList("I dislike chocolate ", "I enjoy serial killer documentaries ", "I have a dog named Magic "));
    String json = convertToJsonUsingGson(messageList);


  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html;");
    response.getWriter().println(json);
  }

    private String convertToJsonUsingGson(ArrayList<String> messageList2) {
        Gson gson = new Gson();
        String json = gson.toJson(messageList2);
        return json;
    }
}
