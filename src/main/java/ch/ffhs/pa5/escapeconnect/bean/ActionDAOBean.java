/** Code has been formated */
/** @author Yvo von Kaenel */
package ch.ffhs.pa5.escapeconnect.bean;

public class ActionDAOBean {
  private int id = 0;
  private int panel_id;
  private String label;
  private String subtopic;
  private String payload;
  private String basetopic;
  private String deviceid;

  public ActionDAOBean() {
    super();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getPanel_id() {
    return panel_id;
  }

  public void setPanel_id(int panel_id) {
    this.panel_id = panel_id;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getBasetopic() {
    return basetopic;
  }

  public void setBasetopic(String basetopic) {
    this.basetopic = basetopic;
  }

  public String getDeviceid() {
    return deviceid;
  }

  public void setDeviceid(String deviceid) {
    this.deviceid = deviceid;
  }

  public String getSubtopic() {
    return subtopic;
  }

  public void setSubtopic(String topic) {
    this.subtopic = topic;
  }

  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }
}
