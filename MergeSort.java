public class MergeSort{

    public static void mergeSort(int[] input){
        int[] temp = new int[input.length];
        mergeSort(intput,temp,0,input.length-1);
    }

    public static void mergerSort(int[] input,int[] temp,int start,int end){
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
        int right=mid;
        while(start<=mid&&right<=end){

        }
    }
}
