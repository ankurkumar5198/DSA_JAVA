
class Main{
 

public static boolean check(int arr[], int n)
{
     
    int count = 0;
 
    int index = -1;
 
    for(int i = 1; i < n; i++)
    {
     
        if (arr[i - 1] >= arr[i])
        {
      
            count++;
 
            index = i;
        }
    }
 
    
    if (count > 1)
        return false;
 
    if (count == 0)
        return true;
 
    if (index == n - 1 || index == 1)
        return true;
 
   
    if (arr[index - 1] < arr[index + 1])
        return true;

    if (index - 2 >= 0 && arr[index - 2] < arr[index])
        return true;
       
      if(index < 0)
          return true;
 
    return false;
}
 
public static void main(String args[])
{
    int []arr = { 1, 2, 5, 3, 5 };
    int N = arr.length;
     
    if (check(arr, N))
        System.out.println("Yes");
    else
        System.out.println("No");

}
}

