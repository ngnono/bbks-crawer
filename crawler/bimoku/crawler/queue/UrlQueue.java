package bimoku.crawler.queue;
import java.net.URL;
import java.util.LinkedList;


public class UrlQueue {

private LinkedList<String> queue = new LinkedList<String>();

public void enQueue(String t) {
queue.addLast(t);

}

public String deQueue() {
return queue.removeFirst();
}

public boolean isQueueEmpty() {
return queue.isEmpty();
}

public boolean contians(URL t) {
return queue.contains(t);
}
public boolean empty() {
return queue.isEmpty();
}
}
