class Solution<T>{
    public static void main(String[] args){
        try{
            Solution<Integer> stack = new Solution<Integer>();
            stack.push(1,1);
            stack.push(2,0);
            int pop = stack.pop(1);
            System.out.println(pop);
            System.out.println(stack.pop(2));
            stack.pop(1);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    int eachSize = 100;
    T[] array = (T[])new Object[eachSize*3];
    int[] topPointer = {-1,-1,-1};

    public void push(int stackNum, T t) throws Exception{
        if(topPointer[stackNum]+1>eachSize)
            throw new Exception("Out of Space");
        topPointer[stackNum]++;
        array[absIndex(stackNum)]=t;
    }

    public T pop(int stackNum) throws Exception{
        if(topPointer[stackNum]==-1)
            throw new Exception("Poping empty stack");
        T val = array[absIndex(stackNum)];
        //array[absIndex(stackNum)] = 0;
        topPointer[stackNum]--;
        return val;
    }

    public int absIndex(int stackNum){
        return stackNum*eachSize+topPointer[stackNum];
    }
}
