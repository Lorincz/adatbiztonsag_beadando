package parser;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigInteger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class Parse_to_XML
{
  void parse_out(String filename, XML_adatok adatok)
  {
    try
    {
      Element msg = new Element("msg");
      Document doc = new Document(msg);

      Element type = new Element("type");
      type.addContent(new Element("sync").setText(adatok.getSync()));
      type.addContent(new Element("text").setText(adatok.getText()));

      doc.getRootElement().addContent(type);

      Element key = new Element("key");
      key.addContent(new Element("keyid").setText(adatok.getKeyID()));
      key.addContent(new Element("it").setText(Integer.toString(adatok.getIt())));
      key.addContent(new Element("gen").setText(Integer.toHexString(adatok.getGen())));
      key.addContent(new Element("mod").setText(Integer.toHexString(adatok.getMod())));
      key.addContent(new Element("prekeyvalue").setText(Integer.toHexString(adatok.getPrekeyvalue())));

      doc.getRootElement().addContent(key);

      Element msgvalue = new Element("msgvalue");
      msgvalue.setText(adatok.getMsgvalue().toString(16));

      doc.getRootElement().addContent(msgvalue);

      XMLOutputter xmlOutput = new XMLOutputter();

      xmlOutput.setFormat(Format.getPrettyFormat());
      xmlOutput.output(doc, new FileWriter(filename));

      System.out.println("File Saved!");
    } catch (IOException io) {
      System.out.println(io.getMessage());
    }
  }
}