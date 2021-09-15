package edu.weber.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import edu.weber.model.Contact;
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
	
	Map<Integer, Contact> ContactMap
    = new HashMap<Integer, Contact>();

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
				+ "    <form method=\"post\">\n"
				+ "       <br>\n"
				
				+ "        <label for=\"fname\">*First name:</label>"
				+ "        <input type=\"text\"  name=\"fname\"></br>"
				+ "\n"
				
				+ "        <label for=\"lname\">*Last name:</label>"
				+ "        <input type=\"text\" name=\"lname\"></br>"
				+ "\n"
				
				+ "        <label for=\"pnumber\" >*Phone Number(XXX-XXX-XXXX):"
				+ "</label>"
				+ "        <input type=\"text\" name=\"pnumber\"></br></br>"
				+ "\n"
				
				+ "        <label>*Address 1 Type: "
				+ "        <select name=\"address1Type\" size=\"1\">\n"
				+ "            <option> </option>\n"
				+ "            <option>Home</option>\n"
				+ "            </select>"
				+ "\n"
				+ "</br>"
				
				+ "        <label for=\"addressa1\" >*Address 1 Line 1:"
				+ "</label>"
				+ "        <input type=\"text\" name=\"addressa1\"></br>"
				+ "\n"
				
				+ "        <label for=\"addressa2\" >Address 1 Line 2:"
				+ "</label>"
				+ "        <input type=\"text\" name=\"addressa2\"></br>"
				+ "\n"
				
				+ "        <label for=\"zip1\" >*Zip Code"
				+ "</label>"
				+ "        <input type=\"text\" name=\"zip1\"></br>"
				+ "\n"
				
				+ "        <label>*State</label>"
				+ "			<select name=\"state1\" size=\"1\">\n"
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
				+ "            <option>Work</option>"
				+ "            </select>"
				+ "\n"
				+ "</br>"
				
				+ "        <label for=\"addressb1\" >Address 2 Line 1:"
				+ "</label>"
				+ "        <input type=\"text\" name=\"addressb1\"></br>"
				+ "\n"
				
				+ "        <label for=\"addressb2\" >Address 2 Line 2:"
				+ "</label>"
				+ "        <input type=\"text\" name=\"addressb2\"></br>"
				+ "\n"
				
				+ "        <label for=\"zip2\" >Zip Code"
				+ "</label>"
				+ "        <input type=\"text\" name=\"zip2\"></br>"
				+ "\n"
				
				+ "        <label>State</label>"
				+ "			<select name=\"state2\" size=\"1\">\n"
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
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String pn = req.getParameter("pnumber");
		String a1t = req.getParameter("address1Type");
		String aa1 = req.getParameter("addressa1");
		String aa2 = req.getParameter("addressa2");
		String zip1 = req.getParameter("zip1");
		String state1 = req.getParameter("state1");
		
		
		
		//test
		
		
//		if(req.getParameter("fname").equals("") || req.getParameter("lname").equals("") 
//			|| req.getParameter("pnumber").equals("") || req.getParameter("address1Type").equals("")
//			|| req.getParameter("addressa1").equals("") || req.getParameter("addressa2").equals("")
//			|| req.getParameter("zip1").equals("")|| req.getParameter("state1").equals("")){
//          resp.sendRedirect("./?errormessage=Must Have an address");
//            return;
//        }
		
		
		String a2t = req.getParameter("address2type");
		//if(a2t.equals(" ")) {a2t = "null"; }
		String ab1 = req.getParameter("addressb1");
		//if(ab1.equals("")) {ab1 = "null"; }
		String ab2 = req.getParameter("addressb2");
		//if(ab2.equals("")) {ab2 = "null"; }
		String zip2 = req.getParameter("zip2");
		//if(zip2.equals("")) {zip2 = "null"; }
		String state2 = req.getParameter("state2");
		//if(state2.equals(" ")) {state2 = "null"; }
		
		

		
		
		Contact tempContact = new Contact(fname, lname, pn, a1t, a2t,
				aa1, aa2, ab1, ab2, zip1, zip2, state1, state2);
		ContactMap.put(ContactMap.size() + 1, tempContact);
		
		String ContactListString = "";
		
		for(int i = 1; i <= ContactMap.size(); i++) {
			ContactListString += ContactMap.get(i).getFirstName() + " " +
					ContactMap.get(i).getLastName() + " -- " + ContactMap.get(i).getPhoneNumber()
					+ ", " + ContactMap.get(i).getAddressType1() + ": " + 
					ContactMap.get(i).getAddressA1() + ContactMap.get(i).getAddressA2()+ ", " +
					ContactMap.get(i).getCity1() + ", " + ContactMap.get(i).getZip1(); 
					if(!ContactMap.get(i).getAddressType2().equals("")) {
						ContactListString += "-- " +ContactMap.get(i).getAddressType2();}
					
					if(!ContactMap.get(i).getAddressB1().equals("")) {
						ContactListString += ": " + ContactMap.get(i).getAddressB1();
					}
					if(!ContactMap.get(i).getAddressB2().equals("")) {
						ContactListString += ContactMap.get(i).getAddressB2();
					}
					if(!ContactMap.get(i).getCity2().equals("")) {
						ContactListString += ", " + ContactMap.get(i).getCity2();
					}
					if(!ContactMap.get(i).getZip2().equals("")) {
						ContactListString += ", " +ContactMap.get(i).getZip2();
					}
					ContactListString += "</br>";
		}
		
		
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
				+ "    <form method=\"post\">\n"
				+ "       <br>\n"
				
			    + ContactListString
				
				+ " --------------------------------------------------</br>"
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
				+ "        <select name=\"address1Type\" size=\"1\">\n"
				+ "            <option> </option>\n"
				+ "            <option>Home</option>\n"
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
				+ "			<select name=\"state1\" size=\"1\">\n"
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
	

}
