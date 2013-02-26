package parser;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class Parse_from_XML
{
  private XML_adatok adatok = new XML_adatok();

  XML_adatok parse_in(String filenev) { SAXBuilder builder = new SAXBuilder();
    File xmlFile = new File(filenev);
    try
    {
      Document document = builder.build(xmlFile);
      Element rootNode = document.getRootElement();
      List list = rootNode.getChildren("type");
      for (int i = 0; i < list.size(); i++)
      {
        Element node = (Element)list.get(i);
        System.out.println(node.getChildText("sync"));
        this.adatok.setSync(node.getChildText("sync"));
        System.out.println(node.getChildText("text"));
        this.adatok.setText(node.getChildText("text"));
      }

      list = rootNode.getChildren("key");
      for (int i = 0; i < list.size(); i++)
      {
        Element node = (Element)list.get(i);
        System.out.println(node.getChildText("keyid"));
        this.adatok.setKeyID(node.getChildText("keyid"));
        System.out.println(node.getChildText("it"));
        this.adatok.setIt(Integer.parseInt(node.getChildText("it")));
        System.out.println(node.getChildText("gen"));
        this.adatok.setGen(Integer.parseInt(node.getChildText("gen"), 16));
        System.out.println(node.getChildText("mod"));
        this.adatok.setMod(Integer.parseInt(node.getChildText("mod"), 16));
        System.out.println(node.getChildText("prekeyvalue"));
        this.adatok.setPrekeyvalue(Integer.parseInt(node.getChildText("prekeyvalue"), 16));
      }

      list = rootNode.getChildren("msgvalue");
      for (int i = 0; i < list.size(); i++)
      {
        Element node = (Element)list.get(i);
        System.out.println(node.getText());
        this.adatok.setMsgvalue(new BigInteger(node.getText(), 16));
      }
    }
    catch (IOException io)
    {
      System.out.println(io.getMessage());
    } catch (JDOMException jdomex) {
      System.out.println(jdomex.getMessage());
    }
    return this.adatok;
  }
}