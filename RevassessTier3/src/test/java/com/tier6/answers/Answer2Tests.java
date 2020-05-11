package com.tier6.answers;

import static com.tier6.answers.PointsTests.addPoints;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.reflect.Method;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rev.servlet.RevassessServlet;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * prompt: Implement a single servlet that can provide flashcard data by
 * consuming its mapped endpoint using a get method.
 */
public class Answer2Tests {

    HttpServlet serv;
    public void setup(){
        RevassessServlet rev = new RevassessServlet();
        if(rev instanceof Servlet){
            serv = (HttpServlet) rev;
        } else {
            
        }
    }

    @Test
    public void test2() throws ServletException, IOException {
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);
        serv.doGet(request, response);
        writer.flush();
        assertTrue(stringWriter.toString().contains(
                "{\"flashcards\":[{\"id\":1,\"question\":\"core java question\",\"answer\":\"dummy answer\",\"category\":\"core java\"},{\"id\":2,\"question\":\"java reflection question\",\"answer\":\"dummy answer\",\"category\":\"java reflection\"},{\"id\":3,\"question\":\"java collections question\",\"answer\":\"dummy answer\",\"category\":\"java collections\"}]}"));
        addPoints(200);
    }

    private class Serv extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            
        }
    }

    
}
