package com.company;
import java.util.*;

public class AssignmentArray
{
    /*public static void main(String[] args) {
       int[] arr= {1,4,2,5,0,3};
       permutation(arr);
    }

    static void permutation(int[] arr)
    {
        int[] arr2 = new int[arr.length];
        for(int i =0;i<arr.length;i++)
        {
            int k= arr[i];
            arr2[i] = arr[k];
        }
        System.out.println(Arrays.toString(arr2));
    }*/
    /*public static void main(String[] args)
    {
        int[] nums = new int[4];
        Scanner in = new Scanner(System.in);
        for (int i =0;i<nums.length;i++)
        {
            nums[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(sol(nums)));
    }

    static int[] sol(int[] nums)
    {
        int[] arr = new int[2*nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int j=i+nums.length;
            arr[i]=nums[i];
            arr[j]=nums[i];
        }
        return arr;
    }*/

    /*public static void main(String[] args)
    {
        System.out.println("Enter Number of elements");
        Scanner in = new Scanner (System.in);
        int n= in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Numbers");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= in.nextInt();
        }
        System.out.println(Arrays.toString(sol(arr)));
    }

    static int[] sol(int[] arr)
    {
        int[] arr2 = new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
           arr2[i]=sum+arr[i];
           sum=sum+arr[i];
        }
        return arr2;
    }*/

    /*public static void main(String[] args)
    {
        System.out.println("Enter number of customer");
        Scanner in = new Scanner (System.in);
        int n= in.nextInt();
        int[][] arr = new int[n][n];
        for (int row=0;row<arr.length;row++)
        {
           System.out.println("Enter number of bank account");
            int b = in.nextInt();
            for(int col= 0; col<b;col++)
            {
               arr[row][col]=in.nextInt();
            }
        }

        int[] arr2= sol(arr);
        System.out.println("customer "+arr2[1]+" has more money of amount "+arr2[0]);
    }

    static int[] sol (int arr[][])
    {
        int sum=0,max=0,c=0;
        for (int row =0;row< arr.length;row++)
        {
            for (int col=0;col<arr[row].length;col++)
            {
                sum=sum + arr[row][col];
            }
            if (max<sum)
            {
                max=sum;
                sum=0;
                c=row;
            }
        }
        int[] arr2=new int[2];
        arr2[0]=max;
        arr2[1]=c;

        return arr2;
    }*/

    /*public static void main(String[] args)
    {

        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] arr = createTargetArray(nums,index);
        System.out.println(Arrays.toString(arr));
    }

    static int[] createTargetArray(int[] nums, int[] index)
    {
        ArrayList<Integer> target = new ArrayList<>(10);
        for(int i=0;i<nums.length;i++)
        {
            target.add(index[i],nums[i]);
        }
        int[] arr = new int[target.size()];
        for(int i=0;i<target.size();i++)
        {
            arr[i]=target.get(i);
        }
        return arr;
    }
*/

    /*public static void main(String[] args) {
       int[] candies= {2,8,7};
       int extraCandies = 1;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    static List<Boolean> kidsWithCandies (int[] candies, int extraCandies)
    {
        int max =0;
        ArrayList<Boolean> result = new ArrayList<>(4);
        for(int i=0;i<candies.length;i++)
        {
            int totalCandies = candies[i]+extraCandies;
            max=totalCandies;
            for (int j=0;j<candies.length;j++)
            {
                if (candies[j]>totalCandies)
                {
                    max=candies[j];
                }
            }
            if (max==totalCandies)
                result.add(i,true);
            else
                result.add(i,false);

        }
        return result;
    }*/

  /*  public static void main(String[] args) {
        String pangram = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(result(pangram));
    }

    static Boolean result (String str)
    {
        for (int i = 'a';i<='z';i++)
        {
            int count =0;
            for (int j=0;j<str.length();j++)
            {
                int alpha = str.charAt(j);
                if(alpha==i)
                    count ++;
            }
            if(count==0)
                return false;
        }
        return true;
    }*/

    /*  public static void main(String[] args)
    {
        List<List<String>>  items = new ArrayList<>();
        for (int i=0;i<3;i++) {
            items.add(new ArrayList<>());
        }
       // items.add(1,new ArrayList<String> (Arrays.asList("bg","gh")));

        items.get(0).add("phone");
        items.get(0).add("blue");
        items.get(0).add("pixel");

        items.get(1).add("computer");
        items.get(1).add("silver");
        items.get(1).add("lenovo");

        items.get(2).add("phone");
        items.get(2).add("gold");
        items.get(2).add("iphone");

        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(items);

        System.out.println(countMatches( items,ruleKey,ruleValue));
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue)
    {
        int i,count=0;
        switch(ruleKey)
        {
            case "type" :
            {
               i=0;
               break;
            }
            case "color" :
            {
                i=1;
                break;
            }
            case "name" :
            {
                i=2;
                break;
            }
            default :
                return -1;
        }

        for(int j=0;j< items.size();j++)
        {
           if (items.get(j).get(i) == ruleValue)
           count ++;
        }
        return count;
    }*/

    /*public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));

    }
    static int largestAltitude(int[] gain)
    {
        int max=0;
        ArrayList<Integer> altitude = new ArrayList<>(5);
        altitude.add(0);
        for(int i=0;i<gain.length;i++)
        {
            int newAltitude = gain[i]+altitude.get(i);
            altitude.add(i+1,newAltitude);
        }
        for(int i=0;i<altitude.size();i++)
        {
            if(max<altitude.get(i))
            {
                max=altitude.get(i);
            }
        }

        return max;
    }
*/

   /* public static void main(String[] args) {
        int[] arr = {2,4,6,12,56};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    static int[] reverse (int[] arr)
    {
        int temp, start=0,end=arr.length - 1;
       while(start<=end)
       {
           temp=arr[start];
           arr[start]= arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
        return arr;
    }*/

    /*public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        int[][] arr2  = transpose(arr);
        for (int i=0;i<arr2.length;i++)
        {
            System.out.println(Arrays.toString(arr2[i]));
        }
    }
    static int[][] transpose(int[][] matrix)
    {
        int[][] newMatrix = new int[matrix[0].length][matrix.length];
        for(int row=0;row<matrix.length;row++)
        {
            for(int col=0;col<matrix[row].length;col++)
            {
                newMatrix[col][row]=matrix[row][col];
            }
        }
        return newMatrix;
    }*/

   /* public static void main(String[] args) {
        int[] arr = {555,901,482,1771};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums)
    {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            int num = nums[i];
            int count=0;
            while(num>0)
            {
                num=num/10;
                count++;
            }
            if((count%2)==0)
                c=c+1;
        }
        return c;
    }*/

    /*public static void main(String[] args) {
        int[] arr ={9,9,9,9,9,9,9,9,9,9};
        int k=1;
        System.out.println(addToArrayForm(arr,k));
    }

    static List<Integer> addToArrayForm(int[] num, int k)
    {
        ArrayList<Integer> list = new ArrayList<>(3);
        long number =0;
        for(int i=0;i<num.length;i++)
        {
            number= (number*10)+num[i];
        }
        long finalNumber = number+k;
        while(finalNumber>0)
        {
            int r= (int) (finalNumber%10);
            list.add(0,r);
            finalNumber=finalNumber/10;
        }
        return list;
    }*/

   /* public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(3);
        list.add(23);
        list.add(13);
        list.add(33);
        list.add(43);
        System.out.println(list.size());

    }*/

    /*public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
    static int maxSubArray(int[] nums)
    {
        int sum=0,number=0,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int[] arr = {sum+nums[i],number+nums[i],nums[i]};
            int max1=arr[0];
            for(int j=1;j<3;j++)
            {
                if(max1<arr[j])
                    max1=arr[j];
            }
            if(max1==(sum+nums[i]))
            {
                sum=sum+nums[i];
                number=nums[i];
            }
            if(max1==(number+nums[i]) )
            {
                sum=number+nums[i];
                number=nums[i];
            }
            if(max1==nums[i])
            {
                sum=nums[i];
                number=nums[i];
            }
            if(max<sum)
                max=sum;
        }
        return max;
    }*/

    /*public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    static int[] plusOne(int[] digits)
    {
        ArrayList<Integer> list = new ArrayList<>(3);
        int n=1;
        for(int i=digits.length-1;i>=0;i--)
        {
            n=n+digits[i];
            list.add(n%10);
            n=n/10;
        }
        while(n!=0)
        {
            list.add(n%10);
            n=n/10;
        }
        System.out.println(list);
        Collections.reverse(list);
        int[] sol = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            sol[i]=list.get(i);
        }
        return sol;
    }*/

   /* public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(removeDuplicates(arr));
    }
    static int removeDuplicates(int[] nums)
    {
        ArrayList<Integer> sol = new ArrayList<>(3);
        sol.add(nums[0]);
        int pos=0;
        for(int i=1;i<nums.length;i++)
        {
            if(sol.get(pos)!=nums[i])
            {
                sol.add(nums[i]);
            }
        }
        return sol.size();
    }*/

    /*public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(arr));
    }
    static List<Integer> spiralOrder(int[][] matrix)
    {
        ArrayList<Integer> sol = new ArrayList<>(3);
        int row1=0,col1=matrix.length-1,row2=matrix.length-1,col2=0;
        while(row1<=row2 || col1<=col2 )
        {
            for(int i =row1;i<col1;i++)
            {
                sol.add(matrix[row1][i]);
            }
            for(int i=row1;i<row2;i++)
            {
                sol.add(matrix[i][col1]);
            }
            for(int i=row2;i>col2;i--)
            {
                sol.add(matrix[row2][i]);
            }

            for(int i=row2;i>row1;i--)
            {
                sol.add(matrix[i][col2]);
            }
            row1++;
            col1--;
            row2--;
            col2++;

        }
        return sol;
    }*/

    /*public static void main(String[] args) {
        int[] arr ={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
    static int removeDuplicates(int[] nums)
    {
        int i=0,j=1,temp,count=1;
        while(j<nums.length)
        {
            if(nums[j]!=nums[i])
            {
                temp=nums[i+1];
                nums[i+1]=nums[j];
                nums[j]=temp;
                i=i+1;
                j++;
                count++;
            }
            else
            j++;
        }
        return count;
    }*/

    /*public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}


        };
        System.out.println(spiral(matrix));
    }
    static ArrayList<Integer> spiral (int[][] matrix)
    {
        if(matrix.length==0)
            return null;
        ArrayList<Integer> answer = new ArrayList<>(3);
        int row1=0,row2=matrix.length-1,col1=matrix[0].length-1,col2=0;
        while(row1<row2 && col1>col2)
        {
           for(int i = col2;i<col1;i++)
               answer.add(matrix[row1][i]);
           for(int i=row1;i<row2;i++)
               answer.add(matrix[i][col1]);
            for(int i =col1;i>col2;i--)
                answer.add(matrix[row2][i]);
            for(int i=row2;i>row1;i--)
                answer.add(matrix[i][col2]);
            row1++;
            row2--;
            col1--;
            col2++;
        }
        int element = matrix.length*matrix[0].length;
        if( row1==row2 && col1!=col2)
        {
            for(int i = col2;i<=col1;i++)
                answer.add(matrix[row1][i]);
        }
       else if( col1==col2 && row1!=row2)
        {
            for(int i=row1;i<=row2;i++)
                answer.add(matrix[i][col1]);
        }
        else if(col1==col2 && row1==row2)
            answer.add(matrix[row1][col1]);

        return answer;

    }*/

    /*public static void main(String[] args)
    {
        int n=1;
      for(int i=0;i<n;i++)
      {
          System.out.println(Arrays.toString(generateMatrix(n)[i]));
      }
    }
    static int[][] generateMatrix(int n)
    {
        if(n==0)
            return null;
        if(n==1)
            return new int[][] {{1}};
        int[][] matrix = new int[n][n];
        int element= n*n,number=1;
        int row1=0,row2=n-1,col1=n-1,col2=0;
        while(row1<row2 && col1>col2&& number<=element)
        {
            for(int i=col2;i<col1;i++)
            {
                matrix[row1][i]=number;
                number++;
            }
            for(int i=row1;i<row2;i++)
            {
                matrix[i][col1]=number;
                number++;
            }
            for(int i=col1;i>col2;i--)
            {
                matrix[row2][i]=number;
                number++;
            }
            for(int i=row2;i>row1;i--)
            {
                matrix[i][col2]=number;
                number++;
            }
            row1++;
            col1--;
            row2--;
            col2++;

        }
        if(element%2!=0 && number<=element)
            matrix[row1][col1]=number;

        return matrix;
    }*/

    /*public static void main(String[] args) {
        int rows=5,cols=6,rStart=1,cStart=4;
        int[][] arr = spiralMatrixIII(rows,cols,rStart,cStart);
        for (int i=0;i<arr.length;i++)
            System.out.println(Arrays.toString(arr[i]));
    }

    static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart)
    {
        int[][] answer = new int[rows*cols][2];

        int radius =1,pos=1;
        answer[0][0]=rStart;
        answer[0][1]=cStart;

        int row1,row2,col1,col2;
        row1=rStart;
        col2=cStart;
        row2=row1+radius;
        col1=col2+radius;

        boolean con = true;

        while(con)
        {
            for(int i = col2;i<col1;i++)
            {
                if(row1<rows && i<cols && i>=0 && row1>=0)
                {
                    answer[pos][0]=row1;
                    answer[pos][1]=i;
                    pos++;
                }

            }
            if(pos==answer.length-1)
            {
                con=false;
                break;
            }
            for(int i=row1;i<row2;i++)
            {
                if(col1<cols && i<rows && i>=0 && col1>=0)
                {
                    answer[pos][0]=i;
                    answer[pos][1]=col1;
                    pos++;
                }
            }


            radius++;
            col2=col1-radius;
            row1=row2+radius;

            for(int i =col1;i>col2;i--)
            {
                if(row2<rows && i<cols && i>=0 && row2>=0)
                {
                    answer[pos][0]=row2;
                    answer[pos][1]=i;
                    pos++;
                }
            }


            for(int i=row2;i>row1;i--)
            {
                if(col2<cols && i<rows && i>=0 && col2>=0)
                {
                    answer[pos][0]=i;
                    answer[pos][1]=col2;
                    pos++;
                }
            }


            radius++;
            col1=col2+radius;
            row2=row1-radius;
            if(pos==answer.length-1)
            {
                con=false;
            }
        }
        return answer;
    }*/

    /*public static void main(String[] args)
    {
        int[][] matrix= {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
     setZeroes(matrix);

     for (int i=0;i<matrix.length;i++)
     {
         System.out.println(Arrays.toString(matrix[i]));
     }
    }

    static void setZeroes(int[][] matrix)
    {
        ArrayList<Integer> col_list = new ArrayList<>(3);
        ArrayList<Integer> row_list = new ArrayList<>(3);
        for(int row=0;row<matrix.length;row++)
        {
            for(int col=0;col<matrix[row].length;col++)
            {
                if(matrix[row][col]==0)
                {
                    if(check_row(row_list,row))
                        row_list.add(row);
                    if(check_col(col_list,col))
                        col_list.add(col);
                }
            }
        }
        System.out.println(row_list);
        System.out.println(col_list);

        for(int i=0;i<row_list.size();i++)
        {
            set_row(matrix,i);
        }
        for(int i=0;i<col_list.size();i++)
        {
            set_col(matrix,i);
        }
    }
    static boolean check_col(ArrayList<Integer> col_list,int col)
    {
        for(int i=0;i<col_list.size();i++)
        {
            if(col==col_list.get(i))
                return false;
        }
        return true;
    }
    static boolean check_row (ArrayList<Integer> row_list,int row)
    {
        for(int i=0;i<row_list.size();i++)
        {
            if(row==row_list.get(i))
                return false;
        }
        return true;
    }

    static void set_col (int[][] matrix,int col)
    {
        int r=0;
        while(r<matrix.length)
        {
            matrix[r][col]=0;
            r++;
        }
    }

    static void set_row (int[][] matrix,int row)
    {
        int c=0;
        while(c<matrix[row].length)
        {
            matrix[row][c]=0;
            c++;
        }
    }*/

    /*public static void main(String[] args) {
        int[] check = {1,2,3};
        System.out.println(canJump(check));
        int[] arr = new int[4];
        int i=5;

        ArrayList<Integer> xy = new ArrayList<Integer>(3);
        xy.add(23);
        xy.add(45);
        xy.add(57);
        xy.add(11);

        System.out.println(Arrays.toString(arr));
        System.out.println(i+2);
    }

    static boolean canJump(int[] nums)
    {
        if(nums.length==1)
            return true;
        boolean[] check = new boolean[nums.length];
        int jump,nxt_idx,i=0;
        while(i<nums.length && check[i]==false)
        {
            jump=nums[i];
            nxt_idx=i+jump;
            check[i]=true;
            while(nxt_idx<nums.length && check[nxt_idx]==false )
            {
                if(nxt_idx==nums.length-1)
                    return true;
                else
                {
                    jump=nums[nxt_idx];
                    nxt_idx=nxt_idx+jump;
                }

            }
            i++;
        }
        return false;
    }*/

    /*public static void main(String[] args)
    {
        int[] numbers ={2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
    static int binarySearch(int[] numbers,int start,int end,int target)
    {
        int mid=start+(end-start)/2;
        while(start<=end)
        {
            if(numbers[mid]<target)
                start=mid+1;
            else if(numbers[mid]>target)
                end=mid-1;
            else
                return mid;
        }
        return -1;
    }
    static int[] twoSum(int[] numbers, int target)
    {
        int index=0;
        while(numbers[index]<numbers[numbers.length-1] && numbers[index]<target)
        {
            int diff = target-numbers[index];
            if(binarySearch(numbers,index,end,diff)!=-1)
                return new int[] {index,binarySearch(numbers,index,end,diff)};
            else
                index++;
        }
        return new int[] {-1,-1};
    }*/

    /*public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(arr,target));
    }
    static int searchInsert(int[] nums, int target)
    {
        int start=0,end=nums.length-1,mid;
        while(start<end)
        {
            mid=start+(end-start)/2;
            if(nums[mid]<target)
                start=mid;
            else if(nums[mid]>target)
                end=mid;
            else
                return mid;
        }
        if(nums[start]>target)
            return start;
        else if (nums[start]<target)
            return start+1;
        return start;

    }*/

    /*public static void main(String[] args) {
        int[] arr = {0,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr)
    {
        for(int i=0;i<arr.length-2;i++)
        {
            if(arr[i]>arr[i+1])
                return i;
        }
        return arr.length-1;
    }*/

   /* public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<> (3);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

    }*/

   /* public static void main(String[] args)
    {
        int[] num1 = {4,9,5};
        int[] num2 = {};
        System.out.println(Arrays.toString(intersection(num1,num2)));
    }
    static boolean binarySearch(int[] arr,int target)
    {
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid=start+ (end-start)/2;
            if(arr[mid]<target)
                start=mid+1;
            else if(arr[mid]>target)
                end=mid-1;
            else
                return true;
        }
        return false;
    }
    static int[] intersection(int[] nums1, int[] nums2)
    {
        boolean check;
        ArrayList<Integer> list = new ArrayList<> (3);
        if(nums1.length>=nums2.length)
        {
            for(int i=0;i<nums1.length;i++)
            {
                check=binarySearch(nums2,nums1[i]);
                if(check)
                    list.add(nums1[i]);
            }
        }
        else if(nums1.length<nums2.length)
        {
            for(int i=0;i<nums2.length;i++)
            {
                check=binarySearch(nums1,nums2[i]);
                if(check)
                    list.add(nums2[i]);
            }
        }

        for(int j=0;j<list.size();j++)
        {
            int k=0;
            while(k<list.size())
            {
                if(j!=k && list.get(j)==list.get(k))
                {
                    list.remove(k);
                    k++;
                }
                else
                    k++;
            }
        }
        int[] sol = new int[list.size()];
        for(int l=0;l<list.size();l++)
        {
            sol[l]=list.get(l);
        }
        return sol;
    }*/

    public static void main(String[] args) {
        System.out.println(10/0);
    }










}

