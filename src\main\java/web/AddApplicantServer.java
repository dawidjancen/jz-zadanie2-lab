package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import repositories.ConferenceApplicationRepository;
import repositories.DummyConferenceApplicationRepository;
import domain.ConferenceApplication;

@WebServlet("/add")
public class AddApplicantServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddApplicantServer() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ConferenceApplication application = retrieveApplicationFromRequest(request);
		
		ConferenceApplicationRepository repository = new DummyConferenceApplicationRepository();
		repository.add(application);
		
		HttpSession session = request.getSession();
		
		session.setAttribute("conf", application);
		
		response.sendRedirect("success.jsp");
	}
	
	private ConferenceApplication retrieveApplicationFromRequest(HttpServletRequest request) {
		ConferenceApplication result = new ConferenceApplication();
		
		result.setName(request.getParameter("name"));
		result.setSurname(request.getParameter("surname"));
		result.setEmployment(request.getParameter("employment"));
		result.setAdvertisement(request.getParameter("info"));
		result.setEmail(request.getParameter("email"));
		
		return result;
	}
}
