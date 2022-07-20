package collections.webService;

public class Request {
    String clientName;
    int priority;

    public Request(String clientName, int priority) {
        this.clientName = clientName;
        this.priority = priority;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Request{" +
                "clientName='" + clientName + '\'' +
                ", priority=" + priority +
                '}' + "\n";
    }
}
