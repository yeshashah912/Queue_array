public class MyQueue {
		
	public String[] queue = new String[20];
	int size,front,rear;
	
    public void enqueue(String a)
    {
    	if(!isFull())
    	{
    	queue[rear]=a;
    	rear++;
    	size++;
    	}
    	else{
    		System.out.print("The queue is full!");
    	}
    }	
	public void dequeue() 
    {
    		String b = null;
			queue[front]=b;
			front++;
			size--;	
   }
    public void printQueue() {
    	System.out.println();
    
    	for(int i=0;i<size;i++)
    	{
    		System.out.print(queue[front+i]+ " ");
    	}
    }   
    public boolean isEmpty(){

        return getSize()==0;
    }
    private boolean isFull() {
		
		return getSize()==20;
	}

	private int getSize() {
	
		return size;
	}
public static void main(String args[])
{
	MyQueue Q=new MyQueue();
	
	Q.enqueue("This");
	Q.enqueue("is");
	Q.enqueue("an");
	Q.enqueue("Assignment");
	Q.enqueue("for");
	Q.enqueue("Queues");
	
	Q.dequeue();
	
	Q.printQueue();
	
	if(Q.isEmpty()){							//To print isEmpty comment enqueue method
		System.out.println("Queue is empty");
		
	}
	if(Q.isFull())
	{
		System.out.println();
		System.out.println("Queue is Full");
	}
	System.out.println();
	System.out.println("size:" + Q.getSize());
}


}
