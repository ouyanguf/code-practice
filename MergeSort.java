public class MergeSort{

    public static void mergeSort(int[] input){
        int[] temp = new int[input.length];
        mergeSort(input,temp,0,input.length-1);
    }

    public static void mergeSort(int[] input,int[] temp,int start,int end){
        if(start>=end)
            return;
        int mid = (start+end)/2;
        mergeSort(input,temp,start,mid);
        mergeSort(input,temp,mid+1,end);
        merge(input,temp,start,mid,end);
        return;
    }

    public static void merge(int[] input,int[] temp,int start,int mid,int end){
        for(int i=start;i<=end;i++){
            temp[i]=input[i];
        }
        int left =start;
        int right=mid+1;
        while(left<=mid&&right<=end){
            if(temp[left]<temp[right]){
                input[start] = temp[left];
                left++;
            }else{
                input[start] = temp[right];
                right++;
            }
            start++;
        }
        while(left<=mid){
            input[start] = temp[left];
            left++;
            start++;
        }
        return;
    }

    public static void main(String[] args){
        int[] input = {5,2,1,3,4,9,9,0,8,6,7};
        mergeSort(input);
        for(int i:input)
            System.out.println(i);
    }
}
