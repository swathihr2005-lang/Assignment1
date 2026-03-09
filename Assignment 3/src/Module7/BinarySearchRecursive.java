
package Module7;
public class BinarySearchRecursive {

    static int search(int[] arr,int left,int right,int key){

        if(left <= right){

            int mid = (left+right)/2;

            if(arr[mid] == key)
                return mid;

            if(arr[mid] > key)
                return search(arr,left,mid-1,key);

            return search(arr,mid+1,right,key);
        }

        return -1;
    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};

        System.out.println(search(arr,0,arr.length-1,4));
    }
}

