package bimoku.realtimecrawler.queue;

import java.net.URL;
import java.util.LinkedList;

public class TitleQueue {

/**
* 
*/
//
private LinkedList<String> queue = new LinkedList<String>();
//�����
public void enQueue(String title) {
queue.addLast(title);
}
//������
public String deQueue() {
return queue.removeFirst();
}
//�ж϶����Ƿ�Ϊ��
public boolean isQueueEmpty() {
return queue.isEmpty();
}
//�ж϶����Ƿ��t
public boolean contians(URL t) {
return queue.contains(t);
}
public boolean empty() {
return queue.isEmpty();
}
}


