package XML_File_Handling;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class XML_Writter {
	public static void main(String[] args) throws ParserConfigurationException, TransformerConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();

        // Write root node first
        Element root  = document.createElement("Students_List");

        //write child nodes
        Element childNode = document.createElement("Student");
        //write node elements
        Element stud_ID = document.createElement("stud_id");
        Text stud_id = document.createTextNode("2001");
        stud_ID.appendChild(stud_id);

        Element stud_Name = document.createElement("stud_Name");
        Text stud_name = document.createTextNode("Surendhar");
        stud_Name.appendChild(stud_name);

        Element stud_Age = document.createElement("stud_Age");
        Text stud_age = document.createTextNode("23");
        stud_Age.appendChild(stud_age);

        //this all elements are append to one of the childNode of the root node
        childNode.appendChild(stud_ID);
        childNode.appendChild(stud_Name);
        childNode.appendChild(stud_Age);

        // now we have to append that child node into that root node

        root.appendChild(childNode);

        // now we have to append that root into that Document
        document.appendChild(root);

        // now we have to transform this document object into Original XML file so we can use TransformerFactory class.......
        TransformerFactory transform = TransformerFactory.newInstance();
        Transformer transformer = transform.newTransformer();
        transformer.setOutputProperty(OutputKeys.ENCODING,"UTF-8");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        DOMSource source = new DOMSource(document); 
        StreamResult destination = new StreamResult("file:///home/workspace/Test/src/XML_File_Handling/Employees.xml"); 
        
        try {
            transformer.transform(source, destination);
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        System.out.println("Writted SuccessFully........");
    }
}