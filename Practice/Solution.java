package com.company.Practice;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public  static List<Boolean> camelMatch(String[] queries, String pattern)
    {
        List<Boolean> ans = new ArrayList<Boolean>();
        for(int i=0;i<queries.length;i++)
        {
            StringBuilder sb = new StringBuilder();
            int p=0;
            for(int j=0;j<queries[i].length();j++)
            {
                if(p<pattern.length())
                {
                    if(queries[i].charAt(j)==pattern.charAt(p))
                    {
                        sb.append(queries[i].charAt(j));
                        p++;
                    }
                    else
                    {
                        if(queries[i].charAt(j)>='A' && queries[i].charAt(j)<='Z')
                        {
                            //ans.add(i,false);
                            break;
                        }
                        else if(queries[i].charAt(j)>='a' && queries[i].charAt(j)<='z')
                        {
                            sb.append(queries[i].charAt(j));
                        }
                    }
                }
                else
                {
                    if(queries[i].charAt(j)>='A' && queries[i].charAt(j)<='Z')
                    {
                        //ans.add(i,false);
                        break;
                    }
                    else if(queries[i].charAt(j)>='a' && queries[i].charAt(j)<='z')
                    {
                        sb.append(queries[i].charAt(j));
                    }
                }
            }
            if(sb.toString().equals(queries[i]))
                ans.add(i,true);
            else
                ans.add(i,false);
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pattern="FB";
        System.out.println(camelMatch(queries,pattern));
    }
}

