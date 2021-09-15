package edu.weber.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
		name="MyServlet",
		urlPatterns = "/"
)

public class MyServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = resp.getWriter();
		
		
		writer.println("<!DOCTYPE html>\n"
				+ "<html lang=\"en\">\n"
				+ "<head>\n"
				+ "    <meta charset=\"UTF-8\">\n"
				+ "    <title>Contacts Book</title>\n"
				+ "</head>\n"
				+ "<body>\n"
				+ "<center>\n"
				+ "    <h1>\n"
				+ "        Contacts\n"
				+ "    </h1>\n"
				+ "    <form method=\"post\" action=\"CreateContact\">\n"
				+ "       <br>\n"
				
				+ "        <label for=\"fname\">*First name:</label>"
				+ "        <input type=\"text\"></br>"
				+ "\n"
				
				+ "        <label for=\"lname\">*Last name:</label>"
				+ "        <input type=\"text\"></br>"
				+ "\n"
				
				+ "        <label for=\"pnumber\">*Phone Number(XXX-XXX-XXXX):"
				+ "</label>"
				+ "        <input type=\"text\"></br></br>"
				+ "\n"
				
				+ "        <label>*Address 1 Type: "
				+ "        <select name=\"Type\" size=\"1\">\n"
				+ "            <option> </option>\n"
				+ "            <option>Home</option>\n"
				+ "            <option>Work</option>"
				+ "            </select>"
				+ "\n"
				+ "</br>"
				
				+ "        <label for=\"addressa1\">*Address 1 Line 1:"
				+ "</label>"
				+ "        <input type=\"text\"></br>"
				+ "\n"
				
				+ "        <label for=\"addressa2\">Address 1 Line 2:"
				+ "</label>"
				+ "        <input type=\"text\"></br>"
				+ "\n"
				
				+ "        <label for=\"zip1\">*Zip Code"
				+ "</label>"
				+ "        <input type=\"text\"></br>"
				+ "\n"
				
				+ "        <label>*State</label>"
				+ "			<select name=\"State\" size=\"1\">\n"
				+ "					<option> </option>\n"
				+ "					<option>Alabama</option>\n"
				+ "					<option>Alaska</option>\n"
				+ "					<option>Arizona</option>\n"
				+ "					<option>Arkansas</option>\n"
				+ "					<option>California</option>\n"
				+ "					<option>Colorado</option>\n"
				+ "					<option>Connecticut</option>\n"
				+ "					<option>Delaware</option>\n"
				+ "					<option>District Of Columbia</option>\n"
				+ "					<option>Florida</option>\n"
				+ "					<option>Georgia</option>\n"
				+ "					<option>Hawaii</option>\n"
				+ "					<option>Idaho</option>\n"
				+ "					<option>Illinois</option>\n"
				+ "					<option>Indiana</option>\n"
				+ "					<option>Iowa</option>\n"
				+ "					<option>Kansas</option>\n"
				+ "					<option>Kentucky</option>\n"
				+ "					<option>Louisiana</option>\n"
				+ "					<option>Maine</option>\n"
				+ "					<option>Maryland</option>\n"
				+ "					<option>Massachusetts</option>\n"
				+ "					<option>Michigan</option>\n"
				+ "					<option>Minnesota</option>\n"
				+ "					<option>Mississippi</option>\n"
				+ "					<option>Missouri</option>\n"
				+ "					<option>Montana</option>\n"
				+ "					<option>Nebraska</option>\n"
				+ "					<option>Nevada</option>\n"
				+ "					<option>New Hampshire</option>\n"
				+ "					<option>New Jersey</option>\n"
				+ "					<option>New Mexico</option>\n"
				+ "					<option>New York</option>\n"
				+ "					<option>North Carolina</option>\n"
				+ "					<option>North Dakota</option>\n"
				+ "					<option>Ohio</option>\n"
				+ "					<option>Oklahoma</option>\n"
				+ "					<option>Oregon</option>\n"
				+ "					<option>Pennsylvania</option>\n"
				+ "					<option>Rhode Island</option>\n"
				+ "					<option>South Carolina</option>\n"
				+ "					<option>South Dakota</option>\n"
				+ "					<option>Tennessee</option>\n"
				+ "					<option>Texas</option>\n"
				+ "					<option>Utah</option>\n"
				+ "					<option>Vermont</option>\n"
				+ "					<option>Virginia</option>\n"
				+ "					<option>Washington</option>\n"
				+ "					<option>West Virginia</option>\n"
				+ "					<option>Wisconsin</option>\n"
				+ "					<option>Wyoming</option>\n"
				+ "			</select> </br></br>"
				
				+ "        <label>Address 2 Type: "
				+ "        <select name=\"address2type\" size=\"1\">\n"
				+ "            <option> </option>\n"
				+ "            <option>Home</option>\n"
				+ "            <option>Work</option>"
				+ "            </select>"
				+ "\n"
				+ "</br>"
				
				+ "        <label for=\"addressb1\">Address 2 Line 1:"
				+ "</label>"
				+ "        <input type=\"text\"></br>"
				+ "\n"
				
				+ "        <label for=\"addressb2\">Address 2 Line 2:"
				+ "</label>"
				+ "        <input type=\"text\"></br>"
				+ "\n"
				
				+ "        <label for=\"zip2\">Zip Code"
				+ "</label>"
				+ "        <input type=\"text\"></br>"
				+ "\n"
				
				+ "        <label>State</label>"
				+ "			<select name=\"State\" size=\"1\">\n"
				+ "					<option> </option>\n"
				+ "					<option>Alabama</option>\n"
				+ "					<option>Alaska</option>\n"
				+ "					<option>Arizona</option>\n"
				+ "					<option>Arkansas</option>\n"
				+ "					<option>California</option>\n"
				+ "					<option>Colorado</option>\n"
				+ "					<option>Connecticut</option>\n"
				+ "					<option>Delaware</option>\n"
				+ "					<option>District Of Columbia</option>\n"
				+ "					<option>Florida</option>\n"
				+ "					<option>Georgia</option>\n"
				+ "					<option>Hawaii</option>\n"
				+ "					<option>Idaho</option>\n"
				+ "					<option>Illinois</option>\n"
				+ "					<option>Indiana</option>\n"
				+ "					<option>Iowa</option>\n"
				+ "					<option>Kansas</option>\n"
				+ "					<option>Kentucky</option>\n"
				+ "					<option>Louisiana</option>\n"
				+ "					<option>Maine</option>\n"
				+ "					<option>Maryland</option>\n"
				+ "					<option>Massachusetts</option>\n"
				+ "					<option>Michigan</option>\n"
				+ "					<option>Minnesota</option>\n"
				+ "					<option>Mississippi</option>\n"
				+ "					<option>Missouri</option>\n"
				+ "					<option>Montana</option>\n"
				+ "					<option>Nebraska</option>\n"
				+ "					<option>Nevada</option>\n"
				+ "					<option>New Hampshire</option>\n"
				+ "					<option>New Jersey</option>\n"
				+ "					<option>New Mexico</option>\n"
				+ "					<option>New York</option>\n"
				+ "					<option>North Carolina</option>\n"
				+ "					<option>North Dakota</option>\n"
				+ "					<option>Ohio</option>\n"
				+ "					<option>Oklahoma</option>\n"
				+ "					<option>Oregon</option>\n"
				+ "					<option>Pennsylvania</option>\n"
				+ "					<option>Rhode Island</option>\n"
				+ "					<option>South Carolina</option>\n"
				+ "					<option>South Dakota</option>\n"
				+ "					<option>Tennessee</option>\n"
				+ "					<option>Texas</option>\n"
				+ "					<option>Utah</option>\n"
				+ "					<option>Vermont</option>\n"
				+ "					<option>Virginia</option>\n"
				+ "					<option>Washington</option>\n"
				+ "					<option>West Virginia</option>\n"
				+ "					<option>Wisconsin</option>\n"
				+ "					<option>Wyoming</option>\n"
				+ "</select> "

				
				+ "        </select>\n"
				+ "        <br><br>\n"
				
				+ "        <input type=\"submit\">\n"
				+ "    </form>\n"
				+ "</center>\n"
				+ "\n"
				
				+ "\n"
				+ "</body>\n"
				+ "</html>");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	

}
