package XML_File_Handling;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XML_Reader {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse("file:///home/workspace/Test/src/XML_File_Handling/Employees.xml");

        //To get root Node

        Element root = document.getDocumentElement();
        NodeList childNode = root.getChildNodes();

        //Iterate each item

        for (int i = 0; i < childNode.getLength() ; i++) {
            Node node = childNode.item(i);

            if (node.getNodeType() == document.ELEMENT_NODE) {
                 Element list = (Element)node;
                 System.out.println(list.getTagName());
                 System.out.println(list.getTextContent());
                 System.out.println("_______________________________________________");
            }
        }
    }
}