package sample.test01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Server01
 */
@WebServlet("/Servlet01")
public class Servlet01 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet01() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Query String����p�����[�^���擾
        String strQueryData01 = request.getParameter("Data01");

        //JavaBean�I�u�W�F�N�g�̕ϐ��錾
        JavaBean01 javaBean01 = null;

        //Session�I�u�W�F�N�g����JavaBean�擾�B������ΐ����B
        HttpSession session = request.getSession();
        javaBean01 = (JavaBean01)session.getAttribute("sessionObject_JavaBean01");
        if (javaBean01 == null){
            javaBean01 = new JavaBean01();
            session.setAttribute("sessionObject_JavaBean01", javaBean01);
        }

        //JavaBean�ɁA�p�����[�^�Ƃ��Ď󂯎�����f�[�^���Z�b�g
        if (strQueryData01 != null) {
            javaBean01.setStrData01(strQueryData01);
        }

        //JSP�Ăяo��
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("./JSP01.jsp");
        requestDispatcher.forward(request, response);

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}