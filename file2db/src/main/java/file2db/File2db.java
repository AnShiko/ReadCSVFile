package file2db;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;

public class File2db {
    public static void main(String[] args) {



        String csvFile = "D:/Programs/Workplace/input.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] table = line.split(cvsSplitBy);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try {

            File file = new File("D:/Programs/Workplace/input.xml");
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
                    .newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
            String CustNo = document.getElementsByTagName("CustNo").item(0).getTextContent();
            String PostingDate = document.getElementsByTagName("PostingDate").item(0).getTextContent();
            String Amount = document.getElementsByTagName("Amount").item(0).getTextContent();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
