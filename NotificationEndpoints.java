public class NotificationEndpoints {
    
    public int id;
    public String name;
    public String url;

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public String toString() {
        return "NotificationEndpoints [id=" + id + ", name=" + name + ", url=" + url + "]";
    }


    public NotificationEndpoints(int id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }


    public NotificationEndpoints() {
    }

    
    
}
