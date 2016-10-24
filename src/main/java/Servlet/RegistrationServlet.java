package Servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by iikhsn on 09.10.16.
 */

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login =  request.getParameter("login");
        String password =  request.getParameter("password");
        if (!(login == null) & !(password == null)) {
            if (DBWorker.assertUser(login, password)){
                HttpSession session = request.getSession();
                session.setAttribute("authorized", "ok"); // положить в сессию что то
                System.out.println("вход выполнен");
                RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/homePage.jsp");
                dispatcher.forward(request, response);}
            else{
                System.out.println("вход не выполнен");
                String varTextВ = "Не удалось войти в систему!";
                request.setAttribute("textВ", varTextВ);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/index.jsp");
                dispatcher.forward(request, response);
            }
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/index.jsp");
            dispatcher.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
