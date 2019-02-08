package ro.sci.servlet;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class GetAgeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.of(1993, 8, 11);
        long diffInDays = ChronoUnit.DAYS.between(birthday, now);
        resp.getWriter().println("<html>\n" +
                "<body>\n" +
                "<center>\n" +
                "<h2>Hello Sergiu you are alive for "+ diffInDays+ " days" + " </h2>\n" +
                "</center>\n" +
                "</body>\n" +
                "</html>\n");
    }
}
