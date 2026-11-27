class MinStack {
    int data;
    int min;
    MinStack next ;

    MinStack head;
    public MinStack() {
        
    }
    
    public void push(int value) {        
        if(head == null){
            MinStack newNode = new MinStack();
            newNode.data = value;
            newNode.next = null;
            newNode.min = value;

            head = newNode;
        }else{
            MinStack newNode = new MinStack();
            newNode.data = value;
            newNode.next = head;
        
            if(head.min > value){
                newNode.min = value;
            }else{
                newNode.min = head.min;
            }

            head = newNode;
        }
    }

    public void pop() {
        if(head == null){
            return;
        }

        head = head.next;
    }
    
    public int top() {
        if (head == null) {
        throw new RuntimeException("Stack is empty");
        }

        return head.data;
    }
    
    public int getMin() {
        return head.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */