package parser;
import java.math.BigInteger;

public class XML_adatok
{
  private String text;
  private String sync;
  private String keyID;
  private int it;
  private int gen;
  private int mod;
  private int prekeyvalue;
  private String subj;
  private BigInteger msgvalue;

  public String getText()
  {
    return this.text;
  }
  public void setText(String text) {
    this.text = text;
  }
  public String getSync() {
    return this.sync;
  }
  public void setSync(String sync) {
    this.sync = sync;
  }
  public String getKeyID() {
    return this.keyID;
  }
  public void setKeyID(String keyID) {
    this.keyID = keyID;
  }
  public int getIt() {
    return this.it;
  }
  public void setIt(int it) {
    this.it = it;
  }
  public int getGen() {
    return this.gen;
  }
  public void setGen(int gen) {
    this.gen = gen;
  }
  public int getMod() {
    return this.mod;
  }
  public void setMod(int mod) {
    this.mod = mod;
  }
  public int getPrekeyvalue() {
    return this.prekeyvalue;
  }
  public void setPrekeyvalue(int prekeyvalue) {
    this.prekeyvalue = prekeyvalue;
  }
  public String getSubj() {
    return this.subj;
  }
  public void setSubj(String subj) {
    this.subj = subj;
  }
  public BigInteger getMsgvalue() {
    return this.msgvalue;
  }
  public void setMsgvalue(BigInteger bigInteger) {
    this.msgvalue = bigInteger;
  }
}