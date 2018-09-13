package ServletExamen;

import   java.io.*;
import   javax.servlet.*;
import   javax.servlet.http.*;
 
public   class   ServletExamen  extends   HttpServlet
{

    /**
     *
     * @param req
     * @param res
     * @throws ServletException
     * @throws IOException
     */
    @Override
public   void   doPost(HttpServletRequest   req,   HttpServletResponse res)
throws   ServletException,   IOException
    {
    double   num1,   result;
    int   operacion;

    ServletOutputStream   out   =   res.getOutputStream();

    num1   =   Double.parseDouble(req.getParameter("num1"));
    operacion = Integer.parseInt(req.getParameter("operacion"));

    result   =   calcularRes(num1,operacion);
        if (operacion == 1) {
            out.println("<html>");
            out.println("<head><title>Dolares</title></head>");
            out.println("<body>");
            out.println("<h1><center>Obtendrás</center></h1>");
            out.println("<h1>   <b><center>"+  result   +"</center></b></h1>");
            out.println("<h1><center>Dolares</center></h1>");
            out.println("</body>");
            out.println("</html>");
            out.close();
        }
        else
        {
            out.println("<html>");
            out.println("<head><title>Yenes</title></head>");
            out.println("<body>");
            out.println("<h1><center>Obtendrás</center></h1>");
            out.println("<h1>   <b><center>"+  result   +"</center></b></h1>");
            out.println("<h1><center>Yenes</center></h1>");
            out.println("</body>");
            out.println("</html>");
            out.close();
        }
    
    
    }

    public   double   calcularRes(double   num1,   int   operacion)
    {
    double   result   =   0;

        switch   (operacion)
        {
        case   1:
            return   num1 / 20;
            
        case   2:
            return   num1 * 20;
        }

    return   result;
    }
}
