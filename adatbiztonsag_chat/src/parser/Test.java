package parser;
public class Test
{
  public static void main(String[] args)
  {
    XML_adatok adatok = new XML_adatok();

    Parse_from_XML from_XML = new Parse_from_XML();

    Parse_to_XML to_XML = new Parse_to_XML();

    adatok = from_XML.parse_in("XML.xml");
    to_XML.parse_out("new_xml.xml", adatok);
  }
}