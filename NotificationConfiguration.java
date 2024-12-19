public class NotificationConfiguration {

   private int id;
   private String level;
   private String event;
   private NotificationConfiguration endpoints;

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getLevel() {
    return level;
}

public void setLevel(String level) {
    this.level = level;
}

public String getEvent() {
    return event;
}

public void setEvent(String event) {
    this.event = event;
}

public NotificationConfiguration getEndpoints() {
    return endpoints;
}

public void setEndpoints(NotificationConfiguration endpoints) {
    this.endpoints = endpoints;
}


}
