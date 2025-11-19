package com.example.demo;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;

public class App {
    public static void main(String[] args) {
        try {
            // Load XML file
            File file = new File("src/main/resources/data.xml");

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();

            // Reading XML tags
            Element root = doc.getDocumentElement();

            String name = root.getElementsByTagName("name").item(0).getTextContent();
            String role = root.getElementsByTagName("role").item(0).getTextContent();

            System.out.println("Name: " + name);
            System.out.println("Role: " + role);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

