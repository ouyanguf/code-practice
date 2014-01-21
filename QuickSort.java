class QuickSort{
    public static void quickSort(int[] input){

        quickSort(input,0,input.length-1);

    }

    public static void quickSort(int[] input,int start,int end){
        int pivotIndex = partition(input,start,end);

        if(pivotIndex-1>start)
            quickSort(input,start,pivotIndex-1);
        if(pivotIndex<end)
            quickSort(input,pivotIndex,end);
        return;
    }

    public static int partition(int[] input,int start,int end){

        int pivot = input[(int)(start+end)/2];

        int left = start;
        int right = end;

        while(left<=right){
            while(input[left]<pivot)
                left++;
            while(input[right]>pivot)
                right--;
            //Swap
            if(left<=right){
                int temp = input[left];
                input[left] = input[right];
                input[right] = temp;
            }
            left++;
            right--;
        }
        return left;
    }

    public static void main(String[] args){
        int[] input = {0,9,1,4,2,3,8,5,7,1,0};
        quickSort(input);
        for(int i:input)
            System.out.println(i);
    }
}
